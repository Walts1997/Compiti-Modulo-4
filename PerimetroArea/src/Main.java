import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //area e perimetro del quadrato

        System.out.println("Inserisci lato del quadrato: ");
        int lato = input.nextInt();

        int areaquadrato = lato*lato;
        int perimetroquadrato = lato*4;

        System.out.println("L'area del Quadrato é: " +areaquadrato);
        System.out.println("Il perimetro del Quadrato è: " +perimetroquadrato);

        //area e perimetro Rettangolo

        System.out.println("Inserisci base Rettangolo: ");
        int baserettangolo = input.nextInt();
        System.out.println("Inserisci altezza Rettangolo");
        int altezzarettangolo = input.nextInt();

        int arearettangolo = baserettangolo * altezzarettangolo;
        int perimetrorettangolo = (baserettangolo * 2) + (altezzarettangolo * 2);

        System.out.println("L'area è: " + arearettangolo);
        System.out.println("Il perimetro del Rettangolo è: " + perimetrorettangolo);

        //area e perimetro triangolo equilatero

        System.out.println("Inserisci base Triangolo equilatero: ");
        double basetriangolo = input.nextDouble();
        System.out.println("Inserisci altezza Triangolo equilatero: ");
        double altezzatriangolo = input.nextDouble();

        double areatriangolo = basetriangolo * altezzatriangolo / 2;
        double perimetrotriangolo = basetriangolo * 3;

        System.out.println("L'area del triangolo equilatero è: " + areatriangolo);
        System.out.println("Il perimetro del triangolo equilatero è: " + perimetrotriangolo);

        //area e perimetro del cerchio

        System.out.println("Inserisci raggio del Cerchio: ");
        int raggio = input.nextInt();

        double areacerchio = 3.14*(raggio*raggio);
        double perimetrocerchio = 3.14*(raggio+raggio);

        System.out.println("L'area del cerchio è: " +areacerchio);
        System.out.println("L'area del cerchio è: " +perimetrocerchio);
        input.close();



    }
}