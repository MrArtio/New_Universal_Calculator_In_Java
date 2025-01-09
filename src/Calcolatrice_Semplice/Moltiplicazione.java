package Calcolatrice_Semplice;

public class Moltiplicazione {
    int N1;
    int N2;

    public Moltiplicazione(int n1, int n2) {
        N1 = n1;
        N2 = n2;
    }

    public void calcoloMoltiplicazione() {
        int moltiplicazione = this.N1 * this.N2;
        System.out.print("\nLa moltiplicazione è: " + moltiplicazione);
    }
}
