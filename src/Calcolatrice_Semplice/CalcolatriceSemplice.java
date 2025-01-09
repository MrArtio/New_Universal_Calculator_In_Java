package Calcolatrice_Semplice;

import java.util.*;
public class CalcolatriceSemplice {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       mainSemplice();
    }

    public static void calcSomma() {
        System.out.print("\nInserisci il primo numero: ");
        int n1 = in.nextInt();
        System.out.print("\nInserisci il secondo numeri: ");
        int n2 = in.nextInt();
        Somma somma = new Somma(n1, n2);
        somma.calcoloSomma();
    }

    public static void calcSottrazione() {
        System.out.print("\nInserisci il primo numero: ");
        int n1 = in.nextInt();
        System.out.print("\nInserisci il secondo numeri: ");
        int n2 = in.nextInt();
        Sottrazione sottrazione = new Sottrazione(n1, n2);
        sottrazione.calcoloSottrazione();
    }

    public static void calcMoltiplicazione() {
        System.out.print("\nInserisci il primo numero: ");
        int n1 = in.nextInt();
        System.out.print("\nInserisci il secondo numeri: ");
        int n2 = in.nextInt();
        Moltiplicazione moltiplicazione = new Moltiplicazione(n1, n2);
        moltiplicazione.calcoloMoltiplicazione();
    }

    public static void calcDivisione() {
        System.out.print("\nInserisci il primo numero: ");
        int n1 = in.nextInt();
        System.out.print("\nInserisci il secondo numeri: ");
        int n2 = in.nextInt();
        Divisione divisione = new Divisione(n1, n2);
        divisione.calcoloDivisione();
    }

    public static void mainSemplice() {
        System.out.print("\nSeleziona tipo di calcolo: ");
        System.out.print("\n");
        System.out.print("\n1) Somma");
        System.out.print("\n2) Sottrazione");
        System.out.print("\n3) Moltiplicazione");
        System.out.print("\n4) Divisione");
        System.out.print("\nSeleziona: ");
        int sel = in.nextInt();

        switch (sel){
            case 1:
                calcSomma();
                break;
            case 2:
                calcSottrazione();
                break;
            case 3:
                calcMoltiplicazione();
                break;
            case 4:
                calcDivisione();
                break;
        }
    }
}