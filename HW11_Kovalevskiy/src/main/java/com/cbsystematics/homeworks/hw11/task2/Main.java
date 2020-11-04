package com.cbsystematics.homeworks.hw11.task2;

import com.cbsystematics.homeworks.hw11.task2.helpers.FilesHelper;
import com.cbsystematics.homeworks.hw11.task2.services.FilesService;

import java.io.IOException;

/**
 * Main Class represents homework #11 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        // create, fill, and save xml file
        String filePath = FilesHelper.getResourceRootFilePath(Main.class, "Main.class", "task2.xml");
        String saveResult = FilesService.writeDataFromDTOJAXB(filePath);
        
        System.out.println(saveResult);
        System.out.println(filePath + "\n");
    }
}

/*
 - Тут, по сути, и 2-е и 3-е задание, если я их правильно понял, что довольно таки трудно.
*/