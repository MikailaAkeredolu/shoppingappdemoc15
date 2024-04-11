public class Student extends Customer{
   private static long id; //basketball
   private long studentID = 0L; // 2
   private final double DISCOUNT = 0.05;

   public Student(String name, Size size, Cloth[] clothingItems) {
      super(name, size, clothingItems);
      id++; // 1 + 2
      studentID = id; // 3

   }


   @Override
   public void printPriceAfterDiscount(Cloth cloth) {
      double originalPrice = cloth.getPrice();   // get the original price of the item
      double  discountAmount = originalPrice * DISCOUNT;     //   - cloth price multiplied by student discount
       double finalPrice = originalPrice - discountAmount; //       // Subtract the discount Amount from the original price
      System.out.println(finalPrice);       // print the final price after discount

   }

   @Override
   public void printInfo() {
      System.out.println(getName() + " : "+  studentID);

   }

   public void printUniqueStudentID(){
      System.out.println(studentID);
   }
}
