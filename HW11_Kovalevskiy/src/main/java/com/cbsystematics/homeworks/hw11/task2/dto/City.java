package com.cbsystematics.homeworks.hw11.task2.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "city")
@XmlAccessorType (XmlAccessType.FIELD)
public class City {
    
    @XmlAttribute(name = "size")
    private String size = "big";
    
    @XmlElement(name = "streets")
    private List<Streets> city = null;
    
    public List<Streets> getCity() {
        return this.city;
    }
    
    public void setCity(List<Streets> city) {
        this.city = city;
    }
    
    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
}
