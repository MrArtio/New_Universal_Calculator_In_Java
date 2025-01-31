package ScientificCalculator;

public class CalculateRootX3 {
    // Variable to store the root value (fixed to 3)
    double Y = 3;
    double X;

    // Constructor to initialize the exponent (X)
    public CalculateRootX3(double x) {
        X = x;
    }

    // Method to calculate the root of X with base Y (i.e., Y^(1/X))
    public void calculateRootX3() {
        // Calling the static method to calculate the root
        double rootX3 = calculateRootX3(Y, this.X);
        System.out.print("\nThe result of the root is: " + rootX3);
    }

    // Static method to calculate Y^(1/X) (Y raised to the power of 1/X)
    public static double calculateRootX3(double y, double x) {
        return Math.pow(y, 1.0 / x);
    }
}
