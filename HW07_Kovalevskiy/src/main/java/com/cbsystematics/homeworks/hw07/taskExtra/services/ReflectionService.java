package com.cbsystematics.homeworks.hw07.taskExtra.services;

import java.lang.reflect.*;

/**
 * ReflectionService Class is a service class for different work with reflection
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class ReflectionService {
    
    /**
     * The method determines Class by object
     *
     * @param classObject class instance
     * @return Class type element
     */
    public static Class<?> getObjectClass(Object classObject) {
        return classObject.getClass();
    }
    
    /**
     * The method gets Class fields by object
     *
     * @param classObject class instance
     * @return Class fields
     */
    public static Field[] getObjectFields(Object classObject) {
        return ReflectionService.getObjectClass(classObject).getDeclaredFields();
    }
    
    /**
     * The method gets Class methods by object
     *
     * @param classObject class instance
     * @return Class methods
     */
    public static Method[] getObjectMethods(Object classObject) {
        return ReflectionService.getObjectClass(classObject).getDeclaredMethods();
    }
    
    /**
     * The method gets Class constructors by object
     *
     * @param classObject class instance
     * @return Class constructors
     */
    public static Constructor<?>[] getObjectConstructors(Object classObject) {
        return ReflectionService.getObjectClass(classObject).getDeclaredConstructors();
    }
    
    /**
     * The method prints Class fields information by object
     *
     * @param classObject class instance
     */
    public static void printObjectFields(Object classObject) {
        Field[] fields = ReflectionService.getObjectFields(classObject);
        
        System.out.println("Fields:");
        
        if (fields.length > 0) {
            try {
                for (Field field: fields) {
                    field.setAccessible(true);
                    
                    String[] types = field.getType().getTypeName().split("\\.");
                    String fieldModifier = Modifier.toString(field.getModifiers());
                    String fieldType = types[types.length - 1];
                    String fieldName = field.getName();
                    String fieldValue = field.get(classObject).toString();
                    
                    System.out.printf("\t%s %s %s - %s\n", fieldModifier, fieldType, fieldName, fieldValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else {
            String classFullName = ReflectionService.getObjectClass(classObject).getName();
            System.out.println(classFullName + " has no fields!");
        }
    }
    
    /**
     * The method sets Class fields by object
     *
     * @param classObject class instance
     */
    public static void setObjectFields(Object classObject) {
        Field[] fields = ReflectionService.getObjectFields(classObject);
        
        if (fields.length > 0) {
            try {
                for (Field field: fields) {
                    field.setAccessible(true);
                    String oldValue = field.get(classObject).toString();
                    field.set(classObject, "NEW [" + oldValue + "]");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else {
            String classFullName = ReflectionService.getObjectClass(classObject).getName();
            System.out.println(classFullName + " has no fields!");
        }
    }
    
    /**
     * The method prints Class constructors information by object
     *
     * @param classObject class instance
     */
    public static void printObjectConstructors(Object classObject) {
        Constructor<?>[] constructors = ReflectionService.getObjectConstructors(classObject);
        
        System.out.println("Constructors:");
        
        if (constructors.length > 0) {
            for (Constructor<?> constructor: constructors) {
                String constructorModifier = Modifier.toString(constructor.getModifiers());
                String[] names = constructor.getName().split("\\.");
                String constructorName = names[names.length - 1];
    
                Parameter[] params = constructor.getParameters();
    
                StringBuilder paramString = new StringBuilder();
                
                for (Parameter param : params) {
                    String[] types = param.getType().getName().split("\\.");
                    paramString.append(types[types.length - 1]).append(" ").append(param.getName()).append(", ");
                }
    
                int paramLength = paramString.length();
                
                if (paramLength > 0) {
                    paramString.delete(paramLength - 2, paramLength);
                }
                
                System.out.printf("\t%s %s(%s)\n", constructorModifier, constructorName, paramString.toString());
            }
        } else {
            String classFullName = ReflectionService.getObjectClass(classObject).getName();
            System.out.println(classFullName + " has no constructors!");
        }
    }
    
    /**
     * The method prints Class methods information by object
     *
     * @param classObject class instance
     */
    public static void printObjectMethods(Object classObject) {
        Method[] methods = ReflectionService.getObjectMethods(classObject);
        
        System.out.println("Methods:");
        
        if (methods.length > 0) {
            for (Method method: methods) {
                String[] types = method.getReturnType().getName().split("\\.");
                String methodModifier = Modifier.toString(method.getModifiers());
                String methodType = types[types.length - 1];
                String methodName = method.getName();
                
                System.out.printf("\t%s %s %s\n", methodModifier, methodType, methodName);
            }
        } else {
            String classFullName = ReflectionService.getObjectClass(classObject).getName();
            System.out.println(classFullName + " has no methods!");
        }
    }
}
