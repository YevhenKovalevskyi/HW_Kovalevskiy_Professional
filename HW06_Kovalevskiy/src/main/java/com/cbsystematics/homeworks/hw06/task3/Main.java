package com.cbsystematics.homeworks.hw06.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Main Class represents homework #6 #task3
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    private static final long MILLISECONDS_IN_YEAR   = (long)1000 * 60 * 60 * 24 * 365;
    private static final long MILLISECONDS_IN_MONTH  = (long)1000 * 60 * 60 * 24 * 30;
    private static final long MILLISECONDS_IN_DAY    = (long)1000 * 60 * 60 * 24;
    private static final long MILLISECONDS_IN_HOUR   = (long)1000 * 60 * 60;
    private static final long MILLISECONDS_IN_MINUTE = (long)1000 * 60;
    
    public static void main(String[] args) throws ParseException {
        String birthDate = "12.09.1990 18:10";
        
        long birthTime  = new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(birthDate).getTime();
        long currTime   = System.currentTimeMillis();
        
        long yearsLeft  = currTime - birthTime;
        int yearsPast   = (int)(yearsLeft / Main.MILLISECONDS_IN_YEAR);
        
        long monthsLeft = yearsLeft - yearsPast * Main.MILLISECONDS_IN_YEAR;
        int monthsPast  = (int)(monthsLeft / Main.MILLISECONDS_IN_MONTH);
        
        long daysLeft   = monthsLeft - monthsPast * Main.MILLISECONDS_IN_MONTH;
        int daysPast    = (int)(daysLeft / Main.MILLISECONDS_IN_DAY);
        
        long hoursLeft  = daysLeft - daysPast * Main.MILLISECONDS_IN_DAY;
        int hoursPast   = (int)(hoursLeft / Main.MILLISECONDS_IN_HOUR);
        
        int minutesLeft = (int)(hoursLeft - hoursPast * Main.MILLISECONDS_IN_HOUR);
        int minutesPast = (int)(minutesLeft / Main.MILLISECONDS_IN_MINUTE);
        
        System.out.printf("Since %s past:\nYears: %d\nMonths: %d\nDays: %d\nHours: %d\nMinutes: %d\n\n",
                birthDate, yearsPast, monthsPast, daysPast, hoursPast, minutesPast);
    }
}

/*
 - Результат имеет погрешность в виде разного кол-ва дней в месяцах(28/30/31) и дней в году(365/366)
*/