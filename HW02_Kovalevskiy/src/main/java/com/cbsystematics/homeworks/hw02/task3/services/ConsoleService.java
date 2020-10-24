package com.cbsystematics.homeworks.hw02.task3.services;

import com.cbsystematics.homeworks.hw02.task3.helpers.ScannerHelper;

import java.util.Scanner;

/**
 * ConsoleService Class represents methods for getting data from the console
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class ConsoleService {
    
    /**
     * The method takes, validates and returns number data from the console
     *
     * @param in Scanner instance
     * @return integer console data
     */
    public static int getConsoleNumberData(Scanner in) {
        boolean isCorrectInt;
        int number = 0;
        
        do {
            System.out.print("-> Enter a number: ");
            isCorrectInt = in.hasNextInt();
            
            if (isCorrectInt) {
                number = in.nextInt();
                System.out.println("-> OK!");
            } else {
                if (in.next().equals("exit")) {
                    ScannerHelper.runExitFull(in);
                }
                
                System.out.println("-> NOT OK! Number is incorrect!");
                in.nextLine();
            }
        } while (!isCorrectInt);
        
        return number;
    }
    
    /**
     * The method takes, validates and returns number data from the console with condition
     *
     * @param in Scanner instance
     * @return integer console data
     */
    public static int getConsoleNumberDataExtra(Scanner in) {
        boolean isCorrectInt;
        int number = 0;
        
        do {
            System.out.print("-> Enter list length: ");
            isCorrectInt = in.hasNextInt();
            
            if (isCorrectInt) {
                number = in.nextInt();
    
                if (number > 0) {
                    System.out.println("-> done!\n");
                } else {
                    isCorrectInt = false;
                    System.out.println("-> NOT OK! List length is incorrect.");
                }
            } else {
                if (in.next().equals("exit")) {
                    ScannerHelper.runExitFull(in);
                }
                
                System.out.println("-> NOT OK! List length is incorrect!");
                in.nextLine();
            }
        } while (!isCorrectInt);
        
        return number;
    }
}
