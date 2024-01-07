package com.sohail.M12_ClassesAndObjects.Exercise;

import java.util.Objects;

public class Address {
    private String houseNumber;
    private String locality;
    private String city;
    private String state;
    private String country;

    public Address(String houseNumber, String locality, String city) {
        this.houseNumber = houseNumber;
        this.locality = locality;
        this.city = city;
    }

    public Address(String houseNumber, String locality, String city, String state) {
        this(houseNumber, locality, city);
        this.state = state;
    }

    public Address(String houseNumber, String locality, String city, String state, String country) {
        this(houseNumber, locality, city, state);
        this.country = country;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(houseNumber, address.houseNumber) && Objects.equals(locality, address.locality) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, locality, city, state, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
