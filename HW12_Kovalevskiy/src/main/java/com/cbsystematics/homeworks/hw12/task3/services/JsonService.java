package com.cbsystematics.homeworks.hw12.task3.services;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonService {
    
    /**
     * The method takes String data and saves it as JSON to a file.
     *
     * @param jsonData - json data
     * @param filePath - json file path
     * @return setting result
     */
    public static String setDataToJson(String jsonData, String filePath) throws IOException {
        if (jsonData.length() == 0) {
            return "JSON data is empty!";
        } else if (filePath.length() == 0) {
            return "File path is empty!";
        }
        
        Path path = Paths.get(filePath);
        
        if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            Files.createFile(path);
        }
        
        try (Writer writer = Files.newBufferedWriter(path)) {
            new Gson().toJson(new JsonParser().parse(jsonData), writer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return "Json data successfully saved using Gson!";
    }
}
