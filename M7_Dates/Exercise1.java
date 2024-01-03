package com.sohail.M7_Dates;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy | HH:mm:ss");

        System.out.println(currentDate.format(dateFormatter));
        System.out.println(currentDateTime.format(dateTimeFormatter));
    }
}
