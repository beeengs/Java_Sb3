public class arrayofobjects {
    public static void main(String[] args) {

         CarAOO carAOO1 = new CarAOO("Mustang", "Red");
         CarAOO carAOO2 = new CarAOO("Covette", "Blue");
         CarAOO carAOO3 = new CarAOO("Charger", "Yellow");

         CarAOO[] cars = {carAOO1, carAOO2, carAOO3};

        for(CarAOO carAOO : cars){
            carAOO.drive();
        }

        System.out.println();

        CarAOO[] cars2 = { new CarAOO("Mustang", "Red"), new CarAOO("Corvetter", "Blue"), new CarAOO("Charger","Yellow")};

        for(CarAOO carAOO : cars2){
            carAOO.color = "black";
        }

        for(CarAOO carAOO : cars2){
            carAOO.drive();
        }



    }
}
