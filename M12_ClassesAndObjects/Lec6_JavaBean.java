package com.sohail.M12_ClassesAndObjects;

import java.math.BigDecimal;

public class Lec6_JavaBean {
    /*
    For a class to be 'Java Bean', it must follow 3 rules:-
    1. It must have a no-args constructor. (ie, constructor with no arguments)
    2. All its fields must be private.
    So far, it is similar to POJO, but what differentiates it, is:-
    3. It must implement 'Serializable'

    Serializable allows it to be stored on disk/DB in streams.
    It also allows the class to be used as a table, with its fields as attributes.

    The class 'Car' is a Java Bean since it follows the above-mentioned 3 rules.
     */

    public static void main(String[] args) {
        Car car = new Car();
        car.setPrice(new BigDecimal(1000000));
        car.setRegNumber("TS 13 EK 6065");

        System.out.println(car.getPrice());
        System.out.println(car.getRegNumber());
    }
}
