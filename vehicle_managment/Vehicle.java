public class Vehicle {
    private String model, VIN, color, fuelType, manufacturer;
    private int manufactureDate;
    public Vehicle(String manufacturer, String model, int manufactureDate, String VIN, String color, String fuelType){
        this.manufacturer = manufacturer;
        this.model = model;
        this.manufactureDate = manufactureDate;
        this.VIN = VIN;
        this.color = color;
        this.fuelType = fuelType;
    }
    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public String getVIN() {
        return VIN;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
