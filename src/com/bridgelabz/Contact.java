package com.bridgelabz;
public class Contact {
    private String firstName;
    private String state;
    private String lastName;
    private String address;
    private String city;
    private String email;
    private String zip;
    private String phoneNumber;

    public Contact() {
    };
    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.address = address;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {

        if (zip.length() == 6) {
            this.zip = zip;
        }
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", state='" + state + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

