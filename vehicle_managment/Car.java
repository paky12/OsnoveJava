public class Car extends Vehicle {
    private String bodyType;
    private int doorNumber;

    //konstruktor
    public Car(String manufacturer, String model, int manufactureDate, String VIN, String color, String fuelType, String bodyType, int doorNumber) {
        super(manufacturer, model, manufactureDate, VIN, color, fuelType);
        this.bodyType = bodyType;
        this.doorNumber = doorNumber;
    }

    public String getBodyType() {
        return bodyType;
    }
    public int getDoorNumber() {
        return doorNumber;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }
}
