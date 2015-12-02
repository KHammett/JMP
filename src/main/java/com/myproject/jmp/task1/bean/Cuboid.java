package com.myproject.jmp.task1.bean;

import com.myproject.jmp.task1.manager.Util;

/**
 * Cuboid figure class
 */
public class Cuboid implements AbstractVolumetricFigure {
    protected Double length;
    protected Double width;
    protected Double height;

    public Cuboid() {
    }

    public Cuboid(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getVolume() throws ArithmeticException {
        Util.checkValues(length, width, height);
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
