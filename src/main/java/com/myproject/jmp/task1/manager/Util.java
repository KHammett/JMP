package com.myproject.jmp.task1.manager;

/**
 * Util class
 */
public class Util {
    public static void checkValues(Double... values) throws ArithmeticException {
        for (Double value : values) {
            if (value <= 0) {
                throw new ArithmeticException("Some of arguments equals or below 0.");
            }
        }
    }
}
