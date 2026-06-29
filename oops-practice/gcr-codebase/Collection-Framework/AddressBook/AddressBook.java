import java.util.*;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phones = new HashSet<>();

    public void addContact(String name, String phone, String email) {

        if (phones.contains(phone)) {
            System.out.println("Duplicate phone number!");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phones.add(phone);

        System.out.println("Contact Added.");
    }

    public void searchContact(String name) {
        if (map.containsKey(name))
            System.out.println(map.get(name));
        else
            System.out.println("Contact not found.");
    }

    public void deleteContact(String name) {

        if (!map.containsKey(name)) {
            System.out.println("Contact not found.");
            return;
        }

        Contact c = map.get(name);
        contacts.remove(c);
        phones.remove(c.phone);
        map.remove(name);

        System.out.println("Contact Deleted.");
    }

    public void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        for (Contact c : contacts)
            System.out.println(c);
    }
}