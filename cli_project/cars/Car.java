package com.sohail.cli_project.cars;

import java.util.Objects;

public class Car {
    private int regNum;
    private float rentalPricePerDay;
    private boolean isElectric;
    private boolean isBooked = false;
    private CarBrand brand;

    public Car(int regNum, float rentalPricePerDay, boolean isElectric, CarBrand brand) {
        this.regNum = regNum;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isElectric = isElectric;
        this.brand = brand;
    }

    public int getRegNum() {
        return this.regNum;
    }

    public float getRentalPricePerDay() {
        return this.rentalPricePerDay;
    }

    public void setRentalPricePerDay(float rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public boolean isElectric() {
        return this.isElectric;
    }

    public boolean isBooked() {
        return this.isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }

    public CarBrand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNum=" + regNum +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", brand=" + brand +
                ", isElectric=" + isElectric +
                ", isBooked=" + isBooked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return regNum == car.regNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNum, rentalPricePerDay, isElectric, isBooked, brand);
    }
}
