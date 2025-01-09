package Calcolatrice_Semplice;

public class Somma {
    int N1;
    int N2;


    public Somma(int n1, int n2) {
        this.N1 = n1;
        this.N2 = n2;
    }

    public void calcoloSomma() {
        int somma = this.N1 + this.N2;
        System.out.print("\nLa somma è: " + somma);
    }
}
