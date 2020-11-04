package com.cbsystematics.homeworks.hw15.taskExtra;

/**
 * Main Class represents homework #15 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.printf("10 add 14 = %.2f\n", Calculator.add().calculate(10, 14));
        System.out.printf("10 sub 14 = %.2f\n", Calculator.sub().calculate(10, 14));
        System.out.printf("10 mul 14 = %.2f\n", Calculator.mul().calculate(10, 14));
        System.out.printf("14 div 10 = %.2f\n", Calculator.div().calculate(14, 10));
        System.out.printf("14 mod 10 = %.2f\n", Calculator.mod().calculate(14, 10));
        System.out.printf("13 pow 3  = %.2f\n", Calculator.pow().calculate(13, 3));
    }
}
