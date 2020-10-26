package com.cbsystematics.homeworks.hw04.task3.services;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * FilesService Class represents a service class for working with files
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class FilesService {
    
    /**
     * The method takes data from console and writes to a file
     *
     * @param sourceFile path to a file
     */
    public static void fillFileFromConsole(String sourceFile) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFile))
        ) {
            System.out.println("-> Hello! This is a simple file filler.");
            System.out.println("-> You can type any integer.");
            System.out.println("-> If you want to exit this program - type \"exit\" !\n");
        
            String text;
        
            System.out.print("-> Enter a number: ");
        
            while (!(text = br.readLine()).equals("exit")) {
                if (text.matches(String.valueOf(Pattern.compile("[0-9]+")))) {
                    bw.write(text + "\n");
                    bw.flush();
                    System.out.print("-> Enter a number: ");
                } else {
                    System.out.println("-> Number is incorrect!");
                    System.out.print("-> Enter a number: ");
                }
            }
        
            System.out.println("\n-> File \"file.txt\" created and edited!\n");
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * The method takes data from a file, sorts and writes back
     *
     * @param sourceFile path to a file
     */
    public static void sortAndWriteFileContent(String sourceFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String s;
            ArrayList<Integer> list = new ArrayList<>();
        
            while ((s = br.readLine()) != null) {
                list.add(Integer.valueOf(s));
            }
        
            list.sort(Integer::compareTo);
        
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFile))) {
                for (Integer item: list) {
                    bw.write(item + "\n");
                }
            } catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * The method reads data from a file and print
     *
     * @param sourceFile path to a file
     */
    public static void readFileContent(String sourceFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String s;
    
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
