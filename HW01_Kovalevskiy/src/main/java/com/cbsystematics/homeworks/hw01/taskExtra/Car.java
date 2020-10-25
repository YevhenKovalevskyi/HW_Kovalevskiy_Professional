package com.cbsystematics.homeworks.hw01.taskExtra;

public class Car implements Comparable {
    
    private final String model;
    private final String color;
    private final int speed;
    private final int price;
    
    public Car(String model, String color, int speed, int price) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Car [ " +
                "model: " + model +
                " | " +
                "color: " + color +
                " | " +
                "speed: " + speed +
                " | " +
                "price: " + price +
                " ]";
    }
    
    /**
     * The method implements interface method of certain objects comparison
     *
     * @param o
     * @return result of comparison numerically
     */
    public int compareTo(Object o) {
        int compareResult;
        
        compareResult = this.speed - ((Car)o).speed;

        if (compareResult == 0) {
            compareResult = this.price - ((Car)o).price;
            
            if (compareResult == 0) {
                compareResult = this.model.compareTo(((Car)o).model);
                if (compareResult == 0) {
                    compareResult = this.color.compareTo(((Car)o).color);
                }
            }
        }
        
        return compareResult;
    }
}
