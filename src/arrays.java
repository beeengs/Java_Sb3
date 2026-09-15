import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * think of it is as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana","coconut"};

        // fruits[1] = "pineapple";

        // int numOfFruits = fruits.length;

        // System.out.println(numOfFruits);

        for(int i = 0; i <fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }

        System.out.println();
        System.out.println();

       // Arrays.sort(fruits);

        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }





    }
}
