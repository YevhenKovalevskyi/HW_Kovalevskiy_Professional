package com.cbsystematics.homeworks.hw08.task2.services;

import com.cbsystematics.homeworks.hw08.task2.Calculator;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * AnnotationService Class is a service class for different work with annotations
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class AnnotationService {
    
    /**
     * The method extracts arguments of annotation.
     *
     * @param methodName
     * @param annotationClass
     * @return arguments of annotation
     */
    public static ArrayList<Integer> getAnnotationArguments(String methodName, Class<? extends Annotation> annotationClass) {
        ArrayList<Integer> arguments = new ArrayList<>();
        
        try {
            Method method = Calculator.class.getDeclaredMethod(methodName);
            method.setAccessible(true);
            
            if (method.isAnnotationPresent(annotationClass)) {
                Annotation annotation = method.getAnnotation(annotationClass);
                
                for (Method mth: annotation.annotationType().getDeclaredMethods()) {
                    arguments.add((Integer) mth.invoke(annotation, (Object[]) null));
                }
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        
        return arguments;
    }
}
