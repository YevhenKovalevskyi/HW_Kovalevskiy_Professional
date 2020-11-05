package com.cbsystematics.homeworks.hw07.taskExtra;

import com.cbsystematics.homeworks.hw07.taskExtra.objects.Animal;
import com.cbsystematics.homeworks.hw07.taskExtra.services.ReflectionService;

/**
 * Main Class represents homework #7 #taskExtra & #task2 & #task3
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        Animal animal = new Animal();
    
        // object
        System.out.println(animal);
        System.out.println();
        
        // constructors
        ReflectionService.printObjectConstructors(animal);
        System.out.println();
    
        // methods
        ReflectionService.printObjectMethods(animal);
        
        // fields
        System.out.println("\n-- Before changes");
        ReflectionService.printObjectFields(animal);
    
        // update fields
        ReflectionService.setObjectFields(animal);
    
        // fields
        System.out.println("\n-- After changes");
        ReflectionService.printObjectFields(animal);
        System.out.println(animal);
        
        System.out.println();
    }
}

/*
 - Все задания, по сути, олинаковы. Я объединил их все в одну. Дабы не плодить дубли кода.
*/