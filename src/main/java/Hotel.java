import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningroom;
    private ArrayList<ConferenceRoom> conferencerooms;

    public Hotel(String name){
        this.name = name;
        bedrooms = new ArrayList <>();
        diningroom = new ArrayList <>();
        conferencerooms = new ArrayList <>();
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

}
