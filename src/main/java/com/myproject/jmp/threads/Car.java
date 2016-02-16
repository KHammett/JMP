package com.myproject.jmp.threads;

import com.google.common.base.Stopwatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by firel on 16.02.2016.
 */
public class Car extends Thread {

    private static final long MAX_DISTANCE = 10000;

    private CountDownLatch countDownLatch;
    private Stopwatch stopwatch;

    private Logger log = LogManager.getLogger(getClass());

    private long friction;
    private long distance;
    private String name;
    private long elapsedTime;
    private boolean isInterrupted;

    public Car(String name, long friction, CountDownLatch cdl) {
        this.name = name;
        this.friction = friction;
        this.countDownLatch = cdl;
        this.stopwatch = Stopwatch.createUnstarted();
        this.isInterrupted = false;
    }

    public void run() {
        stopwatch.start();
        try {
            while (distance < MAX_DISTANCE) {
                Thread.sleep(friction);
                distance += 100;
                log.info(name + " " + distance);
            }
        } catch (InterruptedException e) {
            isInterrupted = true;
            log.error("Car " + name + " disqualified");
        }
        countDownLatch.countDown();
        stopwatch.stop();
        elapsedTime = stopwatch.elapsed(TimeUnit.MILLISECONDS);
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    @Override
    public boolean isInterrupted() {
        return isInterrupted;
    }

    @Override
    public String toString() {
        return "Car{" +
                "friction=" + friction +
                ", name='" + name + '\'' +
                ", elapsedTime=" + elapsedTime +
                ", isInterrupted=" + isInterrupted +
                '}';
    }
}
