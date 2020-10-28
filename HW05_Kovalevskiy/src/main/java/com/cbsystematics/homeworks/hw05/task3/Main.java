package com.cbsystematics.homeworks.hw05.task3;

import java.util.Arrays;

/**
 * Main Class represents homework #5 #task3
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        String text = "Объекты String являются неизменяемыми, поэтому все операции, которые изменяют строки, фактически приводят к созданию новой строки, что сказывается на производительности приложения.";
        
        int middle = text.length() / 2;
    
        System.out.println("-> Original:");
        System.out.println(text);
        
        String[] textParts = new String[] {text.substring(0, middle), text.substring(middle)};
        System.out.println("\n-> Split:");
        Arrays.asList(textParts).forEach(System.out::println);
        
    }
}
