class GameController{
    private String controllerBrand;
    private String connectionType;
    private boolean hasVibration;
    private int batteryLevel;
    private double sensitivity;
    GameController(){
        this.controllerBrand = "Generic pad";
        this.connectionType = "USB";
        this.hasVibration = true;
        this.batteryLevel = 100;
        this.sensitivity = 1.0;
    }
    GameController(String controllerBrand,String connectionType,boolean hasVibration,int batteryLevel,double sensitivity){
        this.controllerBrand = controllerBrand;
        this.connectionType = connectionType;
        this.hasVibration = hasVibration;
        
        if(batteryLevel < 0){
            this.batteryLevel=0;
        }else if(batteryLevel > 100){
            this.batteryLevel=100;
        }else{
            this.batteryLevel=batteryLevel;
        }

        if(sensitivity < 0.1){
            this.sensitivity = 0.1;
        }else if(sensitivity > 3.0){
            this.sensitivity = 3.0;
        }else{
            this.sensitivity=sensitivity;
        }
    }
    // 2 parameter rest default
        GameController(String brand, String connectionType) {
        this.controllerBrand = brand;
        this.connectionType = connectionType;
        this.hasVibration = true;   // default
        this.batteryLevel = 100;    // default
        this.sensitivity = 1.0;     // default
    }

    public void calibrateController() {
        System.out.println("Calibrating " + controllerBrand + " controller...");
    }

    void Display(){
        System.out.println("controllerBrand: " + controllerBrand);
        System.out.println("connectionType: " + connectionType);
        System.out.println("hasVibration: " + hasVibration);
        System.out.println("batteryLevel: " + batteryLevel);
        System.out.println("Senstivity: " + sensitivity);
    }

       public void testVibration() {
        if (hasVibration) {
            System.out.println("*BUZZ* Vibration test successful!");
        } else {
            System.out.println("Vibration disabled on this controller.");
        }
    }

}

public class q2 {
    public static void main(String[] args){
        System.out.println("=== GAMING CONTROLLER SETUP ===");

        // Create controller with default constructor
        GameController defaultController = new GameController();
        defaultController.Display();
        defaultController.calibrateController();
        defaultController.testVibration();

        // Create controller with full parameterized constructor
        GameController customController = new GameController("ProGamerX", "Wireless",
                false, 85, 2.5);
        customController.Display();
        customController.calibrateController();
        customController.testVibration();

        // Create controller with convenience constructor
        GameController semiCustomController = new GameController("BudgetPad", "Bluetooth");
        semiCustomController.Display();
        semiCustomController.calibrateController();
        semiCustomController.testVibration();
    }
    }

