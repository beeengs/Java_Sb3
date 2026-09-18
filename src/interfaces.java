public class interfaces {

    public static void main(String[] args) {

        // Interfaces = A blueprint for a class that specifies a set of abstract methods
        //              that implementing classes MUST define.
        //              Supports multiple inheritance-like behavior.

        RabbitIH rabbitIH = new RabbitIH();

        HawkIH hawkIH = new HawkIH();

        FishIH fishIH = new FishIH();


        rabbitIH.flee();
        hawkIH.hunt();

        System.out.println();

        fishIH.flee();
        fishIH.hunt();






    }
}
