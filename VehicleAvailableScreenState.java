package state_pattern;

import java.util.List;
import java.util.Objects;

import src.CarFactory;
import src.Vehicle;
import src.VehicleCatalogClient;
import src.VehicleFactory;
import src.VehicleRepository;
import src.VehicleRepositoryImpl;


public class VehicleAvailableScreenState implements ScreenState {

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
                
                context.setState(new ViewVehicleScreenState());
                
             

       
    }

    @Override
    public void userInterfacePrinter(String output,String Input) {
        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        VehicleFactory vehicleFactory = new CarFactory(); // Assuming CarFactory implementation
    
        
        VehicleCatalogClient client = new VehicleCatalogClient(vehicleRepository, vehicleFactory);
        List<Vehicle> vehicles= client.browseVehicleCatalog(); 
        
        for (Vehicle vehicle : vehicles) {
            output = Objects.toString(output, "") + vehicle.getId()+"\t\t"+vehicle.getModel() + "\t\t" + vehicle.getType()+"\t\t"+vehicle.getVariant() + "\t\t"+vehicle.getPrice()+"\t\t"+vehicle.getDiscount()+"\n";
           
            
            
        }
    
      System.err.println(client.browseVehicleCatalog());
       
        System.out.println("************************************************************************************\r\n" + //
                        "View vehicles available (1)\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "Here are the vehicles available\r\n" + //
                        "Vehicle ID\t\tVehicle Name\t\tModel\t\tVariant\t\tPrice\t\tDiscount\r\n" + //
                        output + "\n" +
                        "Enter the vehicle number/ type you would like to filter/purchase.\r\n" + //
                        "************************************************************************************");
    }
    
}

