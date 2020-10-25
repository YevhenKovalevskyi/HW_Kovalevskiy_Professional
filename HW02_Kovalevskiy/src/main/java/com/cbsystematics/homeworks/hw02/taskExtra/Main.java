package com.cbsystematics.homeworks.hw02.taskExtra;

import com.cbsystematics.homeworks.hw02.taskExtra.services.ConsoleService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Main Class represents homework #2 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        runConsoleWorker();
    }
    
    /**
     * The method takes the input from the console, run worker and print information
     */
    public static void runConsoleWorker() {
        System.out.println("-> Hello! This is a simple worker runner.");
        System.out.println("-> You can type any string except \"end\".");
        System.out.println("-> When you type \"end\" the program will print all previous strings.");
        System.out.println("-> If you want to exit this program - type \"exit\" !\n");
        
        Scanner in = new Scanner(System.in);
    
        boolean rotate;
        String consoleString;
        ArrayList<String> stringsList = new ArrayList<>();
        
        do {
            consoleString = ConsoleService.getConsoleStringData(in);
            
            if (rotate = ConsoleService.checkForEnd(consoleString)) {
                stringsList.add(consoleString);
            }
        } while (rotate);
        
        in.close();
    
        System.out.println();
        
        if (stringsList.isEmpty()) {
            System.out.println("-> The list is empty! And what to print then?\n");
            System.exit(0);
        }
    
        AtomicInteger counter = new AtomicInteger(1);
        stringsList.forEach(item -> System.out.printf("-> %d. %s\n", counter.getAndIncrement(), item));
    }
}
