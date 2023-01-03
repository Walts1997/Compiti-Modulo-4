import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci valore 1: ");
        int valore1 = input.nextInt();
        System.out.println("Inserisci valore 2: ");
        int valore2 = input.nextInt();

        int somma = valore1+valore2;
        int sottrazione = valore1-valore2;
        int moltiplicazione = valore1*valore2;
        int divisione = valore1/valore2;

        System.out.println("La somma dei due valori è: " +somma);
        System.out.println("La sottrazione dei due valori è: " +sottrazione);
        System.out.println("La moltiplicazione dei due valori è: " +moltiplicazione);
        System.out.println("La divisione dei due valori è: " +divisione);

        input.close();
    }
}