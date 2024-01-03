package com.sohail.M7_Dates;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {
    public static void main(String[] args) {
        int year = 2002;
        int month = 9;
        int day = 15;

        LocalDate date = LocalDate.of(year, month, day);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(date.format(dateFormatter));

        LocalDate newDate = date.plusDays(100);

        System.out.println(newDate.format(dateFormatter));
    }
}
