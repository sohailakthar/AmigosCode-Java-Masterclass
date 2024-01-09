package com.sohail.cli_project.cars;

public class CarService {
    CarDAO carDao;

    {
        carDao = new CarDAO();
    }

    public boolean registerCar(int regNumber, float rentalPricePerDay, boolean isElectric, CarBrand brand) {

        if(carDao.contains(regNumber)) {
            return false;
        }

        Car car = new Car(regNumber, rentalPricePerDay, isElectric, brand);
        carDao.addCar(car);
        return true;
    }

    public boolean unregisterCar(int regNumber) {
        if(!carDao.contains(regNumber)) {
            return false;
        }

        carDao.removeCar(regNumber);
        return true;
    }


    public String getAllAvailableCars() {
        Car[] cars = carDao.getAllAvailableCars();
        StringBuilder carsDataString = new StringBuilder();

        if(cars[0] != null) {
            carsDataString.append("These are the currently available cars:-\n");

            for (int i = 0; i < cars.length; i++) {
                if (cars[i] == null)
                    break;
                String s = String.format("car-%d:\t\tRegNumber: %d  \tRentalPricePerDay: %.2f  \tBrand: %s \tElectric: %b\n", i+1, cars[i].getRegNum(), cars[i].getRentalPricePerDay(), cars[i].getBrand(), cars[i].isElectric());
                carsDataString.append(s);
            }
        } else {
            carsDataString.append("There are no available cars at the moment ❌");
        }

        return carsDataString.toString();
    }

    public String getAllAvailableElectricCars() {
        Car[] cars = carDao.getAllAvailableElectricCars();
        StringBuilder carsDataString = new StringBuilder();

        if(cars[0] != null) {
            carsDataString.append("These are the currently available electric cars:-\n");

            for (int i = 0; i < cars.length; i++) {
                if (cars[i] == null)
                    break;
                String s = String.format("car-%d:\t\tRegNumber: %d  \tRentalPricePerDay: %.2f  \tBrand:%s\n", i+1, cars[i].getRegNum(), cars[i].getRentalPricePerDay(), cars[i].getBrand());
                carsDataString.append(s);
            }
        } else {
            carsDataString.append("There are no available Electric cars at the moment ❌");
        }

        return carsDataString.toString();
    }
}
