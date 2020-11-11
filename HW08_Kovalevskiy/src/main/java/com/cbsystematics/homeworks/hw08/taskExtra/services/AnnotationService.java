package com.cbsystematics.homeworks.hw08.taskExtra.services;

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
    
    public static void runAnnotatedMethod(
            Object object,
            Class<? extends Annotation> annotationWrapper,
            Class<? extends Annotation> annotationClass
    ) {
        try {
            Method[] methods = object.getClass().getDeclaredMethods();
            
            if (methods.length > 0) {
                for (Method method: methods) {
                    method.setAccessible(true);

                    if (method.isAnnotationPresent(annotationWrapper)) {
                        Annotation[] annotations = method.getAnnotationsByType(annotationClass);
    
                        if (annotations.length > 0) {
                            for (Annotation annotation: annotations) {
                                ArrayList<Object> arguments = new ArrayList<>();
            
                                for (Method mth : annotation.annotationType().getDeclaredMethods()) {
                                    arguments.add(mth.invoke(annotation, (Object[]) null));
                                }
            
                                method.invoke(object, arguments.get(0), arguments.get(1));
                            }
                        }
                    }
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
