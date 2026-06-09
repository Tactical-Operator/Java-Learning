package p2;
import p1.Vehicle;

public class Bike extends Vehicle {
    void showSpeed(){
        // allowed:subclass in different package
        speed=180;
        System.out.println(speed);
    }
}

