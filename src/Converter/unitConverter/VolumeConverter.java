package Converter.unitConverter;

/**
 * This class provides methods to convert between different units of volume.
 * Supported units:
 * - Cubic meters (m³)
 * - Liters (L)
 * - Milliliters (mL)
 * - Cubic centimeters (cm³)
 * - Cubic inches (in³)
 * - Gallons (US)
 *
 * This class ensures fast, accurate, and efficient conversions.
 */
public class VolumeConverter {

    // Constants for conversion factors (improves readability and maintainability)
    private static final double CUBIC_METERS_TO_LITERS = 1000.0;
    private static final double LITERS_TO_CUBIC_METERS = 1.0 / CUBIC_METERS_TO_LITERS;
    private static final double MILLILITERS_TO_LITERS = 0.001; // or 1.0 / 1000.0
    private static final double LITERS_TO_MILLILITERS = 1000.0;
    private static final double CUBIC_CENTIMETERS_TO_LITERS = 0.001; // or 1.0 / 1000.0
    private static final double LITERS_TO_CUBIC_CENTIMETERS = 1000.0;
    private static final double CUBIC_INCHES_TO_LITERS = 0.0163871;
    private static final double LITERS_TO_CUBIC_INCHES = 61.0237;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;


    // Conversion methods (using constants)

    public static double cubicMetersToLiters(double cubicMeters) {
        return cubicMeters * CUBIC_METERS_TO_LITERS;
    }

    public static double litersToCubicMeters(double liters) {
        return liters * LITERS_TO_CUBIC_METERS;
    }

    public static double millilitersToLiters(double milliliters) {
        return milliliters * MILLILITERS_TO_LITERS;
    }

    public static double litersToMilliliters(double liters) {
        return liters * LITERS_TO_MILLILITERS;
    }

    public static double cubicCentimetersToLiters(double cubicCentimeters) {
        return cubicCentimeters * CUBIC_CENTIMETERS_TO_LITERS;
    }

    public static double litersToCubicCentimeters(double liters) {
        return liters * LITERS_TO_CUBIC_CENTIMETERS;
    }

    public static double cubicInchesToLiters(double cubicInches) {
        return cubicInches * CUBIC_INCHES_TO_LITERS;
    }

    public static double litersToCubicInches(double liters) {
        return liters * LITERS_TO_CUBIC_INCHES;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    public static double litersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }


    //Removed Main method
}