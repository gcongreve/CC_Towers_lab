import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    Guest guest;
    DiningRoom diningRoom;

    @Before
    public void before(){
        guest = new Guest("Steve");
        diningRoom = new DiningRoom("Dinarium", 2);
    }

    @Test
    public void canHaveName(){
        assertEquals("Dinarium", diningRoom.getName());
    }

     @Test
    public void canHaveCapacity(){
        assertEquals(2, diningRoom.getCapacity());
    }

    @Test
    public void canStartEmpty(){
        assertEquals(0, diningRoom.noOfGuests());
    }


    @Test
    public void canTakeInGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.noOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom.addGuest(guest);
        diningRoom.removeGuest();
        assertEquals(0, diningRoom.noOfGuests());
    }



}
