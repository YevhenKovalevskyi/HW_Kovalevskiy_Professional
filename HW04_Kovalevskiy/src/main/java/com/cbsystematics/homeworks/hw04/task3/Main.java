package com.cbsystematics.homeworks.hw04.task3;

import com.cbsystematics.homeworks.hw04.task3.services.FilesService;
import com.cbsystematics.homeworks.hw04.taskExtra.helpers.FilesHelper;

import java.io.*;

/**
 * Main Class represents homework #4 #task3
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        String sourceFile = FilesHelper.getSourceFilePath(Main.class, "Main.class", "file.txt");
    
        FilesService.fillFileFromConsole(sourceFile);
        FilesService.sortAndWriteFileContent(sourceFile);
        FilesService.readFileContent(sourceFile);
    }
}

/*
 - Суть задания неоднозначна. Сделал по своему пониманию.
*/