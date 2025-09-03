package OPPS.Abstraction;

abstract public class Vehicle {
    int no_tyre;
    void common(){
        System.out.println("This the common method for all vehicle.");
    }
    void name(){

    }
    abstract void stop();
    public static void main(String[] args){
        Car car=new Car();
//        car.no_tyre=4;
//        car.common();
//        car.stop();

    }

}
