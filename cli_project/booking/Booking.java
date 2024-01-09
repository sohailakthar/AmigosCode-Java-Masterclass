package com.sohail.cli_project.booking;

import com.sohail.cli_project.cars.Car;
import com.sohail.cli_project.users.User;

import java.util.UUID;

public class Booking {
    private Car car;
    private User user;
    private UUID refNumber;

    public Booking(User user, Car car) {
        this.user = user;
        this.car = car;
        this.refNumber = generateRefNumber();
    }

    public User getUser() { return this.user; }
    public Car getCar() { return this.car; }
    public UUID getRefNumber() {
        return this.refNumber;
    }

    private UUID generateRefNumber() {
        return UUID.randomUUID();
    }
}
