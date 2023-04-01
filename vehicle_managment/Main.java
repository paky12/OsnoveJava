import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws DuplicateVehicleException, NoSuchVehicleException, InvalidInputException {
        VehicleManagerImpl vehicleManager = new VehicleManagerImpl();
        Scanner input = new Scanner(System.in);
        Logger logger = Logger.getLogger(Main.class.getName());
        /***
         * Vehicles added permamently for testing purpose
         */
        Vehicle vehicle1 = new Car("Toyota", "Yaris", 1998, "qwer123", "Red",
                "Benzin", "Coupe", 3);
        Vehicle vehicle2 = new Truck("Tesla", "Cybertruck", 2023, "yxcv4321", "Black",
                "Electric/Diesel", 300);
        vehicleManager.addVehicle(vehicle1);
        vehicleManager.addVehicle(vehicle2);

        /***
         * Start of the main program
         */
        while (true) {
            System.out.println("------------------------");
            System.out.println("1. ADD new vehicle to the fleet");
            System.out.println("2. SEARCH for vehicle by manufacturer, model or VIN");
            System.out.println("3. DELETE vehicle by VIN");
            System.out.println("4. PRINT out all vehicles in the system");
            System.out.println("5. EXIT the program");

            try{
                int usr_input = input.nextInt();
                input.nextLine();

                switch (usr_input) {
                    case 1: {
                        System.out.println("Car or Truck? :>  ");
                        String vehicleInput = input.nextLine();
                        try {
                            if (vehicleInput.toLowerCase().contains("truck")) {
                                System.out.println("Enter vehicle manufacturer :> ");
                                String manufacturer = input.nextLine();
                                System.out.println("Enter model :> ");
                                String model = input.nextLine();
                                System.out.println("Production date :> ");
                                int manufactureDate = input.nextInt();
                                input.nextLine();
                                System.out.println("Enter the VIN :> ");
                                String vin = input.nextLine();
                                System.out.println("Enter the color :> ");
                                String color = input.nextLine();
                                System.out.println("Enter fuel type :> ");
                                String fueltype = input.nextLine();
                                System.out.println("Enter towing capacity in litres :> ");
                                int towingCapacity = input.nextInt();
                                input.nextLine();

                                Truck truck = new Truck(manufacturer, model, manufactureDate, vin, color, fueltype, towingCapacity);
                                vehicleManager.addVehicle(truck);
                            } else if (vehicleInput.toLowerCase().contains("car")) {
                                System.out.println("Enter vehicle manufacturer :> ");
                                String manufacturer = input.nextLine();
                                System.out.println("Enter model :> ");
                                String model = input.nextLine();
                                System.out.println("Production date :> ");
                                int manufactureDate = input.nextInt();
                                input.nextLine();
                                System.out.println("Enter the VIN :> ");
                                String vin = input.nextLine();
                                System.out.println("Enter the color :> ");
                                String color = input.nextLine();
                                System.out.println("Enter fuel type :> ");
                                String fueltype = input.nextLine();
                                System.out.println("Enter body-type :> ");
                                String bodyType = input.nextLine();
                                System.out.println("Enter number of doors :> ");
                                int doorNumber = input.nextInt();
                                input.nextLine();

                                Car car = new Car(manufacturer, model, manufactureDate, vin, color, fueltype, bodyType, doorNumber);
                                vehicleManager.addVehicle(car);
                            } else {
                                throw new InvalidInputException("Invalid input: " + vehicleInput);
                            }
                        } catch (InvalidInputException e) {
                            logger.warning("Invalid input type ");
                            //input.nextLine(); // consume the input to prevent an infinite loop
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("Search by manufacturer (m), model (o), or VIN (v)? Hint! use 'm+o' for both");
                        String vSearch = input.nextLine();
                        String manufacturer, model, vin;
                        switch (vSearch) {
                            case "m" -> {
                                System.out.println("Enter manufacturer: ");
                                manufacturer = input.nextLine();
                                List<Vehicle> result = vehicleManager.searchVehicles(manufacturer, null, null);
                                if (result.isEmpty()) {
                                    System.out.println("No vehicles matching the search criteria were found.");
                                } else {
                                    for (Vehicle vehicle : result) {
                                        System.out.println(vehicleManager.vehicleToString(vehicle));
                                    }
                                }
                            }
                            case "o" -> {
                                System.out.println("Enter model: ");
                                model = input.nextLine();
                                List<Vehicle> result = vehicleManager.searchVehicles(null, model, null);
                                if (result.isEmpty()) {
                                    System.out.println("No vehicles matching the search criteria were found.");
                                } else {
                                    for (Vehicle vehicle : result) {
                                        System.out.println(vehicleManager.vehicleToString(vehicle));
                                    }
                                }
                            }
                            case "v" -> {
                                System.out.println("Enter VIN: ");
                                vin = input.nextLine();
                                List<Vehicle> result = vehicleManager.searchVehicles(null, null, vin);
                                if (result.isEmpty()) {
                                    System.out.println("No vehicles matching the search criteria were found.");
                                } else {
                                    for (Vehicle vehicle : result) {
                                        System.out.println(vehicleManager.vehicleToString(vehicle));
                                    }
                                }
                            }
                            case "m+o" -> {
                                System.out.println("Enter manufacturer: ");
                                manufacturer = input.nextLine();
                                System.out.println("Enter model: ");
                                model = input.nextLine();
                                List<Vehicle> result = vehicleManager.searchVehicles(manufacturer, model, null);
                                if (result.isEmpty()) {
                                    System.out.println("No vehicles matching the search criteria were found.");
                                } else {
                                    for (Vehicle vehicle : result) {
                                        System.out.println(vehicleManager.vehicleToString(vehicle));
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 3:
                        System.out.println("Enter VIN code for vehicle you want to delete: ");
                        String vin = input.nextLine();
                        vehicleManager.deleteVehicle(vin);
                        break;
                    case 4:
                        vehicleManager.listVehicles();
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        System.exit(0);
                        break;
                    default:{
                        System.out.println("Invalid input enter number 1-5");
                    }
            }

            }catch (InputMismatchException e){
                System.out.println("Invalid input enter number 1-5");
                input.nextLine();
            }



            }
        }
    }