package OPPS.TEST.QuickRide;

public class TRN extends Booking implements refundable{
    public TRN(String name, int booking_ID){
        super(name,booking_ID);
        this.price=1200;
    }
    public void refund(){
        System.out.println(name+"your booking is cancelled you get 1000 as refund");
    }
    @Override
    public void book() {
        System.out.println("Your Train Booking is  Successful");
    }
}
