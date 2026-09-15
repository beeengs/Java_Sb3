import java.util.Scanner;

public class weightconverter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        // Declare variables

        double weight;
        double newWeight;
        int choice;

        // welcome message

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // prompt for user choice

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        System.out.println(choice);

        // option 1 convert lbs to kgs
        // option 2 convert kgs to lbs

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        else if(choice == 2){
                System.out.print("Enter the weight in kgs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}
