package com.cbsystematics.homeworks.hw08.task2.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CalculateDescriptor {
    int param1() default 1;
    int param2() default 1;
}
