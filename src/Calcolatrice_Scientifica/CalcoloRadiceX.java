package Calcolatrice_Scientifica;

public class CalcoloRadiceX {
    double Y;
    double X;

    public CalcoloRadiceX(double y, double x) {
        Y = y;
        X = x;
    }

    public void calcoloRadiceXY() {
        double radiceX = calcoloRadiceX(this.Y, this.X);
        System.out.print("\nLa radice è: " + radiceX);
    }

    public static double calcoloRadiceX(double y, double x) {
        return Math.pow(y, 1.0 / x);
    }
}
