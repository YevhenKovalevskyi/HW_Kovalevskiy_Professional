package com.cbsystematics.homeworks.hw11.taskExtra;

import com.cbsystematics.homeworks.hw11.taskExtra.helpers.FilesHelper;
import com.cbsystematics.homeworks.hw11.taskExtra.services.FilesService;

import java.io.IOException;

/**
 * Main Class represents homework #11 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        // create, fill, and save xml file
        String fileData = FilesService.getDataForFile();
        String filePath = FilesHelper.getResourceRootFilePath(Main.class, "Main.class", "taskExtra.xml");
        String saveResult = FilesService.saveDataToFile(fileData, filePath);

        System.out.println(saveResult + "\n");
        System.out.println("File " + filePath + " is reading...");
    
        // read and print xml file
        //FilesService.readDataFromFileStAX(filePath, "cat"); // рабочий метод
        FilesService.readDataFromFileJAXB(filePath);
        System.out.println();
    }
}
