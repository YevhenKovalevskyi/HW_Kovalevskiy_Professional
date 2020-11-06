package com.cbsystematics.homeworks.hw09.task3.services;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

/**
 * StreamService Class represents a service class for working with streams
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class StreamService {
    
    /**
     * The method serializes the object
     *
     * @param filePath of serialization
     * @param object of serialization
     * @param <T>
     * @return result of serialization
     */
    public static <T> String writeToStream(String filePath, T object) throws FileNotFoundException {
        if (filePath.length() == 0) {
            throw new FileNotFoundException("File path is empty!");
        }
    
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(object);
        } catch(IOException ex) {
            ex.getStackTrace();
        }
        
        return "Object was successfully serialized! " + filePath;
    }
    
    /**
     * The method deserializes the object
     *
     * @param filePath of deserialization
     * @param objectClass of deserialization
     * @param <T>
     * @return deserialized object
     */
    public static <T> T readFromStream(String filePath, Class<T> objectClass) throws FileNotFoundException {
        if (filePath.length() == 0) {
            throw new FileNotFoundException("File path is empty!");
        }
    
        if (!Files.exists(Paths.get(filePath), LinkOption.NOFOLLOW_LINKS)) {
            throw new FileNotFoundException("File " + filePath + " not found!");
        }
    
        T object = null;
    
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            object = objectClass.cast(ois.readObject());
        } catch(IOException | ClassNotFoundException | ClassCastException ex) {
            ex.getStackTrace();
        }
        
        return object;
    }
}
