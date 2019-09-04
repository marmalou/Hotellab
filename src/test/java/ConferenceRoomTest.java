import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private Person person;
    private ConferenceRoom conferenceroom;

    @Before
    public void setUp(){
        person = new Person("Boris");
        conferenceroom = new ConferenceRoom("Obama Room", 100);
    }

    @Test
    public void canAddMember(){
        assertEquals(true, conferenceroom.addMember(person));
        assertEquals(1, conferenceroom.numberOfMembers());
    }

    @Test
    public void canRemoveGuest() {
        conferenceroom.addMember(person);
        conferenceroom.removeMember(person);
        assertEquals(0, conferenceroom.numberOfMembers());
    }

}
