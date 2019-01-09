import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> diners;

    public DiningRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.diners = new ArrayList <>();
    }


    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int noOfGuests() {
        return this.diners.size();
    }

    public void addGuest(Guest guest) {
        if (noOfGuests() < this.capacity)
        this.diners.add(guest);
    }

    public void removeGuest() {
        this.diners.remove(0);
    }
}
