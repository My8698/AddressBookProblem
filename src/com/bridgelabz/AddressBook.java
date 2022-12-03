package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
    Contact contact;
    public void addContact() {
        System.out.println("Enter following details.....");
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name : ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name : ");
        String lastName = scanner.nextLine();
        System.out.println("Address : ");
        String address = scanner.nextLine();
        System.out.println("City : ");
        String city = scanner.nextLine();
        System.out.println("State : ");
        String state = scanner.nextLine();
        System.out.println("Zip Code : ");
        int zip = scanner.nextInt();
        System.out.println("Phone Number : ");
        int phoneNumber = scanner.nextInt();
        System.out.println("Email Id: ");
        String email = scanner.next();
        contact = new Contact(firstName, lastName, address, state, city,email, zip, phoneNumber);
        System.out.println("You have added a contact :) ");
        scanner.close();
    }
    @Override
    public String toString() {
        return contact.toString() ;
    }
}
