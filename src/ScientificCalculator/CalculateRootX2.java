package ScientificCalculator;

public class CalculateRootX2 {
    // Variable to store the root value (fixed to 2 for square root)
    double Y = 2;
    double X;

    // Constructor to initialize the exponent (X)
    public CalculateRootX2(double x) {
        X = x;
    }

    // Method to calculate the root of X with base Y (i.e., Y^(1/X))
    public void calculateRootX2() {
        // Calling the static method to calculate the root
        double rootX2 = calculateRootX2(Y, this.X);
        System.out.print("\nThe result of the root is: " + rootX2);
    }

    // Static method to calculate Y^(1/X) (Y raised to the power of 1/X)
    public static double calculateRootX2(double y, double x) {
        return Math.pow(y, 1.0 / x);
    }
}
