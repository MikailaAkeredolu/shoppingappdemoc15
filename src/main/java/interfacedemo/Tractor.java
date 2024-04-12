package interfacedemo;

public class Tractor implements Vehicle{
    @Override
    public boolean isDriveable() {
        return false;
    }

    @Override
    public boolean isRideable() {
        return false;
    }

    @Override
    public void startVehicle() {
        System.out.println("starting tractor");
    }

    @Override
    public void stopVehicle() {
        System.out.println("stopping tractor");
    }

    @Override
    public void printMilesPerHour() {
        System.out.println("Tractors go 50 miles per hour");
    }
}
