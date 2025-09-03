package OPPS.TEST.QuickRide;


abstract public class Booking {
    protected boolean Booked;
    String name;
    int booking_ID;
    int price;

    Booking(String name, int booking_ID) {
        this.name = name;
        this.booking_ID = booking_ID;
    }
    abstract public void book();
    public static void main(String[] args){
        CAB car=new CAB("Saurav",122);
        TRN trn=new TRN("Saurav",143);
        BUS bus=new BUS("Saurav",1231);


        car.refund();
        trn.book();
        System.out.println(trn.price);
        trn.refund();
        System.out.println(bus.price);
        bus.book();
    }
}
interface refundable{
    void refund();
}

