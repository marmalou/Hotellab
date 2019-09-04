import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Person person;
    private Bedroom doubleBedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void setUp(){
        hotel = new Hotel();
        person = new Person("John");
        doubleBedroom = new Bedroom(1, 2, "double");
        conferenceRoom = new ConferenceRoom("Kennedy", 150);
        hotel.addBedroom(doubleBedroom);
        hotel.addConferenceRoom(conferenceRoom);
    }

    @Test
    public void canCheckInToBedroom(){
        hotel.checkInBedroom(person, doubleBedroom);
        assertEquals(1, hotel.numberOfPeople());
    }

    @Test
    public void canCheckOutOfBedroom(){
        hotel.checkInBedroom(person, doubleBedroom);
        hotel.checkOutBedroom(person, doubleBedroom);
        assertEquals(0, hotel.numberOfPeople());
    }

    @Test
    public void canCheckIntoConferenceRoom(){
        hotel.checkInConferenceRoom(person, conferenceRoom);
        assertEquals(1, hotel.numberOfPeople());
    }

    @Test
    public void canCheckOutOfConferenceRoom(){
        hotel.checkInConferenceRoom(person, conferenceRoom);
        hotel.checkOutConferenceRoom(person, conferenceRoom);
        assertEquals(0, hotel.numberOfPeople() );
    }
}
