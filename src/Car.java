
// Car.java
public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, int numOfDoors) {
        super(brand, model);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numOfDoors);
    }
}
