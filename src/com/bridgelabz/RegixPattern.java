package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class RegixPattern {
    Scanner input = new Scanner(System.in);
    public String validFirstName() {
        /**
         * create a regular expression for user first name
         */
        System.out.print("Enter first name :-> ");
        String firstName = input.next();
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(firstName).matches();
        if (status == true) {
            System.out.println(firstName + " is valid first name");
        } else {
            System.out.println(firstName + " is not valid first name");
            validFirstName();
        }
        return firstName;
    }
    public String validLastName() {
        /**
         * create a regular expression for user last name
         */
        System.out.print("Enter last name :-> ");
        String lastName = input.next();
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(lastName).matches();
        if (status == true) {
            System.out.println(lastName + " is valid last name");
        } else {
            System.out.println(lastName + " is not valid last name");
            validFirstName();
        }
        return lastName;
    }
    public String validAddress() {
        /**
         * create a regular expression for user address
         * This method return address
         */
        System.out.print("Enter Address:-> ");
        String address = input.next();
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(address).matches();
        if (status == true) {
            System.out.println(address + " is valid address");
        } else {
            System.out.println(address + " is not valid address");
            validFirstName();
        }
        return address;
    }
    public String validCity() {
        /**
         * create a regular expression for user city
         */
        System.out.print("Enter city:-> ");
        String city = input.next();
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(city).matches();
        if (status == true) {
            System.out.println(city + " is valid city");
        } else {
            System.out.println(city + " is not valid city");
            validFirstName();
        }
        return city;
    }
    public String validState() {
        /**
         * create a regular expression for user state
         */
        System.out.print("Enter state:-> ");
        String state = input.next();
        boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(state).matches();
        if (status == true) {
            System.out.println(state + " is valid state");
        } else {
            System.out.println(state + " is not valid state");
            validFirstName();
        }
        return state;
    }
    public String validZip() {
        /**
         * create a regular expression for user zip code
         * This method return zip code
         */
        System.out.print("Enter ZIP code:-> ");
        String zip = input.next();
        boolean status = Pattern.compile("[1-9]{1}[0-9]{5}").matcher(zip).matches();
        if (status == true) {
            System.out.println(zip + " is valid zip");
        } else {
            System.out.println(zip + " is not valid zip");
            validFirstName();
        }
        return zip;
    }
    public String validPhoneNumber() {
        /**
         * create a regular expression for user mobile number
         */
        System.out.print("Enter mobile number:-> ");
        String phoneNumber = input.next();
        boolean status = Pattern.compile("[7-9]{1}[0-9]{9}").matcher(phoneNumber).matches();
        if (status == true) {
            System.out.println(phoneNumber + " is valid mobile number");
        } else {
            System.out.println(phoneNumber + " is not valid mobile number");
     validFirstName();
        }
        return phoneNumber;
    }

    public String valid_email() {
        /**
         * create a regular expression for user email address
        */
        System.out.print("Enter email:-> ");
        String email = input.next();
        boolean status = Pattern.compile("[a-z]{2,20}[0-9]{0,5}[@]{1}[gmail]{5}[.]{1}[com]{3}").matcher(email).matches();
        if (status == true) {
            System.out.println(email + " is valid email");
        } else {
            System.out.println(email + " is not valid email");
     validFirstName();
        }
        return email;
    }
}
