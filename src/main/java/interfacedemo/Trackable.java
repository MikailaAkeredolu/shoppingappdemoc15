package interfacedemo;

public interface Trackable {
    default void printMilesPerHour(){
        System.out.println("tracking speed");
    }
}
