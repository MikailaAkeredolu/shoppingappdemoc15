public class Main {
    public static void main(String[] args) {

        //create an object
        // DataType object = new Student(String name, Size size, Cloth[] clothingItems);
             Cloth clothingItem1 = new Cloth("Levi Jeans", 20.00, Size.S);  //make some clothing items objects
        //System.out.println(clothingItem1);
             Cloth clothingItem2 = new Cloth("T-shirt", 10.00, Size.M);
             Cloth clothingItem3 = new Cloth("Hat", 1.0, Size.L);
        //make a list of clothing item objects
        //DataType nameOfthearray = new DataType[3];
        //DataType nameOfthearray = {object1,object2,object3};
        Cloth[] clothingItems = {clothingItem1, clothingItem2, clothingItem3};
        System.out.println("print out every element in an array");
        //System.out.println(clothingItems.length);
        Student student1 = new Student("jane", Size.L,clothingItems );
        //objectName.methodName();
        student1.printPriceAfterDiscount(clothingItem1);
        student1.printPriceAfterDiscount(clothingItem3);
        student1.printInfo();
        student1.printUniqueStudentID();

        Student student2 = new Student("jack", Size.XL,clothingItems );
        student2.printUniqueStudentID();

        Student student3 = new Student("john", Size.L,clothingItems );
        student3.printUniqueStudentID();

        //Invoke or call a static method
        //ClassName.methodName();
        //System.out.println(ShopApp.isAFit(student3, clothingItem3));
        boolean result = ShopApp.isAFit(student3, clothingItem3);
        System.out.println(result);

        Manager manager = new Manager("Terry", Size.L, clothingItems, 100000.00);
        manager.printInfo();


        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex",Size.L, clothingItems, 40.0f, 20.0);
        hourlyEmployee.printInfo();


    }
}
