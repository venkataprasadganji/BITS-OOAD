package state_pattern;

public class TrackOrderScreenState implements ScreenState {

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'choice1'");
    }

    @Override
    public void userInterfacePrinter(String Output,String Input) {
        System.out.println("************************************************************************************\r\n" + //
                        "Track Order (1)\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "List of orders are mentioned below\r\n" + //
                        "OrderId\t\t\tVehicle Name      Model      Variant     TOTAL PRICE\r\n" + //
                        "1200001\t\t\tTOYOTA Canberry   V1         ALPHA       86.5L\r\n" + //
                        "1200002\t\t\tTOYOTA Canberry   V2         BETA        1.2Cr\r\n" + //
                        "\r\n" + //
                        "1. Enter Order ID to view the status of vehicle.\r\n" + //
                        "2. Cancel\r\n" + //
                        "************************************************************************************");
    }
    
}

