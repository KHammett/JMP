package com.myproject.jmp.task3.singleton;

/**
 * Created by firel on 17.12.2015.
 */
public class Superman {

    private Superman() {

    }

    public static class SupermanCreator {
        private static Superman superman = new Superman();

        public static Superman getSuperman() {
            return SupermanCreator.superman;
        }
    }
}
