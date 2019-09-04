import java.util.ArrayList;

public class Bedroom {

    private int number;
    private int capacity;
    private String type;
    private ArrayList<Person> people;

    public Bedroom(int number, int capacity, String type){
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.people = new ArrayList<Person>(capacity);
    }

    public boolean addGuest(Person person){
        if (people.size() < capacity){
            people.add(person);
            return true;
        }
        return false;
    }
    public int numberOfGuests(){
        return people.size();
    }

    public void removeGuest(Person person){
       people.remove(person);
    }
}


