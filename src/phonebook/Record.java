package phonebook;

public class Record {
    private String Name;
    private String phoneNumber;

    public Record(String name, String phoneNumber) {
        Name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Record{" +
                "Name='" + Name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
