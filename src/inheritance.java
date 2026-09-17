public class inheritance {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent

        dog_I Dog_I = new dog_I();
        cat_I Cat_I = new cat_I();
        plant_I Plant_I = new plant_I();

        System.out.println(Dog_I.isAlive);
        System.out.println(Cat_I.isAlive);
        System.out.println(Plant_I.isAlive);

        System.out.println();

        Dog_I.eat();
        Cat_I.eat();
        Plant_I.photosynthesis();

        System.out.println();

        System.out.println(Dog_I.lives);
        System.out.println(Cat_I.lives);

        System.out.println();

        Dog_I.speak();
        Cat_I.speak();

    }
}
