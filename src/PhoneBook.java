import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, Contact> contacts;

    public PhoneBook(){
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, Contact contact){
            contacts.put(name, contact);
    }

    public Contact getContact(String name){
        return contacts.get(name);
    }

    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts available.");
            return;
        }

        for(Contact contact : contacts.values()){
            System.out.println(contact.getName() + " : " + contact.getPhoneNumber());
        }

    }


}
