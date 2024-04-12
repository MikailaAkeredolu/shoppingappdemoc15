public class Business implements Payable{

    private String name;
    private int qtySupplied;

    private double productType;

    public Business(String name,  int qtySupplied, double productType ){
        this.name = name;
        this.qtySupplied = qtySupplied;
        this.productType = productType;
    }

    @Override
    public double calculatePay() {
        return qtySupplied * productType;
    }
}
