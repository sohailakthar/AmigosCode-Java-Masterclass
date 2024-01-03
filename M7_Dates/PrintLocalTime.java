package com.sohail.M7_Dates;

import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class PrintLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println(time.format(timeFormatter));


        // Zoned Date Time
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);


        // Offset Time
        OffsetTime offsetTime = OffsetTime.now();

        System.out.println(offsetTime);
    }
}
