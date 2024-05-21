package esercizio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Inserisci una stringa (\":q\" per uscire): ");
            input = scanner.nextLine();

            if (input.compareTo(":q") == 0) {
                System.out.println("Uscita dal programma.");
                break;
            }

            String output = "";
            for (int i = 0; i < input.length(); i++) {
                output += input.charAt(i);
                if (i < input.length() - 1) {
                    output += ",";
                }
            }

            System.out.println("Stringa suddivisa: " + output);
        }

        scanner.close();
    }
}