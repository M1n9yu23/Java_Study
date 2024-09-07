package ch08.sec12;


public class InstanceofExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        ride(vehicle);
        vehicle = new Taxi();
        System.out.println();
        ride(vehicle);
    }

    public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus bus){
            bus.checkFare();
        }
        vehicle.run();
    }
}
