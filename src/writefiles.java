import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writefiles {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // fileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "/Users/shunbing/Documents/Javathings/test.txt";
        String textContent = "I like pizza!\nIt's really good!\nBuy me Pizza!";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

    }
}
