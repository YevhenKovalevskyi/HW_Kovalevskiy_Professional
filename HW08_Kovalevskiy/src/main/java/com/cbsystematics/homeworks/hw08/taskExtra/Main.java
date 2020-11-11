package com.cbsystematics.homeworks.hw08.taskExtra;

import com.cbsystematics.homeworks.hw08.taskExtra.annotations.Math;
import com.cbsystematics.homeworks.hw08.taskExtra.annotations.Maths;
import com.cbsystematics.homeworks.hw08.taskExtra.objects.SumObject;
import com.cbsystematics.homeworks.hw08.taskExtra.services.AnnotationService;

/**
 * Main Class represents homework #8 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        AnnotationService.runAnnotatedMethod(new SumObject(), Maths.class, Math.class);
    }
}
