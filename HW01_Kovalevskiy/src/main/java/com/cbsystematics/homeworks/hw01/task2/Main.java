package com.cbsystematics.homeworks.hw01.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;

/**
 * Main Class represents homework #1 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        IntStream.range(0, 10).forEach(list::add);
    
        Iterator<Integer> iterator = list.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
