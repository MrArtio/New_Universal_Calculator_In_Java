package Calcolatrice_Scientifica;

public class CalcoloEsponenzialeX2 {
    double Y = 2;
    double X;

    public CalcoloEsponenzialeX2(double x) {
        X = x;
    }

    public void calcoloEsponenzialeX2() {
        double calcEspX2 = Math.pow(this.X, this.Y);
        System.out.print("\nIl risultato è: " + calcEspX2);
    }
}
