public class Student extends Customer{
   public static long studentID;
   public long id = 0L; // 2
   private final double DISCOUNT = 0.05;

   public Student(String name, Size size, Cloth[] clothingItems) {
      super(name, size, clothingItems);
      studentID++; // 1 + 1
      id = studentID; // 2

   }


   @Override
   public void printPriceAfterDiscount(Cloth cloth) {
    /*
       get the original price of the item
       figure out the discount amount
         - cloth price multiplied by student discount
       Subtract the discount Amount from the original price
       print the final price after discount
     */



   }

   @Override
   public void printInfo() {

   }
}
