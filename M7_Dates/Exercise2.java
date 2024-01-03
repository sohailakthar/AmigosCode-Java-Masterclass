package com.sohail.M7_Dates;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 9, 15);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(date.format(dateFormatter));
    }
}
