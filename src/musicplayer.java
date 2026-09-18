import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class musicplayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // How to PLAY AUDIO with Java (.wav, .au, .aiff)

        String[] songs = {
                "/Users/shunbing/Downloads/What Did I Miss.wav",
                "/Users/shunbing/Downloads/After Hours.wav",
                "/Users/shunbing/Downloads/Game Time.wav",
                "/Users/shunbing/Downloads/luther (with sza).wav",
                "/Users/shunbing/Downloads/Rich Baby Daddy (feat. Sexyy Red & SZA).wav",
                "/Users/shunbing/Downloads/LANY - dancing in the kitchen.wav"
        };

        System.out.println("===== MUSIC PLAYER =====");

        System.out.println("1. Song 1: What Did I Miss (DRAKE)");
        System.out.println("2. Song 2: After Hours (The Weeknd)");
        System.out.println("3. Song 3: Game Time (Future ft.Tyla)");
        System.out.println("2. Song 4: luther (Kendrick Lamar ft.SZA)");
        System.out.println("2. Song 5: Rich Baby Daddy (Drake ft.Sexyy Red, SZA)");
        System.out.println("2. Song 6: dancing in the kitchen (LANY)");

        System.out.println("===== MUSIC PLAYER =====");

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". Song " + (i + 1));
        }

        System.out.print("Choose a song: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > songs.length) {
            System.out.println("Invalid choice.");
            return;
        }


        File file = new File(songs[choice - 1]);

        if (!file.exists()) {
            System.out.println("Could not locate file:");
            System.out.println(file.getAbsolutePath());
            return;
        }

            try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

           String response = "";

           while(!response.equals("Q")){

               System.out.println("P = Play");
               System.out.println("S = Stop");
               System.out.println("R = Reset");
               System.out.println("Q = Quit");
               System.out.println("Enter your choice: ");

               response = scanner.next().toUpperCase();

               switch(response){
                   case "P" -> clip.start();

                   case "S" -> clip.stop();

                   case "R" -> {
                       clip.stop();
                       clip.setMicrosecondPosition(0);
                   }

                   case "Q" -> {
                       clip.stop();
                       clip.close();
                   }
                   default -> System.out.println("Invalid Choice");
               }
           }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        finally {
            System.out.println("Bye!");
            scanner.close();
        }

    }
}
