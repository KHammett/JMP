package com.myproject.jmp.task1;

import com.myproject.jmp.task1.bean.AbstractVolumetricFigure;
import com.myproject.jmp.task1.bean.Cube;
import com.myproject.jmp.task1.bean.Cuboid;
import com.myproject.jmp.task1.bean.Sphere;
import com.myproject.jmp.task1.manager.VolumeCalculateManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class
 */
public class Runner {
    public static void main(String[] args) {
        List<AbstractVolumetricFigure> complexFigure = new ArrayList<AbstractVolumetricFigure>();
        complexFigure.add(new Cube(2.0, 2.0, 2.0));
        complexFigure.add(new Sphere(3.1));
        complexFigure.add(new Cuboid(1.1, 2.2, 3.3));
        try {
            Double volume = VolumeCalculateManager.getVolumeOfComplexFigure(complexFigure);
            System.out.printf("Total volume=%.4f\n", volume);
        } catch (ArithmeticException ae) {
            System.out.println("Can't calculate the volume. Reason:" + ae.getMessage());
        }
    }
}
