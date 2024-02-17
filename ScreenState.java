package state_pattern;

import java.util.List;

public interface ScreenState {

    public void userInterfacePrinter(String Output,String prevInput);

    public void handleRequest(ScreenStateContext context, int choice);
}
