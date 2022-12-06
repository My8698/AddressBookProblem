package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    /**
     * through array list we can add multiple contacts
     */
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    /**
     * method to add contacts in addressbook
     */
    public void addContact() {
        Contact contact1 = new Contact();
        System.out.println("Enter First name-> ");
        contact1.setFirstName(scanner.next());
        System.out.println("Enter Last name-> ");
        contact1.setLastName(scanner.next());
        System.out.println("Enter name of State-> ");
        contact1.setState(scanner.next());
        System.out.println("Enter City-> ");
        contact1.setCity(scanner.next());
        System.out.println("Enter Address-> ");
        contact1.setAddress(scanner.next());
        System.out.println("Enter E-Mail-> ");
        contact1.setEmail(scanner.next());
        System.out.println("Enter Zip-> ");
        contact1.setZip(scanner.nextInt());
        System.out.println("Enter Phone Number-> ");
        contact1.setPhoneNumber(scanner.nextInt());
        contacts.add(contact1);
    }

    /**
     * method to display contact in addressbook
     */
    public void displayContact() {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println(contact.toString());
        }
    }

    /**
     * method to edit contact by using person name
     */
    public void editContactDetails() {
        System.out.println("Enter person name :");
        String name = scanner.next();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name) || contact.getLastName().equals(name)) {
                System.out.println("Which Field you want to edit: \n" +
                        "1.first name \t" +
                        "2.last name \t" +
                        "3.state \t" +
                        "4.city \t" +
                        "5.address \t" +
                        "6.email \t" +
                        "7.zip \t" +
                        "8.phone-number");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter First name :");
                        contact.setFirstName(scanner.next());
                        System.out.println("Contact updated...!");
                        break;
                    case 2:
                        System.out.println("Enter Last name :");
                        contact.setLastName(scanner.next());
                        System.out.println("Contact updated...!");
                        break;
                    case 3:
                        System.out.println("Enter State name :");
                        contact.setState(scanner.next());
                        System.out.println("Contact updated...!");
                        break;
                    case 4:
                        System.out.println("Enter city name :");
                        contact.setCity(scanner.next());
                        System.out.println("Contact updated...!");
                        break;
                    case 5:
                        System.out.println("Enter Address :");
                        contact.setAddress(scanner.next());
                        System.out.println("Contact updated...!");
                        break;
                    case 6:
                        System.out.println("Enter Email :");
                        contact.setEmail(scanner.next());
                        System.out.println("Contact updated...!");
                        break;
                    case 7:
                        System.out.println("Enter zip code :");
                        contact.setZip(scanner.nextInt());
                        System.out.println("Contact updated...!");
                        break;
                    case 8:
                        System.out.println("Enter Phone number :");
                        contact.setPhoneNumber(scanner.nextInt());
                        System.out.println("Contact updated...!");
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
                return;
            }
        }
        System.out.println(name + "not found!");

    }

    /**
     * method to delete existing contact from addressbook
     * using person name
     */
    public void deleteContact() {
        System.out.println("Enter person name :");
        String name = scanner.next();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name) || contact.getLastName().equals(name)) {
                contacts.remove(contact);
                System.out.println("Contact Deleted successfully....");
                return;
            }
        }
        System.out.println(name + "not found!");

    }

}