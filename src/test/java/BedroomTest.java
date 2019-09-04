import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Person person;
    private Bedroom bedroom;


    @Before
    public void setUp() {
        person = new Person("Hugh");
        bedroom = new Bedroom(21, 2,"double");
    }

    @Test
    public void canAddGuest() {
        assertEquals(true, bedroom.addGuest(person));
        assertEquals(1, bedroom.numberOfGuests());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(person);
        bedroom.removeGuest(person);
        assertEquals(0, bedroom.numberOfGuests());
    }


}
