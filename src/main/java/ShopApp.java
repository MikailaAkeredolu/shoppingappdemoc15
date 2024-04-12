public class ShopApp {
//Static belong to the Class
    public static boolean isAFit(Customer customer, Cloth cloth ){
        Size customerSize = customer.getSize();   //get customer  size
        Size clothSize = cloth.getSize();      //get the size of the cloth
        if(customerSize == clothSize){
            return true; //if it fits - return true
        }
        return false;    // if not return false
    }



    public static double calculateSubTotal(Cloth[] cloths){
        //do some magic
        return 0.0;
    }

}
