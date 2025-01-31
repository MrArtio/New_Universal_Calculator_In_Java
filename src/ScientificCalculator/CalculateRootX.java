package ScientificCalculator;

public class CalculateRootX {
    // Variables to store the base (Y) and exponent (X)
    double Y;
    double X;

    // Constructor to initialize the base (Y) and exponent (X)
    public CalculateRootX(double y, double x) {
        Y = y;
        X = x;
    }

    // Method to calculate the X-th root of Y (i.e., Y^(1/X))
    public void calculateRootXY() {
        // Calling the static method to calculate the root
        double rootX = calculateRootX(this.Y, this.X);
        System.out.print("\nThe result of the root is: " + rootX);
    }

    // Static method to calculate Y^(1/X) (Y raised to the power of 1/X)
    public static double calculateRootX(double y, double x) {
        return Math.pow(y, 1.0 / x);
    }
}
