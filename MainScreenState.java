package state_pattern;

public class MainScreenState implements ScreenState {

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
        switch (choice) {
            case 1:
                context.setState(new LoginScreenState());
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
        System.out.println("************************************************************************************\r\n" + //
                        "Main Screen\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "Enter the number from following actions:\r\n" + //
                        "1. Login\r\n" + //
                        "2. Register\r\n" + //
                        "************************************************************************************");
    }
    
}
