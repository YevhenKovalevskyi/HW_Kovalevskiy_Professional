package com.cbsystematics.homeworks.hw10.taskExtra.dto;

import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Zaz extends Car implements Cloneable, Serializable {
    
    private static final long serialVersionUID = 3L;
    
    @Getter @Setter
    private String model;
    
    public Zaz(String color, int seats, Body body, String model) {
        super(color, seats, body);
        this.model = model;
    }
    
    /**
     * Constructor clone option
     */
    public Zaz(Zaz zaz) {
        this(zaz.getColor(), zaz.getSeats(), zaz.getBody(), zaz.getModel());
    }
    
    /**
     * Standard clone option
     */
    @Override
    public Zaz clone() {
        Zaz zaz = (Zaz) super.clone();
        zaz.model = this.getModel();
        
        return zaz;
    }
}
