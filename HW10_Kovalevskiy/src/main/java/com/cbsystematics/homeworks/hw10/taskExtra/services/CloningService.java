package com.cbsystematics.homeworks.hw10.taskExtra.services;

import java.io.*;

public class CloningService {
    
    @SuppressWarnings("unchecked")
    public static <T> T cloneObject(T object) {
        T cloneObject = null;
        
        try (
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream ous = new ObjectOutputStream(baos)
        ) {
            ous.writeObject(object);
    
            try (
                    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
                    ObjectInputStream ois = new ObjectInputStream(bais)
            ) {
                cloneObject = (T) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return cloneObject;
    }
}
