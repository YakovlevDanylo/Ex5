package phonebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    List<Record> records;

    public PhoneBook() {
        records = new LinkedList<>();
    }

    public PhoneBook(LinkedList<Record> records) {
        this.records = records;
    }


    public void add(Record newRecord) {
        records.add(newRecord);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public ArrayList<Record> findAll(String name) {
        ArrayList<Record> recordsByName = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                recordsByName.add(record);
            }
        }
        if (recordsByName.isEmpty()) {
            return null;
        } else {
            return recordsByName;
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "records=" + records +
                '}';
    }
}
