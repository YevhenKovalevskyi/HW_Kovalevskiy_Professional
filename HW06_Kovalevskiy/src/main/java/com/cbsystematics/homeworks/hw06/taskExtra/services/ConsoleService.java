package com.cbsystematics.homeworks.hw06.taskExtra.services;

import com.cbsystematics.homeworks.hw06.taskExtra.helpers.ScannerHelper;

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
     * The method takes, validates and returns login data from the console
     *
     * @param in Scanner instance
     * @return login console data
     */
    public static String getConsoleLoginData(Scanner in) {
        boolean isCorrectLogin;
        String login;
        
        do {
            System.out.print("-> Input login: ");
            isCorrectLogin = in.hasNext(Pattern.compile("[a-z_\\-.]+", Pattern.CASE_INSENSITIVE));
    
            login = in.nextLine();
            
            if (login.equals("exit")) {
                ScannerHelper.runExitFull(in);
            }
            
            if (isCorrectLogin) {
                System.out.println("-> OK!");
            } else {
                System.out.println("-> NOT OK! Login is incorrect!");
            }
        } while (!isCorrectLogin);
        
        return login;
    }
    
    /**
     * The method takes, validates and returns password data from the console
     *
     * @param in Scanner instance
     * @return password console data
     */
    public static String getConsolePasswordData(Scanner in) {
        boolean isCorrectPassword;
        String password;
        
        do {
            System.out.print("-> Input password: ");
            isCorrectPassword = in.hasNext(Pattern.compile("[a-z0-9]+", Pattern.CASE_INSENSITIVE));
    
            password = in.nextLine();
            
            if (password.equals("exit")) {
                ScannerHelper.runExitFull(in);
            }
            
            if (isCorrectPassword) {
                System.out.println("-> OK!");
            } else {
                System.out.println("-> NOT OK! Password is incorrect!");
            }
        } while (!isCorrectPassword);
        
        return password;
    }
}
