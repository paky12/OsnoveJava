public class Truck extends Vehicle {
    private int towingCapacity;

    //konstruktor
    public Truck(String manufacturer, String model, int manufactureDate, String VIN, String color, String fuelType, int towingCapacity) {
        super(manufacturer, model, manufactureDate, VIN, color, fuelType);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
