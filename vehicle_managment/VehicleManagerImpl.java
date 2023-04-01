import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehicleManagerImpl implements VehicleManager{
    private Map<String, Vehicle> vehicles = new HashMap<>();

    private Logger logger = Logger.getLogger(VehicleManagerImpl.class.getName());

    /***
     * Adding new vehicle to the fleet!, check the VIN string for duplicates.
     * @param vehicle
     * @throws DuplicateVehicleException
     */
    @Override
    public void addVehicle(Vehicle vehicle) throws DuplicateVehicleException{
        //Checks for duplicate vehicle in fleet by VIN
        if(vehicles.containsKey(vehicle.getVIN())){
            String msg = "Vehicle with VIN: " + vehicle.getVIN() + " is already in the system.";
            logger.log(Level.WARNING, msg);
            throw new DuplicateVehicleException(msg);
        }
        //Add vehicle to the hashMap
        vehicles.put(vehicle.getVIN(), vehicle);
    }
    /***
     * search vehicle in  vehicles map by making temp list for storing and printing result
     * @param manufacturer
     * @param model
     * @param vin
     * @return
     */
    @Override
    public List<Vehicle> searchVehicles(String manufacturer, String model, String vin) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles.values()){
            if((manufacturer == null || manufacturer.equalsIgnoreCase(vehicle.getManufacturer()))
                    && (model == null || model.equalsIgnoreCase(vehicle.getModel()))
                    && (vin == null || vin.equalsIgnoreCase(vehicle.getVIN()))) {
                result.add(vehicle);
            }
        }
        return result;
    }
    /***
     * Prints all vehicles registered in the system
     * @return
     */

    public String vehicleToString(Vehicle vehicle) {
        String str = "Vehicle -> ";
        str += " Manufacturer: " + vehicle.getManufacturer() +
                ", Model: " + vehicle.getModel() +
                ", Manufacture Date: " + vehicle.getManufactureDate() +
                ", VIN: " + vehicle.getVIN() +
                ", Color: " + vehicle.getColor() +
                ", Fuel Type: " + vehicle.getFuelType();
        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
            str += ", Body Type: " + car.getBodyType() +
                    ", Door number: " + car.getDoorNumber();
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            str += ", Towing capacity: " + truck.getTowingCapacity();
        }

        return str;
    }
    @Override
    public List<Vehicle> listVehicles() {
        List<Vehicle> vehicleList = new ArrayList<>(vehicles.values());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicleToString(vehicle));
        }
        return vehicleList;
    }

    /***
     * Takes users VIN input and deletes corresponding vehicle
     * @param vin
     * @throws NoSuchVehicleException when vehicle dosent exists
     */
    @Override
    public void deleteVehicle(String vin) throws NoSuchVehicleException {
        if(!vehicles.containsKey(vin)){
            String msg = "Vehicle with VIN: " + vin + " does not exist.";
            logger.log(Level.WARNING, msg);
            //throw new NoSuchVehicleException(msg);
        }
        vehicles.remove(vin);
    }
}
