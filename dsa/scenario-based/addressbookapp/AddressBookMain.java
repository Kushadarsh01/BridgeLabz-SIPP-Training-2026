package oopsjavapractice.scenariobased.collectionframework.addressbookapp;

import java.util.Scanner;

public class AddressBookMain {
    public void choices() {
        AddressBookData addressBookData = new AddressBookData();

        System.out.println("--------------------------------------------");
        System.out.println("WELCOME TO ADDRESS BOOK's MAIN MENU");

        while (true) {
            System.out.println("1. Add Contact\n2. Search Contact\n3. Delete Contact\n4. Display Contacts\n5. EXIT");
            System.out.println("Enter your choice: ");

            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Contact Name: ");
                    String name = sc.next();
                    System.out.println("Enter you 10 digit Phone Number:");
                    String phoneNumber = sc.next();
                    System.out.println("Enter your Email Address: ");
                    String eMail = sc.next();
                    addressBookData.addContact(name, phoneNumber, eMail);
                    break;

                case 2:
                    System.out.println("Enter your name to search: ");
                    addressBookData.searchContact(sc.next());
                    break;

                case 3:
                    System.out.println("Enter your name to delete: ");
                    addressBookData.deleteContact(sc.next());
                    break;

                case 4:
                    addressBookData.displayContacts();
                    break;

                case 5:
                    System.out.println("Exiting Address Book...");
                    break;
            }

            System.out.println("--------------------------------------------");
        }
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();

        addressBookMain.choices();
    }
}
