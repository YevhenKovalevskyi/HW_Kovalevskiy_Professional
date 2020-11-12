package com.cbsystematics.homeworks.hw08.taskExtra.annotations;

import java.lang.annotation.*;

@Repeatable(Maths.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Math {
    int num1() default 0;
    int num2() default 0;
}
