package com.cbsystematics.homeworks.hw02.task2.services;

import com.cbsystematics.homeworks.hw02.task2.helpers.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * ConsoleService Class represents methods for getting data from the console
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class ConsoleService {
   
    /**
     * The method takes, validates and returns string data from the console
     *
     * @param in Scanner instance
     * @return string console data
     */
    public static String getConsoleStringData(Scanner in) {
        boolean isCorrectString;
        String string;
        
        do {
            System.out.print("-> Input string: ");
            isCorrectString = in.hasNext(Pattern.compile("[a-zA-Z -]+"));
    
            string = in.nextLine();
    
            if (string.equals("exit")) {
                ScannerHelper.runExitFull(in);
            }
            
            if (isCorrectString) {
                System.out.println("-> OK!");
            } else {
                System.out.println("-> NOT OK! String is incorrect!");
            }
        } while (!isCorrectString);
        
        return string;
    }
    
    /**
     * The method takes, validates and returns next data from the console
     *
     * @param in Scanner instance
     * @return boolean console data
     */
    public static boolean getConsoleNextData(Scanner in) {
        boolean isCorrectString;
        String string;
        
        do {
            System.out.print("-> Input the next string? y/n: ");
            isCorrectString = in.hasNext(Pattern.compile("[yn]", Pattern.CASE_INSENSITIVE));
            
            string = in.next();
            
            if (string.equals("exit")) {
                ScannerHelper.runExitFull(in);
            }
            
            if (isCorrectString) {
                System.out.println();
            } else {
                System.out.println("-> NOT OK! Answer is incorrect!");
            }
            
            in.nextLine();
        } while (!isCorrectString);
        
        return string.toLowerCase().equals("y");
    }
}
