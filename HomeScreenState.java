package state_pattern;

public class HomeScreenState implements ScreenState {

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'choice1'");
    }

    @Override
    public void userInterfacePrinter(String Output,String Input) {
        System.out.println("************************************************************************************\r\n" + //
                        "Home Page (1)\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "Welcome to AI-BITS Showroom\r\n" + //
                        "1. View vehicles available\r\n" + //
                        "2. Track Order\r\n" + //
                        "\r\n" + //
                        "************************************************************************************");
    }
    
}

