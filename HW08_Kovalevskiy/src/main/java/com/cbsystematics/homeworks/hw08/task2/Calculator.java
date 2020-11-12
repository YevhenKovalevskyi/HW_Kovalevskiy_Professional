package com.cbsystematics.homeworks.hw08.task2;

import com.cbsystematics.homeworks.hw08.task2.annotations.CalculateDescriptor;
import com.cbsystematics.homeworks.hw08.task2.services.AnnotationService;

import java.util.ArrayList;

/**
 * Calculator Class represents simple arithmetic calculation
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Calculator {
    
    public Calculator() {
    
    }
    
    /**
     * The method calculates the result of summing the arguments
     * and print the result
     */
    @CalculateDescriptor()
    public static void add() {
        ArrayList<Integer> arguments = AnnotationService.getAnnotationArguments("add", CalculateDescriptor.class);
        
        try {
            System.out.println(Math.addExact(arguments.get(0), arguments.get(1)));
        } catch (IndexOutOfBoundsException ex) {
            ex.getStackTrace();
        }
    }
    
    /**
     * The method calculates the result of subtracting the arguments
     * and print the result
     */
    @CalculateDescriptor(param1=2, param2=5)
    public static void sub() {
        ArrayList<Integer> arguments = AnnotationService.getAnnotationArguments("sub", CalculateDescriptor.class);
        
        try {
            System.out.println(Math.subtractExact(arguments.get(0), arguments.get(1)));
        } catch (IndexOutOfBoundsException ex) {
            ex.getStackTrace();
        }
    }
    
    /**
     * The method calculates the result of multiplying the arguments
     * and print the result
     */
    @CalculateDescriptor(param1=2, param2=5)
    public static void mul() {
        ArrayList<Integer> arguments = AnnotationService.getAnnotationArguments("mul", CalculateDescriptor.class);
        
        try {
            System.out.println(Math.multiplyExact(arguments.get(0), arguments.get(1)));
        } catch (IndexOutOfBoundsException ex) {
            ex.getStackTrace();
        }
    }
    
    /**
     * The method calculates the result of dividing the arguments
     * and print the result
     */
    @CalculateDescriptor(param1=5, param2=2)
    public static void div() {
        ArrayList<Integer> arguments = AnnotationService.getAnnotationArguments("div", CalculateDescriptor.class);

        try {
            System.out.println(Math.floorDiv(arguments.get(0), arguments.get(1)));
        } catch (IndexOutOfBoundsException ex) {
            ex.getStackTrace();
        }
    }
    
    /**
     * The method calculates the result of exponentiation of arguments
     * and print the result
     */
    @CalculateDescriptor(param1=5, param2=2)
    public static void pow() {
        ArrayList<Integer> arguments = AnnotationService.getAnnotationArguments("pow", CalculateDescriptor.class);

        try {
            System.out.println(Math.pow(arguments.get(0), arguments.get(1)));
        } catch (IndexOutOfBoundsException ex) {
            ex.getStackTrace();
        }
    }
    
    /**
     * The method calculates the remainder after division of the arguments.
     * and print the result
     */
    @CalculateDescriptor(param1=5, param2=2)
    public static void mod() {
        ArrayList<Integer> arguments = AnnotationService.getAnnotationArguments("mod", CalculateDescriptor.class);

        try {
            System.out.println(Math.floorMod(arguments.get(0), arguments.get(1)));
        } catch (IndexOutOfBoundsException ex) {
            ex.getStackTrace();
        }
    }
}
