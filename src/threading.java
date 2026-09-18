import java.util.InputMismatchException;
import java.util.Scanner;

public class threading {
    public static void main(String[] args) {

        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations
        //             (File I/O, network communication, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thead class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 10 seconds to enter your name");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}
