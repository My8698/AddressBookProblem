package com.bridgelabz;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    /**
     * through array list we can add multiple contacts
     */
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    RegixPattern regexPattern=new RegixPattern();
    /**
     * method to add contacts in addressbook
     */
    public void addContact() {
        Contact contact1 = new Contact();
        boolean status = false;
        String firstName = regexPattern.validFirstName();
        for (Contact contact : contacts) {
                      if (contact.getFirstName().equals(firstName) == true) {
                          status = true;
                          break;
                      }
                  }
                  if (status == true) {
                      System.out.println(firstName + " already exits");
                      addContact();

                 } else {
                      contact1.setFirstName(firstName);
                      contact1.setLastName(regexPattern.validLastName());
                      contact1.setAddress(regexPattern.validAddress());
                      contact1.setCity(regexPattern.validCity());
                      contact1.setState(regexPattern.validState());
                      contact1.setZip(regexPattern.validZip());
                      contact1.setPhoneNumber(regexPattern.validPhoneNumber());
                      contact1.setEmail(regexPattern.valid_email());
                      Contact contact = new Contact(contact1.getFirstName(), contact1.getLastName(), contact1.getAddress(), contact1.getCity(), contact1.getState(), contact1.getZip(), contact1.getPhoneNumber(), contact1.getEmail());
                      contacts.add(contact);
                      }
              }
              /**
                * method to display contact in addressbook
                 * */
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
     *to search person by city or state
     */
    public void searchByCityOrState(String location){
        contacts.stream().forEach(contact -> {
            if (contact.getCity().equals(location) || contact.getState().equals(location)){
                System.out.println(contact);
            }
        });
    }

    /**
     * method to view person by city
     * */
    public static void viewContactByCity(HashMap<String, AddressBook> addressBookHashMap, String city) {
        for(Map.Entry < String, AddressBook> entries : addressBookHashMap.entrySet()) {
            entries.getValue().getContactList().stream().filter(p -> p.getCity().equalsIgnoreCase(city)).forEach(p -> System.out.println(p));
        }

    }
    public static void viewContactByState(HashMap<String, AddressBook> addressBookHashMap,String state) {
        for(Map.Entry < String, AddressBook> entries : addressBookHashMap.entrySet()) {
            entries.getValue().getContactList().stream().filter(p -> p.getState().equalsIgnoreCase(state)).forEach(p -> System.out.println(p));
        }
    }
    /**
    * method to get number of contact persons by city
     * */
    public static void  getCountByCity(HashMap<String, AddressBook> addressBookHashMap,String city) {
        long count = 0;
        for(Map.Entry<String, AddressBook> entries : addressBookHashMap.entrySet()) {
            long cnt = entries.getValue().getContactList().stream().filter(p -> p.getCity().equals(city)).count();
            count += cnt;
        }
        System.out.println(count + " Contacts in " + city);
    }

    /**
     *method to sort the entries alphabetically by person's Name
     */
    public static void sortByName(HashMap<String, AddressBook> addressBookHashMap) {
        List<Contact> list = new ArrayList<>();
        for (Map.Entry<String, AddressBook> entries : addressBookHashMap.entrySet()) {
            list = new ArrayList<>(entries.getValue().getContactList());
        }
        list.stream().sorted((p1, p2) -> ((String)p1.getFirstName()).compareTo(p2.getFirstName()))
                .forEach(contact -> System.out.println(contact));
    }
    //method to sort entries by city
    public static void sortByCity(HashMap<String, AddressBook> addressBookHashMap){
        List<Contact> list = new ArrayList<>();
        for (Map.Entry<String, AddressBook> entries : addressBookHashMap.entrySet()) {
            list = entries.getValue().getContactList().stream().collect(Collectors.toList());
        }
        list.stream().sorted((p1 , p2) -> ((String)p1.getCity()).compareTo(p2.getCity()))
                .forEach(contact -> System.out.println(contact));
    }
    //method to sort entries by state
    public static void sortByState(HashMap<String, AddressBook> addressBookHashMap){
        List<Contact> list = new ArrayList<>();
        for (Map.Entry<String, AddressBook> entries : addressBookHashMap.entrySet()) {
            list = entries.getValue().getContactList().stream().collect(Collectors.toList());
        }
        list.stream().sorted((p1 , p2) -> ((String)p1.getState()).compareTo(p2.getState()))
                .forEach(contact -> System.out.println(contact));
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                  contacts +
                '}';
    }
}