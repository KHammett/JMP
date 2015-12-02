package com.myproject.jmp.task1.bean;

import com.myproject.jmp.task1.manager.Util;

/**
 * Sphere figure class
 */
public class Sphere implements AbstractVolumetricFigure {
    private Double radius;

    public Sphere(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getVolume() throws ArithmeticException {
        Util.checkValues(radius);
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
