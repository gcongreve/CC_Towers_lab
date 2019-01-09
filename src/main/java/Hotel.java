import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningroom;
    private ArrayList<ConferenceRoom> conferencerooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name){
        this.name = name;
        bedrooms = new ArrayList <>();
        diningroom = new ArrayList <>();
        conferencerooms = new ArrayList <>();
        bookings = new ArrayList <>();
    }


    public String getName() {
        return this.name;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int noOfBedrooms() {
        return this.bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom room) {
        this.conferencerooms.add(room);
    }

    public int noOfConferenceRooms(){
        return this.conferencerooms.size();
    }

    public void addDiningRoom(DiningRoom diningroom) {
        this.diningroom.add(diningroom);
    }

    public int noOfDiningRooms() {
        return this.diningroom.size();
    }

    public void checkInBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public int guestInBedroom(Bedroom bedroom) {
        return bedroom.nofOfGuests();
    }
    public void checkInConferenceRoom(Guest guest, ConferenceRoom room){
        room.addGuest(guest);
    }
    public int guestInConference(ConferenceRoom room){
        return room.noOfGuests();
    }

    public void checkInDiningRoom(Guest guest, DiningRoom diningroom){
        diningroom.addGuest(guest);
    }
    public int guestInDiningRoom(DiningRoom room){
        return room.noOfGuests();
    }

    public void checkOutBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest();
    }

    public void checkOutConferenceRoom(Guest guest, ConferenceRoom conference) {
        conference.removeGuest();
    }

    public void checkOutDiningRoom(Guest guest, DiningRoom diningroom) {
        diningroom.removeGuest();
    }

    public Booking makeBooking(int numberOfNights, Bedroom bedroom) {
        Booking newBooking = new Booking(numberOfNights, bedroom);
        this.bookings.add(newBooking);
        return newBooking;
    }

    public int noOfBookings() {
        return this.bookings.size();
    }

}
