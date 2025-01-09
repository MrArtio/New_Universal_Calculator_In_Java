package Calcolatrice_Scientifica;

public class CalcoloRadiceX2 {
    double Y = 2;
    double X;

    public CalcoloRadiceX2(double x) {
        X = x;
    }

    public void calcoloRadiceX2() {
        double radiceX2 = calcoloRadiceX2(Y, this.X);
        System.out.print("\nLa radice è: " + radiceX2);
    }

    public static double calcoloRadiceX2(double y, double x) {
        return Math.pow(y, 1.0 / x);
    }
}
