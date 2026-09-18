public class tostringmethod {

    public static void main(String[] args) {

        // .toString() = Method inheritances from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        CarTS carTS1 = new CarTS("Ford", "Mustang",2025,"Red");
        CarTS carTS2 = new CarTS("Chevrolet", "Corvette",2026,"Blue");

        System.out.println(carTS1);
        System.out.println(carTS2);

    }
}
