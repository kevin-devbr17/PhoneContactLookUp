import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        PhoneBook phoneBook = new PhoneBook();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Phone Book Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter phone number: ");
                    String number = scan.nextLine();

                    Contact contact = new Contact(name, number);
                    phoneBook.addContact(name, contact);

                    System.out.println("Contact added.");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scan.nextLine();

                    Contact found = phoneBook.getContact(searchName);

                    if (found != null) {
                        System.out.println(found.getName() + " : " + found.getPhoneNumber());
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    phoneBook.displayContacts();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scan.close();



    }
}
