package Esercizio4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int numeroInserito = Integer.parseInt(value.nextLine());
        for (int  i= numeroInserito ; i >= 0; i--){
            System.out.println(i);
        }
        value.close();
    }
}
