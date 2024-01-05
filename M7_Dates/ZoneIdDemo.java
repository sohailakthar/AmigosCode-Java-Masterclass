package com.sohail.M7_Dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdDemo {
    public static void main(String[] args) {
        LocalDate localDateOfCalcutta = LocalDate.now(ZoneId.of("Asia/Calcutta"));
        ZonedDateTime zonedDateTime = ZonedDateTime.now();


        System.out.println(localDateOfCalcutta);
        System.out.println(zonedDateTime);
        System.out.println(Instant.now());
    }
}
