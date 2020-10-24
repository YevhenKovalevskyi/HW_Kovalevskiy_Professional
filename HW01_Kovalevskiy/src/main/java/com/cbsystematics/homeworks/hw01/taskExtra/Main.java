package com.cbsystematics.homeworks.hw01.taskExtra;

import java.util.Arrays;

/**
 * Main Class represents homework #1 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        Car car1 = new Car("modelA", "colorA", 25, 1000);
        Car car2 = new Car("modelB", "colorB", 25, 1000);
        Car car3 = new Car("modelB", "colorC", 25, 1000);
        Car car4 = new Car("modelA", "colorA", 25, 1000);

        Car[] cars = {car1, car2, car3, car4};
    
        Arrays.stream(cars).sorted().forEach(System.out::println);
    }
}

/*
 - tests exists
 */