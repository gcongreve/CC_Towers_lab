import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Guest guest;
    ConferenceRoom room;


    @Before
    public void before(){
        guest = new Guest("Thomas McGuire");
        room = new ConferenceRoom("The Hancock Suite", 3);
    }

    @Test
    public void hasName(){
        assertEquals("The Hancock Suite", room.getRoomName());
    }
    @Test
    public void hasCapacity(){
        assertEquals(3, room.getCapacity());
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest);
        assertEquals(1, room.noOfGuests());
    }

    @Test
    public void canCheckoutGuest(){
        room.addGuest(guest);
        room.removeGuest();
        assertEquals(0, room.noOfGuests());
    }
    @Test
    public void checkRoomCapacity(){
        room.addGuest(guest);
        room.addGuest(guest);
        room.addGuest(guest);
        room.addGuest(guest);
        assertEquals(3, room.noOfGuests());
    }
}
