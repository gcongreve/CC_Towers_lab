import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    DiningRoom diningroom;
    ConferenceRoom conference;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void Before(){
        hotel = new Hotel("The Faulty Towers");
        diningroom = new DiningRoom("The Banquet", 4);
        conference = new ConferenceRoom("The Dungeon", 4);
        bedroom = new Bedroom(5, 2, "double");
        guest = new Guest("Jeremy Bentham");
    }

    @Test
    public void hasHotelName(){
        assertEquals("The Faulty Towers", hotel.getName());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.noOfBedrooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conference);
        assertEquals(1, hotel.noOfConferenceRooms());
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningroom);
        assertEquals(1, hotel.noOfDiningRooms());
    }

}
