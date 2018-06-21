package vehicles;

public class Car {
    private int Wheels;
    private int Doors;
    private Boolean used;
    
//---- CONSTRUCTOR ----
    
    public Car(int _doors, Boolean _used){
        this.Wheels=4;
        this.Doors=_doors;
        this.used=_used;
    }
    
//---- SETTERS AND GETTERS ----
    
    public int getWheels(){
        return Wheels;
    }
    
    public int getDoors() {
        return Doors;
    }
    
    public Boolean getUsed() {
        return used;
    }
}
