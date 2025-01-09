import Calcolatrice_Semplice.*;
import Calcolatrice_Scientifica.*;
import java.util.Scanner;

public class Calcolatrice {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\nSeleziona il tipo di calcolatrice: ");
        System.out.print("\n1) Calcolatrice Semplice");
        System.out.print("\n2) Calcolatrice Scientifica");
        System.out.print("\nSeleziona: ");

        int sel = in.nextInt();

        switch (sel) {
            case 1:
                CalcolatriceSemplice.mainSemplice();
                break;
            case 2:
                CalcolatriceScientifica.mainScientifico();
                break;
        }
    }
}
