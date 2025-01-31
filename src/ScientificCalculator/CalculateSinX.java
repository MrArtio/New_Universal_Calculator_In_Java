package ScientificCalculator;

public class CalculateSinX {
    // Variable to store the angle in degrees
    double degrees;

    // Constructor to initialize the angle
    public CalculateSinX(double degrees) {
        this.degrees = degrees;
    }

    // Method to calculate the sine of the given angle
    public void calculateSinX() {
        // Convert degrees to radians since Math.sin() works with radians
        double radians = Math.toRadians(degrees);
        double sine = Math.sin(radians);

        // Print the result
        System.out.print("\nThe result of sin(X) is: " + sine);
    }
}
