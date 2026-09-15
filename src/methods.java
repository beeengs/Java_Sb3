public class methods {

    static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "Patrick";
        int age1 = 38;

        happyBirthday(name, age1);
        happyBirthday(name, age1);
        happyBirthday(name, age1);

        double result = square(9);
        System.out.println(square(3));

        System.out.println(cube(3));

        String fullName = getFullName("Spongebob" , "Squarepants");
        System.out.println(fullName);

        int age = 21;

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up !");
        }

    }

    static void happyBirthday(String birthdayboi, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", birthdayboi);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");

    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }


}
