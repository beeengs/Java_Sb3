import java.util.Scanner;

public class runtimepolymorphism {
   public static void main(String[] args) {

       // Runtime polymorphism = When the method that gets executed is decided
       //                        at runtime based on the actual type of the object.

       Scanner scanner = new Scanner(System.in);

       AnimalRP animalRP;

       System.out.println("would you like a dog or a cat? ( 1 = dog, 2 = cat): ");
       int choice = scanner.nextInt();

       if(choice == 1){
           animalRP = new DogRP();
           animalRP.speak();
       }
       else if(choice == 2){
           animalRP = new CatRP();
           animalRP.speak();;
       }



    }
}
