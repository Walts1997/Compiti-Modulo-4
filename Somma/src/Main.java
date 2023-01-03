import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci valore 1: ");
        int valore1 = input.nextInt();

        System.out.println("Inserisci valore 2: ");
        int valore2 = input.nextInt();

        int somma = valore1+valore2;

        System.out.println("Somma valori: " +somma);
        input.close();
    }
}