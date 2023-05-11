import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3Nishan60850 {
    public static void main(String[] args) {
        int Nishan60850;

        try (FileInputStream fiStream = new FileInputStream("Test123.txt");
             FileOutputStream foStream = new FileOutputStream("CopyOfFile.txt")) {

            do {
                Nishan60850 = fiStream.read();
                if ((char) Nishan60850 == ' ') Nishan60850 = '-';
                if (Nishan60850 != -1) foStream.write(Nishan60850);
            } while (Nishan60850 != -1);

        } catch (IOException e) {
            System.out.println("Error Found !!!");
        }
    }
}