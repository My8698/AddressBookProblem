package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        int choice;
        System.out.println("****Welcome To Address Book Program****");
        do {
            System.out.println("........Address Book Menu........");
            System.out.println("1.Add new Contact");
            System.out.println("2.Display");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("Enter Your Choice:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContactDetails();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (choice != 5);
    }
}