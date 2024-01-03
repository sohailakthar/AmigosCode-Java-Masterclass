package com.sohail.M7_Dates;

import java.time.Duration;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class DaysBetweenTwoYears {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1997, 12, 29);
        LocalDate date2 = LocalDate.of(2016, 6, 12);

        long days1 = DAYS.between(date1, date2);
        long days2 = Duration.between(date1.atStartOfDay(), date2.atStartOfDay()).toDays();

        System.out.println(days1);
        System.out.println(days2);
    }
}
