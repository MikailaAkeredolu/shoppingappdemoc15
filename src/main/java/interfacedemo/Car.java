package interfacedemo;

public class Car implements Vehicle, Flyable {


    @Override
    public void startVehicle() {
        System.out.println("starting car");
    }

    @Override
    public void stopVehicle() {
        System.out.println("stopping car");
    }

    @Override
    public boolean isDriveable() {
        return true;
    }

    @Override
    public boolean isFlyable() {
        return false;
    }


    @Override
    public boolean isRideable() {
        return true;
    }

    @Override
    public void printMilesPerHour() {
        Vehicle.super.printMilesPerHour();
    }
}
