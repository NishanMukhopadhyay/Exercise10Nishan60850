import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2Nishan60850 {

    public static void main(String[] args) throws IOException {
        FileInputStream fss = null;
        int bajt;
        try{
            fss = new FileInputStream("Test123.txt");

        }catch (FileNotFoundException ex){
            System.out.println("File not found");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ClosingFile cf= new ClosingFile();){
            do {
                bajt= fss.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != -1);

        } catch(IOException ex){
            System.out.println("Error reading the file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class ClosingFile implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("closing the file");
    }
}