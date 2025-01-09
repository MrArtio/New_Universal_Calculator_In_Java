package Calcolatrice_Scientifica;

public class CalcoloEsponenzialeX3 {
    double Y = 2;
    double X;

    public CalcoloEsponenzialeX3(double x) {
        X = x;
    }

    public void calcoloEsponenzialeX3() {
        double calcEspX3 = Math.pow(this.X, this.Y);
        System.out.print("\nIl risultato è: " + calcEspX3);
    }
}
