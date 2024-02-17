package state_pattern;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import src.Payment;
import src.Vehicle;
import src.VehicleCatalogClient;
import src.VehicleRepositoryImpl;
import src.CarFactory;
import src.Vehicle;
import src.VehicleCatalogClient;
import src.VehicleFactory;
import src.VehicleRepository;
import src.VehicleRepositoryImpl;

public class PurchaseScreenState implements ScreenState {

        private static final String OrderId = null;

        @Override
        public void handleRequest(ScreenStateContext context, int choice) {
            switch (choice) {
                case 1:
                    context.setState(new TrackOrderScreenState());
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
        public void userInterfacePrinter(String Output,String Input) {
            String paymentId="";
            LocalDate paymentDate=LocalDate.now();
            double amount=0.0;
            Payment payemntDetails = new Payment(paymentId, OrderId, amount, paymentDate);
            payemntDetails.processPayment();
             ScreenStateContext screenStateContext = new ScreenStateContext();
        String prevInput=screenStateContext.getpreScreenSelection();
        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        VehicleFactory vehicleFactory = new CarFactory(); // Assuming CarFactory implementation
        System.out.println(prevInput);
        
        VehicleCatalogClient client = new VehicleCatalogClient(vehicleRepository, vehicleFactory);
        List<Vehicle> vehicles = client.searchVehicleCatalog(prevInput); 
        String OrderId = "ORD000"+prevInput;
        for (Vehicle vehicle : vehicles) {
        Output = Objects.toString(Output, "") + OrderId+"\t\t"+vehicle.getModel()+"\t\t"+vehicle.getType()  + "\t\t" +vehicle.getVariant() + "\t\t"+(vehicle.getPrice()-vehicle.getDiscount())+"\n";
           
            
            
        }
            System.out.println("************************************************************************************\r\n" + //
                            "Purchase Status (1)\r\n" + //
                            "************************************************************************************\r\n" + //
                            "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                            "\r\n" + //
                            "Purchase Sucessfull\r\n" + //
                            "OrderId\t\t\tVehicle Name      Model      Variant     TOTAL PRICE\r\n" + //
                            Output+
                            "\r\n" + //
                            "1. To Track Status\r\n" + //
                            "2. Go to vehicle dispaly\r\n" + //
                            "************************************************************************************");
        }
        
    
}

