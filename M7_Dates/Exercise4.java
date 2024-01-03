package com.sohail.M7_Dates;

import java.time.LocalDate;
import java.time.Period;

public class Exercise4 {
    public static void main(String[] args) {
        int year = 2002, month = 9, day = 15;

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate todayDate = LocalDate.now();

        String age = calculateAge(birthDate, todayDate);

        System.out.println("Your Age: " + age);
    }

    private static String calculateAge(LocalDate birthDate, LocalDate todayDate) {
        Period period = Period.between(birthDate, todayDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        return years + " years, " + months + " months and " + days + " days.";
    }
}
