import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList <>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }


    public String getRoomType() {
        return this.type;
    }

    public void addGuest(Guest guest) {
        if (nofOfGuests() < this.capacity)
            this.guests.add(guest);
        }

    public int nofOfGuests(){
        return this.guests.size();
    }

    public void removeGuest() {
        this.guests.remove(0);
    }
}
