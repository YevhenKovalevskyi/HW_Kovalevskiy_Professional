package com.cbsystematics.homeworks.hw02.taskExtra.services;

import com.cbsystematics.homeworks.hw02.taskExtra.helpers.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * ConsoleService Class represents methods for getting data from the console
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class ConsoleService {
    
    public static final String END_STRING = "end";
    
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
     * The method compare strings
     * @param string
     * @return result of comparison
     */
    public static boolean checkForEnd(String string) {
        return !string.equals(ConsoleService.END_STRING);
    }
}
