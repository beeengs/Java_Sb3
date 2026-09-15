import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {

        // .substring() = a method used to extract a portion of a string
        //                .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("Enter Your Email: ");


        email = scanner.nextLine();

        if (email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }

        scanner.close();
    }
}
