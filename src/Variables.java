public class Variables {
    public static void main(String[] args) {

        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains


        // primitive = a simple value stored directly in memory (stack)
        // reference = memory address (stack) that points to the (heap)

        // Primitive vs  // Reference
        // ---------       -----------
        // int             string
        // double          array
        // char            object
        // boolean

        // 2 Steps Creating a Variable
        //-------------------------------
        // 1 declaration
        // 2 assignment

        int age = 30;
        int year = 2026;
        int quantity = 1;

        System.out.println(year);
        System.out.println(quantity);
        System.out.println("This year is " + year);

        double price = 1900000.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(currency);

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        System.out.println(forSale);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        String name = "Cahartt";
        String food = "pizza";
        String email = "abc@tmail.com";
        String car = "Mustang";
        String colour = "red";

        System.out.println("HELLO " + name);
        System.out.println("Your favourite food is " + food);
        System.out.println("Your email is " + email);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);

        System.out.println("Your choice is a " + colour + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");

        }
    }
}

