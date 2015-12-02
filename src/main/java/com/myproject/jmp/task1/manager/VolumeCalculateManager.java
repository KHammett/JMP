package com.myproject.jmp.task1.manager;

import com.myproject.jmp.task1.bean.AbstractVolumetricFigure;

import java.util.List;

/**
 * Volume calculator
 */
public class VolumeCalculateManager {
    public static Double getVolumeOfComplexFigure(List<AbstractVolumetricFigure> complexFigure) throws ArithmeticException {
        Double totalVolume = 0.0;
        for (AbstractVolumetricFigure figure : complexFigure) {
            System.out.println("Figure is " + figure);
            Double volume = figure.getVolume();
            System.out.printf("Volume=%.4f\n", volume);
            totalVolume += figure.getVolume();
        }
        return totalVolume;
    }
}
