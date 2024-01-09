package com.sohail.cli_project.booking;

import com.sohail.cli_project.cars.Car;
import com.sohail.cli_project.cars.CarDAO;
import com.sohail.cli_project.users.User;
import com.sohail.cli_project.users.UserDAO;

import java.awt.print.Book;
import java.util.UUID;

public class BookingService {
    BookingDAO bookingDao = new BookingDAO();
    public String book(UUID userId, int regNumber) {
        if(CarDAO.contains(regNumber) && UserDAO.contains(userId)) {
            User user = UserDAO.getUser(userId);
            Car car = CarDAO.getCar(regNumber);
            Booking booking = new Booking(user, car);
            bookingDao.book(booking);
            return booking.getRefNumber().toString();
        }

        return null;
    }

    public boolean unbook(UUID refNumber) {
        if(!bookingDao.contains(refNumber)) {
            return false;
        }

        bookingDao.unbook(refNumber);
        return true;
    }


    public String getUserBookings(UUID userId) {
        Booking[] bookings = bookingDao.getUserBookings(userId);
        StringBuilder userBookingsData = new StringBuilder();

        if(bookings[0] != null) {
            userBookingsData.append("These are the current bookings for the user-").append(userId.toString()).append(":-\n");
            for (int i = 0; i < bookings.length; i++) {
                if (bookings[i] == null)
                    break;
                String s = String.format("booking-%d:\tRefNumber:%s  Car-RegNumber:%d", i, bookings[i].getRefNumber().toString(), bookings[i].getCar().getRegNum());
                userBookingsData.append(s);
            }
        } else {
            userBookingsData.append("There are no registered bookings for the user-").append(userId.toString()).append(" ❌");
        }

        return userBookingsData.toString();
    }


    public String getAllBookings() {
        Booking[] bookings = bookingDao.getAllBookings();
        StringBuilder bookingsDataString = new StringBuilder();

        if(bookings[0] != null) {
            bookingsDataString.append("These are the current bookings:-\n");
            for (int i = 0; i < bookings.length; i++) {
                if (bookings[i] == null)
                    break;
                String s = String.format("booking-%d:\tRefNumber:%s  UserId:%s  Car-RegNumber:%d", i, bookings[i].getRefNumber().toString(), bookings[i].getUser().getUserId().toString(), bookings[i].getCar().getRegNum());
                bookingsDataString.append(s);
            }
        } else {
            bookingsDataString.append("There are no registered bookings ❌");
        }

        return bookingsDataString.toString();
    }
}
