package com.cbsystematics.homeworks.hw10.taskExtra.dto;

import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
public class Car implements Cloneable, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Getter @Setter
    private transient String color;
    @Getter
    private final int seats;
    @Getter @Setter
    private Body body;
    
    public Car(String color, int seats, Body body) {
        this.color = color;
        this.seats = seats;
        this.body = body;
    }
    
    /**
     * Constructor clone option
     */
    public Car(Car car) {
        this(car.getColor(), car.getSeats(), car.getBody().clone());
    }
    
    /**
     * Standard clone option
     */
    @Override
    public Car clone() {
        Car car;
    
        try {
            car = (Car) super.clone();
            car.body = this.getBody().clone();
        } catch (CloneNotSupportedException ex) {
            return new Car(this.color, this.seats, this.body);
        }
    
        return car;
    }
}
