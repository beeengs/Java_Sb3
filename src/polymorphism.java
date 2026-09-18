public class polymorphism {

    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        CarP carP = new CarP();
        BikeP bikeP = new BikeP();
        BoatP boatP = new BoatP();

        VehicleP[] vehiclePS = {carP, bikeP, boatP};

        for(VehicleP vehicleP : vehiclePS){
            vehicleP.go();
        }



    }

}
