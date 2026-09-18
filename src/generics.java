import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String / Integer / Boolean > type argument (specifies the type)

        /*

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

         */

        /* --------------------------------------------------------------------

        BoxG<Integer> boxG = new BoxG<>();

        boxG.setItem(8);

        System.out.println(boxG.getItem());

        ProductG<String, Double> productG = new ProductG<>("apple",0.50);

        System.out.println(productG.getitem());
        System.out.println(productG.getPrice());

         --------------------------------------------------------------------- */

        ProductG<String, Double> productG1 = new ProductG<>("apple",0.50);
        ProductG<String, Integer> productG2 = new ProductG<>("ticket",15);

        System.out.println(productG2.getitem());
        System.out.println(productG2.getPrice());











    }
}
