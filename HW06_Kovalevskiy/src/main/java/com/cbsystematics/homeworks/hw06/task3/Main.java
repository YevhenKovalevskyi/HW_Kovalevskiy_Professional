package com.cbsystematics.homeworks.hw06.task3;

import java.time.*;

/**
 * Main Class represents homework #6 #task3
 *
 * @author e.kovalevskiy
 * @version 2.0
 */
public class Main {
    
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1990, Month.SEPTEMBER, 23);
        LocalTime birthTime = LocalTime.of(21, 30);
        
        LocalDate currDate  = LocalDate.now();
        LocalTime currTime  = LocalTime.now();
    
        Period period = Period.between(birthDate, currDate);
        int yearsPast = period.getYears();
        int monthsPast = period.getMonths();
        int daysPast  = period.getDays();
    
        Duration duration = Duration.between(currTime, birthTime);
        long secondsPast = duration.getSeconds();
        long minutesPast = secondsPast / 60;
        long hoursPast   = secondsPast / 3600;
    
        minutesPast = minutesPast - hoursPast * 60;
        secondsPast = secondsPast - hoursPast * 3600 - minutesPast * 60;
    
        System.out.printf("Since %s past:\nYears: %d\nMonths: %d\nDays: %d\nHours: %d\nMinutes: %d\nSeconds: %d\n\n",
                birthDate, yearsPast, monthsPast, daysPast, hoursPast, minutesPast, secondsPast);
    }
}
