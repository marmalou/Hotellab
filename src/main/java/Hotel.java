import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void checkInBedroom(Person person, Bedroom bedroom) {
        Bedroom selectedBedroom = bedrooms.get(bedrooms.indexOf(bedroom));
        selectedBedroom.addGuest(person);
    }

    public void checkOutBedroom(Person person, Bedroom bedroom) {
        Bedroom selectedBedroom = bedrooms.get(bedrooms.indexOf(bedroom));
        selectedBedroom.removeGuest(person);
    }

    public void checkInConferenceRoom(Person person, ConferenceRoom cRoom) {
        ConferenceRoom sRoom = conferenceRooms.get(conferenceRooms.indexOf(cRoom));
        sRoom.addMember(person);
    }

    public void checkOutConferenceRoom(Person person, ConferenceRoom cRoom) {
        ConferenceRoom sRoom = conferenceRooms.get(conferenceRooms.indexOf(cRoom));
        sRoom.removeMember(person);
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }


    public int numberOfPeople() {
        int total = 0;
        for (Bedroom b : bedrooms) {
            total += b.numberOfGuests();
        }

        for (ConferenceRoom c : conferenceRooms) {
            total += c.numberOfMembers();
        }

        return total;
    }
}
