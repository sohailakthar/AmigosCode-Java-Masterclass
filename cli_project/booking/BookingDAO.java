package com.sohail.cli_project.booking;

import java.util.UUID;


public class BookingDAO {

    private static int CAPACITY = 4;
    private static Booking[] bookings;
    private static int index = -1;


    static {
        bookings = new Booking[CAPACITY];
    }


    public boolean contains(UUID refNumber) {
        for(Booking booking : bookings) {
            if(booking != null && refNumber.equals(booking.getRefNumber())) {
                return true;
            }
        }

        return false;
    }


    public void book(Booking booking) {
        if (index - 1 == CAPACITY) {
            growStorage();
            book(booking);
        }
        booking.getCar().setBooked(true);
        bookings[++index] = booking;
    }

    public void unbook(UUID refNumber) {
        boolean removed = false;
        for (int i = 0; i < CAPACITY; i++) {
            if (bookings[i] != null && refNumber.equals(bookings[i].getRefNumber())) {
                bookings[i].getCar().setBooked(false);
                bookings[i] = null;
                index--;
                removed = true;
            }

            if (removed) {
                while (i < CAPACITY - 1 && bookings[i + 1] != null) {
                    bookings[i] = bookings[i + 1];
                    i++;
                }
                break;
            }
        }
    }


    public Booking[] getUserBookings(UUID userId) {
        int i = 0;
        Booking[] userBookings = new Booking[CAPACITY];
        for (Booking booking : bookings) {
            if (booking != null && userId.equals(booking.getUser().getUserId())) {
                userBookings[i++] = booking;
            }
        }
        return (userBookings[0] == null) ? new Booking[1] : userBookings;
    }

    public Booking[] getAllBookings() {
        return bookings;
    }

    private void growStorage() {
        CAPACITY += (CAPACITY / 2);
        Booking[] newStorage = new Booking[CAPACITY];
        System.arraycopy(bookings, 0, newStorage, 0, bookings.length);
        bookings = newStorage;
    }
}
