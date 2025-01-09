package Calcolatrice_Semplice;

public class Sottrazione {
    int N1;
    int n2;

    public Sottrazione(int n1, int n2) {
        N1 = n1;
        this.n2 = n2;
    }

    public void calcoloSottrazione(){
        int sottrazione = this.N1 - this.n2;
        System.out.print("\nLa sottrazione è: " + sottrazione);
    }
}
