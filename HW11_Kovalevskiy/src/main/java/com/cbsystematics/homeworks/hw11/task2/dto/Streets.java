package com.cbsystematics.homeworks.hw11.task2.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "streets")
@XmlAccessorType (XmlAccessType.FIELD)
public class Streets {
    
    @XmlElement(name = "street")
    private List<Street> streets = null;
    
    public List<Street> getStreets() {
        return this.streets;
    }
    
    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}
