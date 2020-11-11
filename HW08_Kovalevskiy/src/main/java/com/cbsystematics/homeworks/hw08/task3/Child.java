package com.cbsystematics.homeworks.hw08.task3;

import lombok.*;

import java.util.Arrays;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Child extends Parent {

    protected String field1, field2;
    
    @Override
    protected void sayHello() {
        System.out.println("Hello from Child.class");
    }
    
    protected void getAnnotations() {
        Arrays.asList(this.getClass().getAnnotations())
                .forEach(item -> System.out.println(item.annotationType().getSimpleName()));
    }
}
