package com.cbsystematics.homeworks.hw09.task3.objects;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {
    
    public static int staticField = 1;
    
    private String model;
    private int year;
    private String color;
    private String drive;
    
    public Car() {
    
    }
    
    public Car(String model, int year, String color, String drive) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.drive = drive;
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getModel());
        out.writeObject(this.getYear());
        out.writeObject(this.getColor());
        out.writeObject(this.getDrive());
        out.writeObject(Car.getStaticField());
    }
    
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.setModel((String) in.readObject());
        this.setYear((int) in.readObject());
        this.setColor((String) in.readObject());
        this.setDrive((String) in.readObject());
        Car.setStaticField((int) in.readObject());
    }
    
    public String getModel() {
        return this.model;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String getDrive() {
        return this.drive;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setDrive(String drive) {
        this.drive = drive;
    }
    
    public static int getStaticField() {
        return Car.staticField;
    }
    
    public static void setStaticField(int staticField) {
        Car.staticField = staticField;
    }
    
    @Override
    public String toString() {
        return "\nCar [ " +
                "model: " + this.model + " | " +
                "year: " + this.year + " | " +
                "color: " + this.color + " | " +
                "drive: " + this.drive + " | " +
                "staticField: " + Car.staticField +
                " ]\n";
    }
}
