package com.cbsystematics.homeworks.hw11.taskExtra.helpers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * FilesHelper Class is a helper class for different work with files
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public final class FilesHelper {
    
    /**
     * The method determines sub project file path
     *
     * @param currClass calling class
     * @param resourceName name of the resource
     * @param fileName name of the file
     * @return path to file
     */
    public static String getSourcePackageFilePath(Class<?> currClass, String resourceName, String fileName) throws UnsupportedEncodingException {
        return URLDecoder.decode(currClass.getResource(resourceName).getFile(), "UTF-8")
                .replace(System.getProperty("user.dir").replace("\\", "/"), "")
                .replace(resourceName, "")
                .replace("target/classes", "src/main/java")
                .replace("//", "")
                .concat(fileName);
    }
    
    /**
     * The method determines sub project resource file path
     *
     * @param currClass calling class
     * @param resourceName name of the resource
     * @param fileName name of the file
     * @return path to resource file
     */
    public static String getResourcePackageFilePath(Class<?> currClass, String resourceName, String fileName) throws UnsupportedEncodingException {
        return URLDecoder.decode(currClass.getResource(resourceName).getFile(), "UTF-8")
                .replace(System.getProperty("user.dir").replace("\\", "/"), "")
                .replace(resourceName, "")
                .replace("target/classes", "src/main/resources")
                .replace("//", "")
                .concat(fileName);
    }
    
    /**
     * The method determines sub project resource root directory + file path
     *
     * @param currClass calling class
     * @param resourceName name of the resource
     * @param fileName name of the file
     * @return path to resource file
     */
    public static String getResourceRootFilePath(Class<?> currClass, String resourceName, String fileName) throws UnsupportedEncodingException {
        return URLDecoder.decode(currClass.getResource(resourceName).getFile(), "UTF-8")
                .replace(System.getProperty("user.dir").replace("\\", "/"), "")
                .replace(resourceName, "")
                .replace("target/classes", "src/main/resources")
                .replace("//", "")
                .replace(currClass.getPackage().getName().replace(".", "/") + "/", "")
                .concat(fileName);
    }
}
