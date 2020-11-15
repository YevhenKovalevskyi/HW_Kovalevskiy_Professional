package com.cbsystematics.homeworks.hw10.taskExtra.dto;

import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
public class Body implements Cloneable, Serializable {
    
    private static final long serialVersionUID = 2L;
    
    @Getter @Setter
    private String type;
    @Getter
    private final String engine;
    @Getter
    private final String drive;
    
    public Body(String type, String engine, String drive) {
        this.type = type;
        this.engine = engine;
        this.drive = drive;
    }
    
    /**
     * Constructor clone option
     */
    public Body(Body body) {
        this(body.getType(), body.getEngine(), body.getDrive());
    }
    
    /**
     * Standard clone option
     */
    @Override
    public Body clone() {
        Body body;
        
        try {
            body = (Body) super.clone();
        } catch (CloneNotSupportedException ex) {
            return new Body(this.type, this.engine, this.drive);
        }
    
        return body;
    }
}
