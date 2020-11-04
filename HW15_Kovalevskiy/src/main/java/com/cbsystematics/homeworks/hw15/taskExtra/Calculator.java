package com.cbsystematics.homeworks.hw15.taskExtra;

import com.cbsystematics.homeworks.hw15.taskExtra.contracts.Operation;

/**
 * Calculator Class represents simple arithmetic calculation
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Calculator {
    
    /**
     * The method calculates the result of summing the arguments
     *
     * @return result of the calculation
     */
    public static Operation add() {
        return Math::addExact;
    }
    
    /**
     * The method calculates the result of subtracting the arguments
     *
     * @return result of the calculation
     */
    public static Operation sub() {
        return Math::subtractExact;
    }
    
    /**
     * The method calculates the result of multiplying the arguments
     *
     * @return result of the calculation
     */
    public static Operation mul() {
        return Math::multiplyExact;
    }
    
    /**
     * The method calculates the result of dividing the arguments
     *
     * @return result of the calculation
     */
    public static Operation div() {
        return Math::floorDiv;
    }
    
    /**
     * The method calculates the result of exponentiation of arguments
     *
     * @return result of the calculation
     */
    public static Operation pow() {
        return Math::pow;
    }
    
    /**
     * The method calculates the remainder after division of the arguments.
     *
     * @return result of the calculation
     */
    public static Operation mod() {
        return Math::floorMod;
    }
}
