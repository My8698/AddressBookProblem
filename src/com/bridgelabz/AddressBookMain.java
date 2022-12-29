package com.bridgelabz;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("****Welcome To Address Book Program****");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
        String filePath="C:\\Users\\Hemant\\IdeaProjects\\NewAddBoo\\src";
        while (true) {
            System.out.println("0.Exit \n1.Add Contact \n2.Display Contact \n3.Edit Contact \n4.Delete Contact \n5.Add new Address Book" +
                    "\n6.Display available address books \n7.Display all address books \n8.Write address book to file \n9.Read address book from file \n10.Search by city or state \n11.View Person by city or state \n12.Get person count by city\n13.sort contacts by name");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter the address book name to add contact in that address book : ");
                    String addressBookName = scanner.next();
                    /**
                     * containsKey is method of HashMap class is used to check weather the calling Hashmap
                     * contains specified key
                     */
                    if (!addressBookHashMap.containsKey(addressBookName)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName);
                        addressBook.addContact();
                    }
                    break;
                case 2:
                    System.out.println("Enter the address book name to display contacts in that address book : ");
                    String addressBookName1 = scanner.next();
                    if (!addressBookHashMap.containsKey(addressBookName1)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName1);
                        addressBook.displayContact();
                    }
                    break;
                case 3:
                    System.out.println("Enter the address book name to edit contacts in that address book : ");
                    String addressBookName2 = scanner.next();
                    if (!addressBookHashMap.containsKey(addressBookName2)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName2);
                        addressBook.editContactDetails();
                    }
                    break;
                case 4:
                    System.out.println("Enter the address book name to edit contacts in that address book : ");
                    String addressBookName3 = scanner.next();
                    if (!addressBookHashMap.containsKey(addressBookName3)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName3);
                        addressBook.deleteContact();
                    }
                    break;
                case 5:
                    System.out.println("Enter the address book name : ");
                    String name = scanner.next();
                    if (addressBookHashMap.containsKey(name)) {
                        System.out.println("Address book already exists!");
                    } else {
                        AddressBook addressBook = new AddressBook();
                        addressBookHashMap.put(name, addressBook);
                    }
                    break;
                case 6:
                    Set<String> keys = addressBookHashMap.keySet();
                    if (keys.isEmpty()) {
                        System.out.println("No address books available!");
                    }
                    for (String str : keys) {
                        System.out.print(str + " ");
                    }
                    System.out.println();
                    break;
                case 7:
                    Set<Map.Entry<String, AddressBook>> addressBook = addressBookHashMap.entrySet();
                    if (addressBook.isEmpty()) {
                        System.out.println("No address books available!");
                    }
                    for (Map.Entry entry : addressBook) {
                        System.out.println(entry.getKey());
                        AddressBook addBook = (AddressBook) entry.getValue();
                        addBook.displayContact();
                    }
                case 8:
                    Set<Map.Entry<String, AddressBook>> addressBook1 = addressBookHashMap.entrySet();
                    for (Map.Entry entry :  addressBook1) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(filePath + entry.getKey() + ".txt");
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                            AddressBook adBook = (AddressBook) entry.getValue();
                            List<Contact> contacts = adBook.getContactList();
                            objectOutputStream.writeObject(contacts);
                            objectOutputStream.close();
                        } catch (Exception exception) {
                            System.out.println(exception);
                        }
                    }
                    break;
                case 9:
                    System.out.println("Enter address book name :");
                    String file = scanner.next();
                    try{
                        FileInputStream fileInputStream = new FileInputStream(filePath+file+".txt");
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        List<Contact> contacts = (List<Contact>) objectInputStream.readObject();
                        objectInputStream.close();
                        for (Contact contact : contacts){
                            System.out.println(contact);
                        }
                    }catch (Exception exception){
                        System.out.println(exception);
                    }
                    break;
                case 10:
                    Set<Map.Entry<String, AddressBook>> addressBook2 = addressBookHashMap.entrySet();
                    System.out.println("Enter city or state : ");
                    String location = scanner.next();
                    if (addressBook2.isEmpty()){
                        System.out.println("No address books available!");
                    }
                    for (Map.Entry entry :  addressBook2){
                        System.out.println(entry.getKey());
                        AddressBook addBook = (AddressBook) entry.getValue();
                        addBook.searchByCityOrState(location);
                    }
                    break;
                case 11:
                    System.out.println("1. View by city 2.View by state");
                    int input = scanner.nextInt();
                    switch (input){
                        case 1:
                            System.out.println("Enter city :");
                            String city = scanner.next();
                            AddressBook.viewContactByCity(addressBookHashMap,city);
                            break;
                        case 2:
                            System.out.println("Enter state :");
                            String state = scanner.next();
                            AddressBook.viewContactByState(addressBookHashMap, state);
                            break;
                    }
                    break;
                    default:
                    System.out.println("Invalid Input");
            
              }
        }
    }
}
