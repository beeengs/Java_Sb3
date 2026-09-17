import java.util.Scanner;

public class objectorientedprogramming {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

       CarOOP carOOP = new CarOOP();

       //  System.out.println(carOOP.make);
       //  System.out.println(carOOP.model);
       //  System.out.println(carOOP.year);
       //  System.out.println(carOOP.price);
       //  System.out.println(carOOP.isRunning);

        System.out.println(carOOP.isRunning);
        carOOP.start();
        System.out.println(carOOP.isRunning);
        carOOP.stop();
        System.out.println(carOOP.isRunning);

        carOOP.drive();
        carOOP.brake();

        System.out.println();

        CarOOP carOOP1 = new CarOOP();
        CarOOP carOOP2 = new CarOOP();

        System.out.println(carOOP1.make + " " + carOOP1.model);
        System.out.println(carOOP2.make + " " + carOOP2.model);

    }
}
