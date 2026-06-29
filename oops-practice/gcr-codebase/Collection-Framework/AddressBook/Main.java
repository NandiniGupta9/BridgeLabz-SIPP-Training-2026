public class Main {

    public static void main(String[] args) {

        AddressBook ab = new AddressBook();

        ab.addContact("Amit", "9876543210", "amit@gmail.com");
        ab.addContact("Riya", "9999999999", "riya@gmail.com");
        ab.addContact("Aman", "9876543210", "aman@gmail.com");

        ab.searchContact("Riya");

        ab.displayContacts();

        ab.deleteContact("Amit");

        ab.displayContacts();
    }
}