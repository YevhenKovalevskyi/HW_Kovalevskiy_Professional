package com.cbsystematics.homeworks.hw15.task2;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Main Class represents homework #15 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        IntStream.range(1, 11).forEach(list::add);
    
        System.out.printf("\nSum of squares of list items is: %d\n\n",
                list.stream().map(item -> Math.pow(item, 2)).reduce(0.0, Double::sum).intValue()
        );
    }
}
