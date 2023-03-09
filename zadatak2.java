import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //zasto je potreban IOException pri pisanju filea??? provjeriti kasnije
        Scanner input = new Scanner(System.in);

        float km;
        do{
            System.out.println("Unesite broj kilometara: ");
            km = input.nextFloat();
            if (km < 0){
                System.out.println("Uneseni broj je negativan!");
            }
        }while(km < 0);

        float kFaktor;
        do{
            System.out.println("Unesite konverzijski faktor: ");
            kFaktor = input.nextFloat();
            if (kFaktor < 0){
                System.out.println("Uneseni broj je negativan!");
            }
        }while(kFaktor < 0);

        String file = "konverzijskiFaktor.txt";

        FileWriter fw = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        bufferedWriter.write(Float.toString(kFaktor));
        bufferedWriter.close();

        //Sa StringBuilder pretvoriti vise linija u jedan String
        BufferedReader  reader;
        reader = new BufferedReader(new FileReader(file));
        String line1File = reader.readLine();
        reader.close();

        System.out.println("Iz datoteke: " + line1File);
        float miles = km / kFaktor;
        int intMiles = (int) miles;
        System.out.println("Uneseno je " + km + " kilometara, što je " + intMiles + " milja.");


    }
}
