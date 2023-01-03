import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci numero di secondi: ");
        int secondi = input.nextInt();
        int D = secondi/86400;
        int DR = secondi%86400;
        int H = DR/3600;
        int HR = DR%3600;
        int M = HR/60;
        int MR = HR%60;


        System.out.println("Giorni: " +D);
        System.out.println("Ore: " +H);
        System.out.println("Minuti: " +M);
        System.out.println("Secondi: " +MR);
        input.close();
    }
}