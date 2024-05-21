package esercizio1;

public class Main {
    public static void main(String[] args) {
        String stringaInIngresso = "Ciao a tutti io sono Carlo";
        boolean lunghezzaStringa = stringaParioDispari(stringaInIngresso);
        if (lunghezzaStringa) {
            System.out.println("La stringa è pari");
        } else {
            System.out.println("Ls stringa è dispari!");
        }

        //Inizio Metodo Anno bisestile:
        int anno = 2024;
        boolean valoreBisestile = annoBisestile(anno);
        if (valoreBisestile){
            System.out.println("l'anno" +  " " + anno + " " + " è bisestile!");
        }else {
            System.out.println("l'anno" + " " + anno + " " +  "non è bisestile!");
        }
    }
    public static boolean annoBisestile (int anno){
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0) ){
return true;
        }else {
            return false;
        }
    }
    public static boolean stringaParioDispari(String str) {
            int lunghezza = str.length();
            return lunghezza % 2 == 0;
    }
}
