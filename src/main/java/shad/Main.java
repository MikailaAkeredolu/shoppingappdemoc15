package shad;

public class Main {

     public int x = 10; // Outer Global variable x


   public  void printX() {
       //The inner variable x shadows the outer variable x.
        int x = 20; // Inner variable, shadows the outer variable
        System.out.println("Inner local variable x: " + x); // Prints the value of the inner variable
       System.out.println("Outer variable x: " + this.x);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.printX(); // 20

        System.out.println(main.x);
    }
}
