package ScientificCalculator;

public class CalculateExponentialX2 {
    // Variable to store the exponent (fixed to 2 for base exponentiation)
    double Y = 2;
    double X;

    // Constructor to initialize the base (X)
    public CalculateExponentialX2(double x) {
        X = x;
    }

    // Method to calculate X raised to the power of Y (X^Y)
    public void calculateExponentialX2() {
        // Calculate X raised to the power of Y
        double expResult = Math.pow(this.X, this.Y);
        System.out.print("\nThe result of the exponential calculation is: " + expResult);
    }
}
