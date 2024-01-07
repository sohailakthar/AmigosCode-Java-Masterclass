package com.sohail.M12_ClassesAndObjects.Exercise;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car ritz = new Car(CarBrand.MARUTI, new BigDecimal(5_00_000));
        Car scorpio = new Car(CarBrand.MAHINDRA, new BigDecimal(10_00_000));

        Car sohailCar = ritz;
        Car fahadCar = scorpio;

        sohailCar.setRegNumber("TS 13 EK 6065");
        fahadCar.setRegNumber("AP 29 FS 0007");

        Address addr1 = new Address(
                "4-801",
                "Prem Nagar",
                "Hyderabad"
        );

        Address addr2 = new Address("3-8192/G",
                "Aditya Nagar",
                "Hyderabad",
                "Telangana",
                "India"
        );

        Person sohail = new Person("Sohail",
                "Akthar",
                sohailCar,
                addr1
        );

        Person fahad = new Person("Syed",
                "Fahad",
                fahadCar,
                addr2
        );

        System.out.println(sohail);
        System.out.println(fahad);
    }
}
