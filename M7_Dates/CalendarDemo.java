package com.sohail.M7_Dates;

import java.util.Calendar;
import java.util.Locale;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);

        cal.set(Calendar.YEAR, 2024);
        cal.set(Calendar.MONTH, 1);

        System.out.println(cal.getFirstDayOfWeek());
    }

}
