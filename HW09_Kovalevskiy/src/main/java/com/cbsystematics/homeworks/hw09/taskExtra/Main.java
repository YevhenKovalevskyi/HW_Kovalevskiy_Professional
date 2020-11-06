package com.cbsystematics.homeworks.hw09.taskExtra;

import com.cbsystematics.homeworks.hw09.taskExtra.helpers.FilesHelper;
import com.cbsystematics.homeworks.hw09.taskExtra.objects.Animal;
import com.cbsystematics.homeworks.hw09.taskExtra.services.StreamService;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Main Class represents homework #09 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // object
        Animal animal = new Animal();
        // file to write
        String filePath = FilesHelper.getResourceRootFilePath(Main.class, "Main.class", "taskExtra.dat");
        // serialization
        String intoStreamResult = StreamService.writeToStream(filePath, animal);
        // deserialization
        Animal outStreamResult = StreamService.readFromStream(filePath, Animal.class);
        
        System.out.println(animal);
        System.out.println(intoStreamResult);
        System.out.println(outStreamResult);
    }
}

/*
 - реализованы таск 2(десериализация) и таск Extra(сериализация) в одном.
*/
