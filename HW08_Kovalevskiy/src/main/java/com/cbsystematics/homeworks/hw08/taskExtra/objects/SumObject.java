package com.cbsystematics.homeworks.hw08.taskExtra.objects;

import com.cbsystematics.homeworks.hw08.taskExtra.annotations.Math;

public class SumObject {
    
    @Math(num1=10)
    @Math(num2=30)
    public void mathSum(int num1, int num2) {
        System.out.printf("\n%d + %d = %d\n", num1, num2, num1 + num2);
    }
}
