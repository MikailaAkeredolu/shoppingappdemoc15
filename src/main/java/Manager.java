public class Manager extends Employee{

    //fields
    private final double EXTRA_DISCOUNT = .05;
    private double salary;


    public Manager(String name, Size size, Cloth[] clothingItems, double salary) {
        super(name, size, clothingItems);
        this.salary = salary;
    }

    @Override
    public void printPriceAfterDiscount(Cloth clothingItem) {
        double originalPrice = clothingItem.getPrice();   // get the original price of the item
        double managerDiscount = EXTRA_DISCOUNT + DISCOUNT;//figure out the manager's discount
        double  discountAmount = originalPrice * managerDiscount ;     //   - cloth price multiplied by student discount
        double finalPrice = originalPrice - discountAmount; //       // Subtract the discount Amount from the original price
        System.out.println(finalPrice);       // print the final price after discount
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + ":" + salary);
        //loop through the arrays of clothing items
        //print each clothing item
        for(Cloth c: getClothingItems()){
            System.out.println(c);
        }

    }
}
