package com.sohail.cli_project.cars;


import com.sohail.cli_project.users.User;

import java.util.UUID;

public class CarDAO {
    private static int CAPACITY = 4;
    private static Car[] cars;
    private static int index = -1;

    static {
        cars = new Car[CAPACITY];
    }

    public static boolean contains(int regNumber) {
        for(Car registeredCar : cars) {
            if(registeredCar != null && regNumber == registeredCar.getRegNum()) {
                return true;
            }
        }

        return false;
    }

    public void addCar(Car car) {
        if(index-1 >= cars.length) {
            growStorage();
            addCar(car);
        }

        cars[++index] = car;
    }

    public void removeCar(int regNumber) {
        boolean removed = false;
        for(int i=0; i<CAPACITY; i++) {
            if(cars[i] != null && cars[i].getRegNum() == regNumber) {
                cars[i] = null;
                index--;
                removed = true;
            }

            if(removed) {
                while(i<CAPACITY-1 && cars[i+1] != null) {
                    cars[i] = cars[i+1];
                    i++;
                }
                break;
            }
        }
    }

    public int getCarCount() {
        return index+1;
    }



    public Car[] getAllAvailableCars() {
        int i = 0;
        Car[] availableCars = new Car[CAPACITY];
        for(Car car : cars) {
            if(car != null && !car.isBooked()) {
                availableCars[i++] = car;
            }
        }
        return (availableCars[0]==null) ? new Car[1] : availableCars;
    }


    public Car[] getAllAvailableElectricCars() {
        int i = 0;
        Car[] availableElectricCars = new Car[CAPACITY];
        for(Car car : cars) {
            if(car != null && car.isElectric() && !car.isBooked()) {
                availableElectricCars[i++] = car;
            }
        }
        return (availableElectricCars[0]==null) ? new Car[1] : availableElectricCars;
    }


    public static Car getCar(int regNumber) {
        for(Car car : cars) {
            if(car != null && car.getRegNum() == regNumber)
                return car;
        }
        return null;
    }


    private void growStorage() {
        CAPACITY += (CAPACITY/2);
        Car[] newStorage = new Car[CAPACITY];
        System.arraycopy(cars, 0, newStorage, 0, cars.length);
        cars = newStorage;
    }
}
