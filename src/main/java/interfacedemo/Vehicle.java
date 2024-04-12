package interfacedemo;

public interface Vehicle extends Driveable, Rideable   {
    //abstract methods - signatures
    void startVehicle();
    void stopVehicle();

    //default methods -
    default void printMilesPerHour(){
        System.out.println("This vehicle travels at 100 miles per hour");
    }


    //static methods - belong to the Class

    static void startEngine(Vehicle vehicle){
        vehicle.startVehicle();
    }


}
