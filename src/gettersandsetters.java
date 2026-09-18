public class gettersandsetters {
    public static void main(String[] args) {

        // They help protect object data and rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        CarGS carGS = new CarGS("Charger", "Yellow", 10000);

        carGS.setColor("Blue");
        carGS.setPrice(-100);


        // carGS.model = "Corvette";

        System.out.println(carGS.getColor() + " " + carGS.getModel() + " " + carGS.getPrice());

    }
}
