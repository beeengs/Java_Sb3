import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class alarmclock {
    public static void main(String[] args) {

        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "/Users/shunbing/Downloads/LANY - dancing in the kitchen.wav";

        while(alarmTime == null){

            try{
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine().trim();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:MM:SS");
            }

        }

        AlarmClocka alarmClocka = new AlarmClocka(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClocka);
        alarmThread.start();

    }
}
