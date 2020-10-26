package com.cbsystematics.homeworks.hw04.taskExtra;

import com.cbsystematics.homeworks.hw04.taskExtra.helpers.FilesHelper;

import java.io.*;

/**
 * Main Class represents homework #4 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        String sourceFile = FilesHelper.getSourceFilePath(Main.class, "Main.class", "file.txt");
        //String resourceFile = FilesHelper.getResourceFilePath(Main.class, "Main.class", "file.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFile))) {
            String text = "Hello  World!\nhomework #4 #taskExtra";
            bw.write(text);
            System.out.println("-> File \"file.txt\" created and edited!\n");
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    
        System.out.println("-> File content is:");
        
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String s;
        
            while ((s = br.readLine()) != null) {
                System.out.println("\t" + s);
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

/*
 - А есть ли человечески способ получить путь к файлу?
   Например такой путь: HW04_Kovalevskiy/src/main/java/com/cbsystematics/homeworks/hw04/taskExtra/file.txt
   Пол дня убил, а так и не нашел.
*/