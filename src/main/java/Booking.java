public class Booking {

    private Bedroom bedroom;
    private int noOfNights;


    public Booking(int noOfNights, Bedroom bedroom){
       this.bedroom = bedroom;
       this.noOfNights = noOfNights;
    }


    public int checkNoOfNights() {
        return this.noOfNights;
    }

    public Bedroom hasBedRoom(Bedroom bedroom) {
        return this.bedroom;
    }
}
