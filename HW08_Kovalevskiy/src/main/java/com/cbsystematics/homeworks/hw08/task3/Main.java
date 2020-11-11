package com.cbsystematics.homeworks.hw08.task3;

public class Main {
    
    public static void main(String[] args) {
        Child childNoArgs = new Child();
        System.out.println(childNoArgs);
        
        Child childFullArgs = new Child("param1", "param2");
        System.out.println(childFullArgs);
        childFullArgs.getAnnotations();
    }
}

/*
 - эту библиотеку вообще используют? насколько она "законна"?
*/