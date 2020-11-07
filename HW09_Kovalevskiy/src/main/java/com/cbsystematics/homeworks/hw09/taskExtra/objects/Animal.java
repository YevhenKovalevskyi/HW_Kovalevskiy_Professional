package com.cbsystematics.homeworks.hw09.taskExtra.objects;

import java.io.Serializable;

public class Animal implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String family = "Cat";
    private String habitat = "Anywhere";
    private String food = "Everything";
    
    public Animal() {
    
    }
    
    public Animal(String family, String habitat, String food) {
        this.family = family;
        this.habitat = habitat;
        this.food = food;
    }
    
    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }
    
    public String getHabitat() {
        return this.habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public String getFood() {
        return this.food;
    }
    
    public void setFood(String food) {
        this.food = food;
    }
    
    @Override
    public String toString() {
        return "\nAnimal [ family: " + this.family + " | habitat: " + this.habitat + " | food: " + this.food + " ]\n";
    }
}
