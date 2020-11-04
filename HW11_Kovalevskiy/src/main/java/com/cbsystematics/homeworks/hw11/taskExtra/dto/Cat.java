package com.cbsystematics.homeworks.hw11.taskExtra.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cat")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Cat implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String breed;
    private int weight;
    
    public Cat() {
        super();
    }
    
    public Cat(String name, int age, String breed, int weight) {
        super();
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getBreed() {
        return this.breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Cat [ " +
                "name: " + this.name + " | " +
                "age: " + this.age + " | " +
                "breed: " + this.breed + " | " +
                "weight: " + this.weight +
                " ]";
    }
}
