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
        System.out.print("\nInserisci l'esponente della radice: ");
        double Y = in.nextInt();
        System.out.print("\nInserisci il radicando: ");
        double X = in.nextInt();
        CalcoloEsponenzialeX calcEspX = new CalcoloEsponenzialeX(X,Y);
        calcEspX.calcoloEsponenzialeX();
    }

    //Calcolo dell' EsponenzialeX^2
    public static void calcEsponenzialiX2() {
        System.out.print("\nInserisci la base: ");
        double X = in.nextInt();
        CalcoloEsponenzialeX2 calcEspX2 = new CalcoloEsponenzialeX2(X);
        calcEspX2.calcoloEsponenzialeX2();
    }

    //Calcolo dell' EsponenzialeX^3
    public static void calcEsponenzialiX3() {
        System.out.print("\nInserisci la base: ");
        double X = in.nextInt();
        CalcoloEsponenzialeX3 calcEspX3 = new CalcoloEsponenzialeX3(X);
        calcEspX3.calcoloEsponenzialeX3();
    }

    //Calcolo di sinX
    public static void calcSinX() {
        System.out.print("\nInserisci i gradi: ");
        double GradoSinX = in.nextInt();
        CalcolaSinX calcolaSinX = new CalcolaSinX(GradoSinX);
        calcolaSinX.calcoloSinX();
    }

    //Calcolo di cosX
    public static void calcCosX() {
        System.out.print("\nInserisci i gradi: ");
        double GradoCosX = in.nextInt();
        CalcolaCosX calcolaCosX = new CalcolaCosX(GradoCosX);
        calcolaCosX.calcoloCosX();
    }

    //Calcolo di tanX
    public static void calcTanX() {
        System.out.print("\nInserisci i gradi: ");
        double GradoTanX = in.nextInt();
        CalcolaTanX calcolaTanX = new CalcolaTanX(GradoTanX);
        calcolaTanX.calcoloTanX();
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
            case 4:
                calcEsponenzialiX();
                break;
            case 5:
                calcEsponenzialiX2();
                break;
            case 6:
                calcEsponenzialiX3();
                break;
            case 7:
                calcSinX();
                break;
            case 8:
                calcCosX();
                break;
            case 9:
                calcTanX();
                break;

        }
    }
}
