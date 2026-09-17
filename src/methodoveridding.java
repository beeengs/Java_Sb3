public class methodoveridding {
    public static void main(String[] args) {

        // Method overriding = then a subclass provides its own
        //                     implementation of a method that is already defined
        //                     Allows for code reusability and give specific implementation

        dogO DogO = new dogO();
        catO Cat0 = new catO();
        fishO FishO = new fishO();

        DogO.move();
        Cat0.move();
        FishO.move();



    }
}
