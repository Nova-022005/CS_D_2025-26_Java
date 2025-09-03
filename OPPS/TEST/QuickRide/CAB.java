package OPPS.TEST.QuickRide;

public class CAB extends Booking implements refundable{
    CAB(String name, int booking_ID){
        super(name,booking_ID);
        this.price=500;
    }
    @Override
    public void book() {
        System.out.println(name+"your ride is booked ");
        this.Booked=true;
    }
    public void refund(){
        try {
                if (!Booked) {
                    throw new Booking_Exception(" Booking not found ");
                }
                System.out.println(name + ", your booking is cancelled. You get ₹300 as refund.");
            } catch (Booking_Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

