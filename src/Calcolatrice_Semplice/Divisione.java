package Calcolatrice_Semplice;

public class Divisione {
    int N1;
    int N2;

    public Divisione(int n1, int n2) {
        N1 = n1;
        N2 = n2;
    }

    public void calcoloDivisione() {
        int divisione = this.N1 / this.N2;
        System.out.print("\nLa divisione è: " + divisione);
    }
}
