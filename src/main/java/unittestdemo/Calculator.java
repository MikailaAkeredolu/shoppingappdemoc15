package unittestdemo;

public class Calculator {

    public int[] multiplyArrayElementsByNumberGiven(int[] array, int number){
        int[] result = new int[array.length];
        for(int x = 0; x < array.length; x++){
                //multiply each elemnt by the given number
          result[x] = array[x] * number;
        }
        return result;
    }

    public double add(double x, double y){
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }


    public double calculateAreaOfCircle(double radius){
        //Pi * R * R
        return Math.ceil(Math.PI * radius * radius);
    }


    public boolean isGreater(int x, int y){
        //if x is greater than y - return true
        if(x > y){
            return true;
        }
        //else return false
        return false;
    }
}
