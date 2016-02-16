package com.myproject.jmp.threads;

import com.google.common.base.Stopwatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by firel on 16.02.2016.
 */
public class Runner {


    public static void main(String[] args) throws InterruptedException {
        Logger log = LogManager.getLogger(Runner.class);
        String[] carNames = new String[]{"Volvo", "Nissan", "Renault", "Opel", "Mazda", "BMW"};
        List<Car> cars = new ArrayList<Car>();
        int max = 100;
        int min = 50;
        CountDownLatch countDownLatch = new CountDownLatch(carNames.length);
        for (String carName : carNames) {
            Car car = new Car(carName, new Random().nextInt(max - min + 1) + min, countDownLatch);
            cars.add(car);
        }
        for (Car car : cars) {
            car.start();
        }
        try {
            Thread.sleep(5000);
            cars.get(new Random().nextInt(cars.size() - 1)).interrupt();
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Car winner = null;
        long time = 0;
        for (Car car : cars) {
            log.info(car);
            if (!car.isInterrupted() && (time == 0 || time > car.getElapsedTime())) {
                time = car.getElapsedTime();
                winner = car;
            }
        }
        log.info("Winner is:" + winner);
    }
}
