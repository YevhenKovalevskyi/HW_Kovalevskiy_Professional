package com.cbsystematics.homeworks.hw06.taskExtra;

import com.cbsystematics.homeworks.hw06.taskExtra.services.ConsoleService;

import java.util.Scanner;

/**
 * Main Class represents homework #6 #taskExtra
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
        System.out.println("-> Hello! This is a simple authorization script.");
        System.out.println("-> You must enter \"Login\" and \"Password\".");
        System.out.println("-> Allowed characters for \"Login\" are Latin symbols.");
        System.out.println("-> Allowed characters for \"Password\" are Latin symbols and numbers.");
        System.out.println("-> If you want to exit this program - enter \"exit\" !\n");
        
        Scanner in = new Scanner(System.in);
        
        String login = ConsoleService.getConsoleLoginData(in);
        String password = ConsoleService.getConsolePasswordData(in);
        
        in.close();
        
        System.out.printf("User login: %s\nUser password: %s\n\n", login, password);
    }
}
