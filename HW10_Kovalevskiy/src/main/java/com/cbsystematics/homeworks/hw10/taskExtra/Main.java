package com.cbsystematics.homeworks.hw10.taskExtra;

import com.cbsystematics.homeworks.hw10.taskExtra.dto.Body;
import com.cbsystematics.homeworks.hw10.taskExtra.dto.Car;
import com.cbsystematics.homeworks.hw10.taskExtra.dto.Zaz;
import com.cbsystematics.homeworks.hw10.taskExtra.services.CloningService;

public class Main {
    
    public static void main(String[] args) {
        Car car1 = new Car("red", 5, new Body("sedan", "diesel", "manual"));
        Car cloneCar1 = car1.clone();
        Car copyCar1 = new Car(car1);
        Car serializeCar1 = CloningService.cloneObject(car1);
        car1.setColor("green");
        car1.getBody().setType("station wagon");

        System.out.println(car1);
        System.out.println(cloneCar1);
        System.out.println(copyCar1);
        System.out.println(serializeCar1);
    
        System.out.println("--------------------------------------");
        
        Car car2 = new Car("red", 5, new Body("sedan", "diesel", "manual"));
        Car cloneCar2 = car2.clone();
        Car copyCar2 = new Car(car2);
        Car serializeCar2 = CloningService.cloneObject(car2);
        car2.setColor("orange");
    
        System.out.println(car2);
        System.out.println(cloneCar2);
        System.out.println(copyCar2);
        System.out.println(serializeCar2);
    
        System.out.println("--------------------------------------");
        
        Zaz zaz1 = new Zaz("red", 5, new Body("sedan", "diesel", "manual"), "zaz01");
        Zaz cloneZaz1 = zaz1.clone();
        Car copyZaz1 = new Zaz(zaz1);
        Zaz serializeZaz1 = CloningService.cloneObject(zaz1);
        zaz1.setColor("yellow");
        zaz1.setModel("zaz02");
        
        System.out.println(zaz1);
        System.out.println(cloneZaz1);
        System.out.println(copyZaz1);
        System.out.println(serializeZaz1);
    }
}

/*
 - Задания однотипные, по этому все в одном.
*/