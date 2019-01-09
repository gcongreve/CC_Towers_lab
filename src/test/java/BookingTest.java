import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(5, 2, "double", 20);
        booking = new Booking(2, bedroom);
    }

    @Test
    public void hasNoOfNights() {
        assertEquals(2, booking.checkNoOfNights());
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.hasBedRoom(bedroom));
    }

     @Test
    public void canReturnBill(){
        assertEquals(40, booking.getTotalBill());
     }
}