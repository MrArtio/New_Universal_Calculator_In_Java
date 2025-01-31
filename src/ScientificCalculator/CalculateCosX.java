package ScientificCalculator;

public class CalculateCosX {
    // Variable to store the angle in degrees
    double degrees;

    // Constructor to initialize the angle
    public CalculateCosX(double degrees) {
        this.degrees = degrees;
    }

    // Method to calculate the cosine of the given angle
    public void calculateCosX() {
        // Convert degrees to radians since Math.cos() works with radians
        double radians = Math.toRadians(degrees);
        double cosine = Math.cos(radians);

        // Print the result
        System.out.print("\nThe result of cos(X) is: " + cosine);
    }
}
