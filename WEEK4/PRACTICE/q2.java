class GameController{
    private String controllerBrand;
    private String connectionType;
    private boolean hasVibration;
    private int batteryLevel;
    private double sensitivity;
    GameController(){
        this.controllerBrand = "unknown";
        this.connectionType = "unknown";
        this.hasVibration = true;
        this.batteryLevel = 100;
        this.sensitivity = 56.79;
    }
    GameController(String controllerBrand,String connectionType,boolean hasVibration,int batteryLevel,double sensitivity){
        this.controllerBrand = controllerBrand;
        this.connectionType = connectionType;
        this.hasVibration = hasVibration;
        this.batteryLevel = batteryLevel;
        this.sensitivity = sensitivity;
    }
    void Display(){
        System.out.println("controllerBrand: " + controllerBrand);
        System.out.println("connectionType: " + connectionType);
        System.out.println("hasVibration: " + hasVibration);
        System.out.println("batteryLevel: " + batteryLevel);
        System.out.println("Senstivity: " + sensitivity);
    }
}

public class q2 {
    public static void main(String[] args){
        GameController c1 = new GameController();
        c1.Display();
    }
}
