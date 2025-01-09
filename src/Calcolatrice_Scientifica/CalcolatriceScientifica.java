package Calcolatrice_Scientifica;

import java.util.*;
public class CalcolatriceScientifica {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        mainScientifico();
    }

    //Calcolo della Radice
    public static void calcRadiceX() {
        System.out.print("\nInserisci l'esponente della radice: ");
        double Y = in.nextInt();
        System.out.print("\nInserisci il radicando: ");
        double X = in.nextInt();
        CalcoloRadiceX calcoloRadiceX = new CalcoloRadiceX(Y, X);
        calcoloRadiceX.calcoloRadiceXY();
    }
    //Calcolo della RadiceX^2
    public static void calcRadiceX2() {
        System.out.print("\nInserisci il radicando: ");
        double X = in.nextInt();
        CalcoloRadiceX2 calcloRadX2 = new CalcoloRadiceX2(X);
        calcloRadX2.calcoloRadiceX2();
    }
    //Calcolo della RadiceX^3
    public static void calcRadiceX3() {
        System.out.print("\nInserisci il radicando: ");
        double X = in.nextInt();
        CalcoloRadiceX3 calcRadX3 = new CalcoloRadiceX3(X);
        calcRadX3.calcoloRadiceX3();
    }

    //Calcolo dell' EsponenzialeX
    public static void calcEsponenzialiX() {

    }

    //Calcolo dell' EsponenzialeX^2
    public static void calcEsponenzialiX2() {

    }

    //Calcolo dell' EsponenzialeX^3
    public static void calcEsponenzialiX3() {

    }

    //Calcolo di sinX
    public static void calcSinX() {

    }

    //Calcolo di cosX
    public static void calcCosX() {

    }

    //Calcolo di tanX
    public static void calcTanX() {

    }

    public static void mainScientifico() {
        System.out.print("\nSeleziona l'operazione da eseguire: ");
        System.out.print("\n");
        System.out.print("\n1) Calcolo RadiceX");
        System.out.print("\n2) Calcolo RadiceX^2");
        System.out.print("\n3) Calcolo RadiceX^3");
        System.out.print("\n4) Calcolo EsponenzialiX");
        System.out.print("\n5) Calcolo EsponenzialiX^2");
        System.out.print("\n6) Calcolo Esponenziali^3");
        System.out.print("\n7) Calcolo sinX");
        System.out.print("\n8) Calcolo cosX");
        System.out.print("\n9) Calcolo tanX");
        System.out.print("\n");
        System.out.print("\nSeleziona: ");

        int sel = in.nextInt();

        switch (sel) {
            case 1:
                calcRadiceX();
                break;
            case 2:
                calcRadiceX2();
                break;
            case 3:
                calcRadiceX3();
                break;

        }
    }
}
