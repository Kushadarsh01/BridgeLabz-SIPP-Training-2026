package oopsjavapractice.scenariobased.collectionframework.addressbookapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AddressBookData {

    static ArrayList<Contacts> contacts = new ArrayList<>();
    static HashMap<String, Contacts> contactsMap = new HashMap<>();
    static HashSet<String> phoneNumber = new HashSet<>();

    public void addContact(String name, String number, String eMail) {
        if (phoneNumber.contains(number)) {
            System.out.println("User Already Exists!");
            return;
        }

        Contacts user = new Contacts(name, number, eMail);

        contacts.add(user);
        contactsMap.put(name, user);
        phoneNumber.add(number);

        System.out.println("Contact added Successfully");
    }

    public void searchContact(String name) {
        Contacts contact = contactsMap.get(name);

        if (contact != null) {
            System.out.println(contact);
        }
        else {
            System.out.println("Contact with Name: "+ name + " Not Found!");
        }
    }

    public void deleteContact(String name) {
        Contacts contact = contactsMap.get(name);

        if (contact != null) {
            contactsMap.remove(name);
            contacts.remove(contact);
            phoneNumber.remove(contact.getPhoneNumber());
            System.out.println("Contact Removed Successfully.");
        }
        else {
            System.out.println("Contact with Name: "+ name + " Not Found!");
        }
    }

    public void displayContacts() {
        Collections.sort(contacts);

        for (Contacts contact : contacts) {
            System.out.println(contact);
        }
    }
}
