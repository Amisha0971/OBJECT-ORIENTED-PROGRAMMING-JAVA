
// Motorcycle.java
public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, String model, boolean hasSideCar) {
        super(brand, model);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has side car: " + hasSideCar);
    }
}
