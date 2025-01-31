package ScientificCalculator;

public class CalculateTanX {
    double angleInDegrees;

    // Constructor to initialize the angle in degrees
    public CalculateTanX(double degrees) {
        this.angleInDegrees = degrees;
    }

    // Method to calculate the tangent of the given angle (in degrees)
    public void calculateTanX() {
        // Convert the angle from degrees to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Calculate the tangent of the angle
        double tangent = Math.tan(angleInRadians);

        // Display the result
        System.out.print("\nThe result of tanX is: " + tangent);
    }
}
