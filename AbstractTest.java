abstract class Vehicle { // Abstract class
    public abstract void drive();
    public abstract void playMusic();
}
abstract class Car extends Vehicle {
    public abstract void fly();
    public void drive() {
        System.out.println("Driving...");
    }
}
class WagenR extends Car { // Concreate class
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public void fly() {
        System.out.println("Flying...");
    }
}
public class AbstractTest {
    public static void main(String args[]) {
        Car obj = new WagenR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
