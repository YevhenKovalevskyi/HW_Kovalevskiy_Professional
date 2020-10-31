package com.cbsystematics.homeworks.hw06.task2;

import com.cbsystematics.homeworks.hw06.task2.helpers.FilesHelper;

import java.io.*;
import java.util.regex.Pattern;

/**
 * Main Class represents homework #6 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        String sourceFile = FilesHelper.getSourceFilePath(Main.class, "Main.class", "file.txt");
        
        System.out.println();
        
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String s;
            
            while ((s = br.readLine()) != null) {
                s = Pattern.compile("\\b(к|на|с|в|без|о)+\\b", Pattern.UNICODE_CHARACTER_CLASS).matcher(s)
                        .replaceAll("!!!Java!!!");
                System.out.println(s);
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    
        System.out.println();
    }
}

/*
 - Список предлогов(или чего бы то ни было) можно расширить по желанию
*/