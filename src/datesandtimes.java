import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datesandtimes {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
        System.out.println(instant);

        /*  Custom format

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

         */

        LocalDateTime datetime1 = LocalDateTime.of(2024,12,25,12,0,0);
        LocalDateTime datetime2 = LocalDateTime.of(2025,1,1,0,0,0);
        System.out.println(datetime1);
        System.out.println(datetime2);

        if(datetime1.isBefore(datetime2)){
            System.out.println(datetime1 + " is earlier than " + datetime2);
        }
        else if (datetime1.isAfter(datetime2)){
            System.out.println(datetime1 + " is later than " + datetime2);
        }
        else if (datetime1.isEqual(datetime2)){
            System.out.println(datetime1 + " is equal to " + datetime2);
        }


    }


}
