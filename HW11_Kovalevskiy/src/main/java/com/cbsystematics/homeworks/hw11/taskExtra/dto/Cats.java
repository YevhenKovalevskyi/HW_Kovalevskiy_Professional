package com.cbsystematics.homeworks.hw11.taskExtra.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cats")
@XmlAccessorType (XmlAccessType.FIELD)
public class Cats {
    
    @XmlElement(name = "cat")
    private List<Cat> cats = null;
    
    public List<Cat> getCats() {
        return this.cats;
    }
    
    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}
