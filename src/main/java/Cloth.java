public class Cloth {

    private String name ;
    private double price;
    private Size size;

    public Cloth(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    //getPrice
    public double getPrice(){
        return this.price;
    }

    public Size getSize() {
        return size;
    }
}
