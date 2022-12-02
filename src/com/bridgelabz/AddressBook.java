package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contact contact;
    public void addContact() {
        System.out.println("Enter following details.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name : ");
        String firstName = sc.nextLine();
        System.out.println("Last Name : ");
        String lastName = sc.nextLine();
        System.out.println("Address : ");
        String address = sc.nextLine();
        System.out.println("City : ");
        String city = sc.nextLine();
        System.out.println("State : ");
        String state = sc.nextLine();
        System.out.println("Zip Code : ");
        int zip = sc.nextInt();
        System.out.println("Phone Number : ");
        int phoneNumber = sc.nextInt();
        System.out.println("Email Id: ");
        String email = sc.next();
        contact = new Contact(firstName, lastName, address, state, city,email, zip, phoneNumber);
        System.out.println("You have added a contact :) ");
        sc.close();
    }
    @Override
    public String toString() {
        return contact.toString() ;
    }
}
