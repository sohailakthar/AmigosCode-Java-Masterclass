package com.sohail.M12_ClassesAndObjects.Exercise;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private CarBrand make;
    private String regNumber;
    private BigDecimal price;

    public Car(CarBrand make, BigDecimal price) {
        this.make = make;
        this.price = price;
    }

    public Car(CarBrand make, String regNumber, BigDecimal price) {
        this(make, price);
        this.regNumber = regNumber;
    }

    public CarBrand getMake() {
        return make;
    }

    public void setMake(CarBrand make) {
        this.make = make;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(regNumber, car.regNumber) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, regNumber, price);
    }
}
