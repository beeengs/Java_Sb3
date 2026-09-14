import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you  student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("Student: " + isStudent);

        if (isStudent) {
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are NOT enrolled as a student");
        }

        // COMMON ISSUES

        System.out.println("Enter your age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your favourite colour");
        String colour1 = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("you like the colour " + colour1);

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm^2");

        scanner.close();
    }

}