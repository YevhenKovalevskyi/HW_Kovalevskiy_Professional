package com.cbsystematics.homeworks.hw02.task2;

import com.cbsystematics.homeworks.hw02.task2.services.CollectionService;
import com.cbsystematics.homeworks.hw02.task2.services.ConsoleService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Main Class represents homework #2 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    private static final int MAXIMUM_STRINGS = 5;
    
    public static void main(String[] args) {
        runConsoleWorker();
    }
    
    /**
     * The method takes the input from the console, run worker and print information
     */
    public static void runConsoleWorker() {
        System.out.println("-> Hello! This is a simple worker runner.");
        System.out.println("-> You can type any string. Maximum number of strings is 5.");
        System.out.println("-> If you want to exit this program - type \"exit\" !\n");
        
        Scanner in = new Scanner(System.in);
    
        boolean next;
        String consoleString;
        ArrayList<String> stringsList = new ArrayList<>();
        
        do {
            consoleString = ConsoleService.getConsoleStringData(in);
            next = ConsoleService.getConsoleNextData(in);

            stringsList.add(consoleString);
        } while (next && stringsList.size() < Main.MAXIMUM_STRINGS);
        
        in.close();
    
        System.out.println();
        
        if (stringsList.isEmpty()) {
            System.out.println("-> The list is empty! And what to print then?\n");
            System.exit(0);
        }
    
        CollectionService.doubleValues(stringsList);
    
        AtomicInteger counter = new AtomicInteger(1);
        stringsList.forEach(item -> System.out.printf("-> %d. %s\n", counter.getAndIncrement(), item));
    }
}

/*
 - надеюсь я правильно понял задание(почему не написать просто "продублируйте элементы списка" ?)
 - я немного не понимаю как работает вот это CollectionService.doubleValues(stringsList);
   без return ??? Это потому, что мы работаем со ссылкой ???
*/