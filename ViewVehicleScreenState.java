package state_pattern;

import java.util.List;
import java.util.Objects;

import src.CarFactory;
import src.Vehicle;
import src.VehicleCatalogClient;
import src.VehicleFactory;
import src.VehicleRepository;
import src.VehicleRepositoryImpl;

public class ViewVehicleScreenState implements ScreenState {

    

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
        switch (choice) {
            case 1:
                context.setState(new PurchaseScreenState());
                break;
            case 2:
                context.setState(new VehicleAvailableScreenState());
                break;
            default:
                System.out.println("Wrong Input\n");
                break;
        }
    }

    @Override
    public void userInterfacePrinter(String output,String Input) {
        ScreenStateContext screenStateContext = new ScreenStateContext();
        String prevInput=screenStateContext.getpreScreenSelection();
        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        VehicleFactory vehicleFactory = new CarFactory(); // Assuming CarFactory implementation
        System.out.println(prevInput);
        
        VehicleCatalogClient client = new VehicleCatalogClient(vehicleRepository, vehicleFactory);
        List<Vehicle> vehicles = client.searchVehicleCatalog(prevInput); 
  
        
        for (Vehicle vehicle : vehicles) {
            output = Objects.toString(output, "") + vehicle.getId()+"\t\t"+vehicle.getModel() + "\t\t" + vehicle.getType()+"\t\t"+vehicle.getVariant() + "\t\t"+vehicle.getPrice()+"\t\t"+vehicle.getDiscount()+"\n";
           
            
            
        }
        
        System.out.println("************************************************************************************\r\n" + //
                        "View Vehicle (1)\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "You are purchasing <Vehicle Info HERE>\r\n" + //
                        "Vehicle Name      Model      Variant     Price     Discount    TOTAL PRICE\r\n" + //
                         output + //
                        "\r\n" + //
                        "Enter your choice:\r\n" + //
                        "1. Purchase\r\n" + //
                        "2. Cancel\r\n" + //
                        "************************************************************************************");
    }
    
}

