package com.cbsystematics.homeworks.hw02.taskExtra.helpers;

import java.util.Scanner;

public class ScannerHelper {
    
    /**
     * Exit from Scanner
     *
     * @param in Scanner instance
     */
    public static void runExitScanner(Scanner in) {
        System.out.println("-> Good bye!");
        in.close();
    }
    
    /**
     * Exit from the program
     *
     * @param in Scanner instance
     */
    public static void runExitFull(Scanner in) {
        System.out.println("-> Good bye!");
        in.close();
        System.exit(0);
    }
}