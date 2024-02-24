

// Main.java
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        car.displayInfo();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", false);
        motorcycle.displayInfo();
    }
}