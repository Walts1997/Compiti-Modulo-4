import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci numero di giorni: ");
        int giorni = input.nextInt();
        int secondigiorno = 86400;

        System.out.println("Inserisci numero di ore: ");
        int ore = input.nextInt();
        int secondiore = 3600;

        System.out.println("Inserisci numero di minuti: ");
        int minuti = input.nextInt();
        int secondiminuti = 60;

        int seconditotale = (giorni*secondigiorno)+(ore*secondiore)+(minuti*secondiminuti);

        System.out.println("Nei giorni inseriti ci sono secondi: " +seconditotale);
        input.close();
    }
}