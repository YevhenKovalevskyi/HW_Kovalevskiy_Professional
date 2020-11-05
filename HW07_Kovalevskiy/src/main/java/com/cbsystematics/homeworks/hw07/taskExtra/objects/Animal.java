package com.cbsystematics.homeworks.hw07.taskExtra.objects;

public class Animal {
    
    public String family = "Cat";
    protected String habitat = "Anywhere";
    private String food = "Everything";
    
    public Animal() {
    
    }
    
    private Animal(String family) {
        this.family = family;
    }
    
    protected Animal(String family, String habitat) {
        this.family = family;
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
    
    private String getFood() {
        return this.food;
    }
    
    private void setFood(String food) {
        this.food = food;
    }
    
    @Override
    public String toString() {
        return "\nAnimal [ family: " + this.family + " | habitat: " + this.habitat + " | food: " + this.food + " ]";
    }
}
