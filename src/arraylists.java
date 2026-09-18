import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arraylists {
    public static void main(String[] args) {

        // ArrayList = A resizable array that stores objects (autoboxing);
        //             Arrays are fixed in size, but Arraylists can change.

        //        ArrayList<Double> list = new ArrayList<>();

        //        list.add(3.14);
        //        list.add(1.99);
        //        list.add(2.01);
        //
        //        System.out.println(list);

        /* --------------------------------------------------------

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        // fruits.remove(01);
        // fruits.set(1, "Pineapple");

        // System.out.println(fruits.get(3));

        // System.out.println(fruits.size());

        Collections.sort(fruits);

        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

         ------------------------------------------------*/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList();

        System.out.println("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food number" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

    }
}
