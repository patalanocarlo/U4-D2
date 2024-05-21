package esercizio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("inserisci un Numero da 0 a 3");
        int numero = value.nextInt();
        switch (numero){
            case 0:
                System.out.println("Zero!");
                break;
            case 1:
                System.out.println("Uno!");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore:Il numero inserito non è compreso nella richiesta!");
        }
    }
}
