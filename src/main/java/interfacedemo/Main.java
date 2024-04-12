package interfacedemo;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        // ObjectName.concreteMethodName();
        //car.startVehicle();
       // car.printMilesPerHour();

        //ClassName.staticMethodName();
       // Vehicle.startEngine(car);

        Tractor tractor = new Tractor();
       // tractor.printMilesPerHour();

        Train train = new Train();
        //train.printMilesPerHour();

        Vehicle honda = new Car();
        //Vehicle.startEngine(honda);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = tractor;
        vehicles[2] = train;

        for (Vehicle v: vehicles) {
            v.startVehicle();
        }



    }
}
