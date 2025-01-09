package Calcolatrice_Scientifica;

public class CalcoloEsponenzialeX {
    double Y;
    double X;

    public CalcoloEsponenzialeX(double x, double y) {
        X = x;
        Y = y;
    }

    public void calcoloEsponenzialeX() {
        double calcEspX = Math.pow(this.X, this.Y);
        System.out.print("\nIl risultato è: " + calcEspX);
    }
}
