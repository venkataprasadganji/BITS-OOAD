package state_pattern;

public class RegisterScreenState implements ScreenState {

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'choice1'");
    }

    @Override
    public void userInterfacePrinter(String Output,String Input) {
        System.out.println("************************************************************************************\r\n" + //
                        "Register Screen (1)\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "Enter your first name:\r\n" + //
                        "Enter your last name:\r\n" + //
                        "Enter your email:\r\n" + //
                        "Enter your phone number:\r\n" + //
                        "************************************************************************************");
    }
    
}

