public class ternaryoperator {

    public static void main(String[] args) {

        // ternary operator  = Return 1 of 2 values if a condition is true

        // Variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
        int number = 3;

        /*
        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        */

        String passOrfail = (score >= 60) ? "PASS" : "FAIL";

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(passOrfail);

        System.out.println(evenOrOdd);

        int hours = 9;

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";

        System.out.println(timeOfDay);

        int income = 30000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);


    }
}
