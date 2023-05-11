import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5Nishan60850 {

    public static void main(String[] args) throws IOException {

        String UserAccountNum60850Nishan;

        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input 3 Digits Number of your Bank: ");
        UserAccountNum60850Nishan = br.readLine();


        try (BufferedReader buffR = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String lines;
            System.out.println("Seacrh and Reading Data From the File");

            while ((lines = buffR.readLine()) != null) {
                String words[] = lines.split("\\t+");
                String bankNumberMaria = words[0].trim();
                String bankNameMaria = words[1].trim();

                if (bankNumberMaria.equals(UserAccountNum60850Nishan)) {
                    System.out.println("Bank Number: " + bankNumberMaria + "\n" + "Name of your bank is: " + bankNameMaria);
                    break;
                }
                else {
                    System.out.println("No Data Found, Input The correct Number");
                    break;
                }
            }

        } catch (IOException ex) {
            System.out.println("An error occurred loading the data");
        }
    }
}