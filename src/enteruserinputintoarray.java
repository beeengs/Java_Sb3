import java.util.Scanner;

public class enteruserinputintoarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.println("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        // foods[0] = "pizza";
        // foods[1] = "taco";
        // foods[2] = "hamburger";

        // System.out.println(foods.length);

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();

    }
}
