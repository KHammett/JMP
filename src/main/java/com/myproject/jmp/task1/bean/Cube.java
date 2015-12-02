package com.myproject.jmp.task1.bean;

/**
 * Cube figure class
 */
public class Cube extends Cuboid {

    public Cube(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getVolume() throws ArithmeticException {
        if ((!length.equals(width)) || (!width.equals(height))) {
            throw new ArithmeticException("Figure isn't cube");
        }
        return super.getVolume();
    }

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
