public class HourlyEmployee extends Employee{

    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size, Cloth[] clothingItems, float hoursWorked, double hourlyWage) {
        super(name, size, clothingItems);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void printPriceAfterDiscount(Cloth clothingItem) {
        double originalPrice = clothingItem.getPrice();   // get the original price of the item
        double  discountAmount = originalPrice * DISCOUNT;     //   - cloth price multiplied by student discount
        double finalPrice = originalPrice - discountAmount; //       // Subtract the discount Amount from the original price
        System.out.println(finalPrice);       // print the final price after discount

    }

    @Override
    public void printInfo() {

    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
