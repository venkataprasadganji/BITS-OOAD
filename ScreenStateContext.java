package state_pattern;
public class ScreenStateContext {
    
    private static final String String = null;
    ScreenState currentState;
    private static String prevInput = "";

    public void setState(ScreenState state) {
        this.currentState = state;
      
    }
    
    public void updateUiFromState(){
        currentState.userInterfacePrinter(String,String);
    }

    public void request(int choice) {
        currentState.handleRequest(this, choice);
    }
    

    public String getpreScreenSelection() {
        return prevInput;
    }

    public void setpreScreenSelection(String newValue) {
        prevInput = newValue;
    }
    
}
