package Calcolatrice_Scientifica;

public class CalcoloRadiceX3 {
    double Y = 3;
    double X;

    public CalcoloRadiceX3(double x) {
        X = x;
    }

    public void calcoloRadiceX3() {
        double radiceX3 = calcoloRadiceX3(Y, this.X);
        System.out.print("\nLa radice è: " + radiceX3);
    }

    public static double calcoloRadiceX3(double y, double x) {
        return Math.pow(y, 1.0 / x);
    }
}
