package com.bridgelabz;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    /**
     * through array list we can add multiple contacts
     */
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    RegixPattern regixPattern=new RegixPattern();

    /**
     * method to add contacts in addressbook
     */
    public void addContact() {
        Contact contact1 = new Contact();
        System.out.println("Enter First name-> ");
        contact1.setFirstName(scanner.next());
        if (regixPattern.isFirstNameValid(contact1.getFirstName()))
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");

        System.out.println("Enter Last name-> ");
        contact1.setLastName(scanner.next());
        if (regixPattern.isLastNameValid(contact1.getLastName()))
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");

        System.out.println("Enter name of State-> ");
        contact1.setState(scanner.next());
        if (regixPattern.isStateValid(contact1.getState()))
            System.out.println("Valid state name");
        else
            System.out.println("Invalid state name");

        System.out.println("Enter name of City-> ");
        contact1.setCity(scanner.next());
        if (regixPattern.isCityValid(contact1.getCity()))
            System.out.println("Valid city name");
        else
            System.out.println("Invalid city name");

        System.out.println("Enter Address-> ");
        contact1.setAddress(scanner.next());
        if (regixPattern.isAddressValid(contact1.getAddress()))
            System.out.println("Valid Address");
        else
            System.out.println("Invalid Address");

        System.out.println("Enter E-Mail-> ");
        contact1.setEmail(scanner.next());
//        if (regixPattern.isEmailValid(contact1.getEmail()))
//            System.out.println("Valid E-Mail");
//        else
//            System.out.println("Invalid E-Mail");

        System.out.println("Enter Zip-> ");
        contact1.setZip(scanner.next());
        if (regixPattern.isZipValid(contact1.getZip()))
            System.out.println("Valid Zip");
        else
            System.out.println("Invalid Zip");

        System.out.println("Enter Phone Number-> ");
        contact1.setPhoneNumber(scanner.next());
        if (regixPattern.isPhoneNumberValid(contact1.getPhoneNumber()))
            System.out.println("Valid PhoneNumber");
        else
            System.out.println("Invalid PhoneNumber");

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
                        contact.setZip(scanner.next());
                        System.out.println("Contact updated...!");
                        break;
                    case 8:
                        System.out.println("Enter Phone number :");
                        contact.setPhoneNumber(scanner.next());
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
    public List<Contact> getContactList(){
        return contacts;
    }
    /**
     * This method is used to check the duplicate entry
     * if first and last name already exists in addressbook then it will not return true i.e. duplicate entry
     * if duplicate return true else return false
     * */
    public boolean isDuplicate(String firstName, String lastName){
        boolean result = contacts.stream().filter(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)).count() > 0;
        return result;
    }
    /**
     *to search person by city or state
     */
    public void searchByCityOrState(String location){
        contacts.stream().forEach(contact -> {
            if (contact.getCity().equals(location) || contact.getState().equals(location)){
                System.out.println(contact);
            }
        });
    }

}