public class composition {

    public static void main(String[] args) {

        // Composition = represents a "part-of" relationship between objects.
        //               For example, an Engine is "part-of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        CarC carC = new CarC("Corvette",2025,"V8");

        System.out.println(carC.model);
        System.out.println(carC.year);
        System.out.println(carC.engineC.type);

        carC.start();


    }
}
