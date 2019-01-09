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
        bedroom = new Bedroom(5, 2, "double", 30);
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

    @Test
    public void checkGuestInBedroom(){
        hotel.checkInBedroom(guest, bedroom);
        assertEquals(1, hotel.guestInBedroom(bedroom));
    }

    @Test
    public void removeGuestFromBedroom(){
        hotel.checkInBedroom(guest, bedroom);
        assertEquals(1, hotel.guestInBedroom(bedroom));
        hotel.checkOutBedroom(guest, bedroom);
        assertEquals(0, hotel.guestInBedroom(bedroom));
    }

    @Test
    public void checkGuestInConferenceRoom(){
        hotel.checkInConferenceRoom(guest, conference);
        assertEquals(1, hotel.guestInConference(conference));
    }

    @Test
    public void removeGuestFromConferenceRoom(){
        hotel.checkInConferenceRoom(guest, conference);
        assertEquals(1, hotel.guestInConference(conference));
        hotel.checkOutConferenceRoom(guest, conference);
        assertEquals(0, hotel.guestInConference(conference));
    }

    @Test
    public void checkGuestInDiningRoom(){
        hotel.checkInDiningRoom(guest, diningroom);
        assertEquals(1, hotel.guestInDiningRoom(diningroom));
    }
    @Test
    public void removeGuestInDiningRoom(){
        hotel.checkInDiningRoom(guest, diningroom);
        assertEquals(1, hotel.guestInDiningRoom(diningroom));
        hotel.checkOutDiningRoom(guest, diningroom);
        assertEquals(0, hotel.guestInDiningRoom(diningroom));
    }

    @Test
    public void canMakeBooking(){
        hotel.makeBooking(2, bedroom);
        assertEquals(1, hotel.noOfBookings());
    }

}
