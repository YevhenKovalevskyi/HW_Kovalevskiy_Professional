package com.cbsystematics.homeworks.hw08.task3;

import com.cbsystematics.homeworks.hw08.task3.annotations.Thing;
import lombok.*;

@Thing
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Parent {

    protected String field;
    
    protected void sayHello() {
        System.out.println("Hello from Parent.class");
    }
}
