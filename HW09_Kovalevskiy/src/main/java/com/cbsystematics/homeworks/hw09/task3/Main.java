package com.cbsystematics.homeworks.hw09.task3;

import com.cbsystematics.homeworks.hw09.task3.helpers.FilesHelper;
import com.cbsystematics.homeworks.hw09.task3.objects.Car;
import com.cbsystematics.homeworks.hw09.task3.services.StreamService;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {
    
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        // object
        Car car = new Car("LandRover", 2016, "white", "full");
        // file to write
        String filePath = FilesHelper.getResourceRootFilePath(Main.class, "Main.class", "task3.dat");
        // serialization
        String intoStreamResult = StreamService.writeToStream(filePath, car);
        // deserialization
        Car outStreamResult = StreamService.readFromStream(filePath, Car.class);
    
        System.out.println(car);
        System.out.println(intoStreamResult);
        System.out.println(outStreamResult);
    }
}
