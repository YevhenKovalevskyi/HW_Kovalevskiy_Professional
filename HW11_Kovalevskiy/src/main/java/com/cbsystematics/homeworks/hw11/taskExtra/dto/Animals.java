package com.cbsystematics.homeworks.hw11.taskExtra.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "animals")
@XmlAccessorType (XmlAccessType.FIELD)
public class Animals {
    
    @XmlElement(name = "cats")
    private List<Cats> animals = null;
    
    public List<Cats> getAnimals() {
        return this.animals;
    }
    
    public void setAnimals(List<Cats> animals) {
        this.animals = animals;
    }
}
