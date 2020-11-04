package com.cbsystematics.homeworks.hw11.task2.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "street")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Street implements Serializable {
    
    private static final long serialVersionUID = 2L;
    
    private String size = "small";

    private String name;
    private int houses;
    private String length;
    
    public Street() {
        super();
    }
    
    public Street(String name, int houses, String length) {
        super();
        this.name = name;
        this.houses = houses;
        this.length = length;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHouses() {
        return this.houses;
    }
    
    public void setHouses(int houses) {
        this.houses = houses;
    }
    
    public String getLength() {
        return this.length;
    }
    
    public void setLength(String length) {
        this.length = length;
    }
    
    @XmlAttribute(name = "size")
    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return "Street [ " +
                "name: " + this.name + " | " +
                "houses: " + this.houses + " | " +
                "length: " + this.length +
                " ]";
    }
}
