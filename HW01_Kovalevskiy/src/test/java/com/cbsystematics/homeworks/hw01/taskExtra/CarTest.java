package com.cbsystematics.homeworks.hw01.taskExtra;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    
    @Test
    public void compareTo_FirstObjectMoreThanSecond_True() {
        Car first = new Car("modelA", "colorB", 25, 1000);
        Car second = new Car("modelA", "colorA", 25, 1000);

        Assert.assertTrue(first.compareTo(second) > 0);
        
        /*
         - нужно ли тестировать различные комбинации значений свойств объекта ?
         - если да - как при этом называть методы
         */
    }
    
    @Test
    public void compareTo_FirstObjectLessThanSecond_True() {
        Car first = new Car("modelA", "colorA", 25, 1000);
        Car second = new Car("modelA", "colorB", 25, 1000);
    
        Assert.assertTrue(first.compareTo(second) < 0);
        
        /*
         - нужно ли тестировать различные комбинации значений свойств объекта ?
         - если да - как при этом называть методы
         */
    }
    
    @Test
    public void compareTo_FirstObjectIsEqualToSecond_True() {
        Car first = new Car("modelA", "colorA", 25, 1000);
        Car second = new Car("modelA", "colorA", 25, 1000);
    
        Assert.assertEquals(0, first.compareTo(second));
    }
}
