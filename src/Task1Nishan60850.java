import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1Nishan60850 {

    public static void main(String[] args) throws IOException {
        FileInputStream fss;
        int bajt;
        try {
            fss = new FileInputStream("Test123.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return;
        }
        try {
            do {
                bajt = fss.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != -1);
        } catch (IOException ex) {
            System.out.println("Error reading the file");
        } finally {
            try {
                fss.close();
            } catch (IOException ex) {
                System.out.println("Error file closing");
            }
        }
    }
}