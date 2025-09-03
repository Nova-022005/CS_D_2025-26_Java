package OPPS.TEST.QuickRide;

public class BUS extends Booking{
    public BUS(String name, int booking_ID){
        super(name,booking_ID);
        this.price=200;
    }
    @Override
    public void book() {
        System.out.println("Your Bus Booking is Successful");
    }
}
