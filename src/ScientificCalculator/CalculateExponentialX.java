package ScientificCalculator;

public class CalculateExponentialX {
    // Variables to store the base (X) and the exponent (Y)
    double X;
    double Y;

    // Constructor to initialize the base (X) and the exponent (Y)
    public CalculateExponentialX(double x, double y) {
        X = x;
        Y = y;
    }

    // Method to calculate X raised to the power of Y (X^Y)
    public void calculateExponentialX() {
        // Calculate X raised to the power of Y
        double expResult = Math.pow(this.X, this.Y);
        System.out.print("\nThe result of the exponential calculation is: " + expResult);
    }
}
