import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private ArrayList<Person> people;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.people = new ArrayList<Person>();

    }

    public boolean addMember(Person person) {
        if (people.size() < capacity) {
            people.add(person);
            return true;
        }
        return false;
    }

    public int numberOfMembers() {
        return people.size();
    }

    public void removeMember(Person person) {
        people.remove(person);
    }
}
