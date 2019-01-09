import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList <>();
    }

    public String getRoomName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest) {
        if (noOfGuests() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public int noOfGuests() {
        return this.guests.size();
    }

    public void removeGuest() {
        this.guests.remove(0);
    }
}
