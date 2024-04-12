package interfacedemo;

public class Train implements Vehicle, Trackable{


    @Override
    public void printMilesPerHour() {
        //Vehicle.super.printMilesPerHour();
        Trackable.super.printMilesPerHour();
    }

    @Override
    public void startVehicle() {
        System.out.println("starting train");
    }

    @Override
    public void stopVehicle() {
        System.out.println("stopping train");
    }



    @Override
    public boolean isDriveable() {
        return false;
    }

    @Override
    public boolean isRideable() {
        return false;
    }
}
