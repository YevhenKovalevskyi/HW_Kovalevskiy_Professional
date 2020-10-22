package com.cbsystematics.homeworks.hw03.task2;

import com.cbsystematics.homeworks.hw03.task2.services.ConsoleService;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Main Class represents homework #3 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        HashMap<String, String> citizens = new HashMap<>();
        citizens.put("Moscow", "Surname1");
        citizens.put("Kiev", "Surname2");
        citizens.put("London", "Surname3");
        citizens.put("Berlin", "Surname4");
        citizens.put("Krakow", "Surname5");
        citizens.put("Vienna", "Surname6");
        citizens.put("Minsk", "Surname7");
        
        runConsoleWorker(citizens);
    }
    
    /**
     * The method takes the input from the console, run worker and print information
     */
    public static void runConsoleWorker(HashMap<String, String> citizens) {
        System.out.println("-> Hello! This is a simple worker runner.");
        System.out.println("-> You can find out citizen Surname by City.");
        System.out.println("-> If you want to exit this program - type \"exit\" !\n");
        System.out.printf("-> Possible cities: %s\n\n", citizens.keySet());
        
        Scanner in = new Scanner(System.in);
        
        String city, surname;
        boolean next;
        
        do {
            city = ConsoleService.getConsoleCityData(in);
            
            if ((surname = citizens.get(city)) != null) {
                System.out.println("-> " + surname);
            } else {
                System.out.printf("-> There is no citizens in \"%s\"\n", city);
            }
    
            next = ConsoleService.getConsoleNextData(in);
        } while (next);
        
        in.close();
    }
}
