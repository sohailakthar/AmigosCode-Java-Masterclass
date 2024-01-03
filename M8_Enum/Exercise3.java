package com.sohail.M8_Enum;

public class Exercise3 {
    enum weekdays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        for(weekdays day : weekdays.values()) {
            System.out.println(day.name().toLowerCase() + " : " + day.ordinal());
        }
    }
}
