import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    Guest guest3;

    @Before
    public void Before(){
        bedroom = new Bedroom(1, 2, "Double");
        guest = new Guest("James");
        guest2 = new Guest("David");
        guest3 = new Guest("Steven");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals("Double", bedroom.getRoomType());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.nofOfGuests());
    }
    @Test
    public void checkCanAdd2Guests(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        assertEquals(2,bedroom.nofOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        bedroom.removeGuest();
        assertEquals(1,bedroom.nofOfGuests());
    }


}
