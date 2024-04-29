package phonebook;

import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<Record> records = new LinkedList<>();
        records.add(new Record("Alex", "111111111"));
        records.add(new Record("Roman", "131211411"));
        records.add(new Record("Alex", "113151419"));
        records.add(new Record("Alex", "113187171"));
        records.add(new Record("Danil", "141928957"));
        records.add(new Record("Danil", "1927501827"));
        records.add(new Record("Alex", "10129471909"));
        records.add(new Record("Adam", "1o54789236"));

        PhoneBook phoneBook = new PhoneBook(records);
        System.out.println(phoneBook.find("Alex"));
        System.out.println(phoneBook.findAll("Danil"));
    }
}
