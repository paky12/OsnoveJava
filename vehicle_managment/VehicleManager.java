import java.util.List;
public interface VehicleManager {
     /**
      * Adds new vehicle, throws warning if vehicle already exists.
      **/
    void addVehicle(Vehicle vehicle) throws DuplicateVehicleException;

    /***
     * Search the fleet of vehicles by manufacturer, model or VIN
     */

    List<Vehicle> searchVehicles(String manufacturer,String model, String vin);

    /***
     * List all vehicles in the system.
     */

    List<Vehicle> listVehicles();

    /***
     * Delete vehicle by the VIN, throw exception if v dosen't exist
     */
    void deleteVehicle(String vin) throws NoSuchVehicleException;
}
