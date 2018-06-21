package vehicles;

public class Car {
    private int wheels;
    private int doors;
    private Boolean used;
    
//---- CONSTRUCTOR ----
    
    public Car(int _doors, Boolean _used){
        this.wheels=4;
        this.doors=_doors;
        this.used=_used;
    }
    
//---- SETTERS AND GETTERS ----
    
    public int getWheels(){
        return wheels;
    }
    
    public int getDoors() {
        return doors;
    }
    
    public Boolean getUsed() {
        return used;
    }
}
