package com.sohail.cli_project;

import com.sohail.cli_project.booking.BookingService;
import com.sohail.cli_project.cars.CarBrand;
import com.sohail.cli_project.cars.CarService;
import com.sohail.cli_project.users.UserService;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    static CarService carService = new CarService();
    static UserService userService = new UserService();
    static BookingService bookingService = new BookingService();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        breakTheLoop:
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); scanner.nextLine();

            switch (choice) {
                case 1:
                    bookCar();
                    break;
                case 2:
                    unbookCar();
                    break;
                case 3:
                    viewAllCarsBookedByUser();
                    break;
                case 4:
                    viewAllBookings();
                    break;
                case 5:
                    viewAllAvailableCars();
                    break;
                case 6:
                    viewAllAvailableElectricCars();
                    break;
                case 7:
                    viewAllUsers();
                    break;
                case 8:
                    System.out.print("1. Register User\t2. Unregister User\nEnter choice: ");
                    int selection1 = scanner.nextInt(); scanner.nextLine();
                    if(selection1 == 1)
                        registerUser();
                    else
                        unregisterUser();
                    break;
                case 9:
                    System.out.print("1. Register Car\t2. Unregister Car\nEnter choice: ");
                    int selection2 = scanner.nextInt(); scanner.nextLine();
                    if(selection2 == 1)
                        registerCar();
                    else
                        unregisterCar();
                    break;
                case 0:
                    break breakTheLoop;
                default:
                    System.out.println(choice + " is not a valid option ❌");
            }
        } while (true);
    }


    private static void printMenu() {
        System.out.println("\n");
        System.out.println("1️⃣ - Book Car.");
        System.out.println("2️⃣ - Unbook Car.");
        System.out.println("3️⃣ - View All Cars Booked by a User.");
        System.out.println("4️⃣ - View All Bookings.");
        System.out.println("5️⃣ - View Available Cars.");
        System.out.println("6️⃣ - View Available Electric Cars.");
        System.out.println("7️ - View All Users.");
        System.out.println("8️ - Register/Unregister User.");
        System.out.println("9️ - Register/Unregister Car..");
        System.out.println("0️ - Exit.");
    }

    private static void bookCar() {
        viewAllUsers();
        System.out.print("\nEnter UserId: ");
        UUID userId = UUID.fromString(scanner.nextLine());

        System.out.println();

        viewAllAvailableCars();
        System.out.print("\nEnter car registration number: ");
        int regNum = scanner.nextInt(); scanner.nextLine();

        String refNumber = bookingService.book(userId, regNum);
        if(refNumber != null) {
            System.out.println("✅ Booked successfully. Your Reference Number is: " + refNumber);
        } else {
            System.out.println("⚠️ An Error Occurred! Either the user or the car doesn't exist.");
        }
    }

    private static void unbookCar() {
        viewAllBookings();
        System.out.print("\nEnter the booking RefNumber: ");
        UUID refNumber = UUID.fromString(scanner.nextLine());

        if(bookingService.unbook(refNumber)) {
            System.out.println("✅ Unbooked successfully.");
        } else {
            System.out.println("⚠️ An Error Occurred! Either the user or the car doesn't exist.");
        }
    }

    private static void viewAllCarsBookedByUser() {
        viewAllUsers();
        System.out.print("Enter UserId to fetch their bookings: ");
        UUID userId = UUID.fromString(scanner.nextLine());
        System.out.println(bookingService.getUserBookings(userId));
    }

    private static void viewAllBookings() {
        System.out.println(bookingService.getAllBookings() + "\n");
    }

    private static void viewAllAvailableCars() {
        System.out.println(carService.getAllAvailableCars() + "\n");
    }

    private static void viewAllAvailableElectricCars() {
        System.out.println(carService.getAllAvailableElectricCars() + "\n");
    }

    private static void viewAllUsers() {
        System.out.println(userService.getAllUsers() + "\n");
    }

    private static void registerUser() {
        System.out.print("Enter Name to REGISTER the User: ");
        String name = scanner.nextLine();
        String uid = userService.registerUser(name);
        if (uid != null) {
            System.out.println("✅ Registered successfully. Your UserId: " + uid);
        } else {
            System.out.println("⚠️ An Error Occurred! Try registering with a different name.");
        }
    }

    private static void unregisterUser() {
        viewAllUsers();
        System.out.print("Enter UUID to DELETE the User: ");
        UUID userId = UUID.fromString(scanner.nextLine());
        if (userService.unregisterUser(userId)) {
            System.out.println("✅ Unregistered successfully.");
        } else {
            System.out.println("⚠️ An Error Occurred! User with specified UserId doesn't exist.");
        }
    }

    private static void registerCar() {
        System.out.print("Enter Registration Number of the Car: ");
        int regNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Brand of the Car:- ");
        System.out.println(CarBrand.AUDI.ordinal() + " - " + CarBrand.AUDI);
        System.out.println(CarBrand.MERCEDES.ordinal() + " - " + CarBrand.MERCEDES);
        System.out.println(CarBrand.TESLA.ordinal() + " - " + CarBrand.TESLA);
        System.out.print("Enter the corresponding number: ");
        CarBrand brand = CarBrand.values()[scanner.nextInt()];
        scanner.nextLine();

        System.out.print("Is this car electric? (yes/no): ");
        boolean isElectric = scanner.nextBoolean();

        System.out.print("Enter the rental price (per day): ");
        float rentalPricePerDay = scanner.nextFloat();
        scanner.nextLine();

        if (carService.registerCar(regNumber, rentalPricePerDay, isElectric, brand)) {
            System.out.println("✅ This car has been registered successfully.");
        } else {
            System.out.println("⚠️ An Error Occurred! A car with this registration number (" + regNumber + ") already exists.");
        }
    }

    private static void unregisterCar() {
        viewAllAvailableCars();
        System.out.print("Enter Registration Number to Unregister the User: ");
        int regNumber = scanner.nextInt(); scanner.nextLine();
        if (carService.unregisterCar(regNumber)) {
            System.out.println("✅ Unregistered successfully.");
        } else {
            System.out.println("⚠️ An Error Occurred! Car with this registration number (" + regNumber + ") DOESN'T exist.");
        }
    }
}
