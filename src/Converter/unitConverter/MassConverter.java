package Converter.unitConverter;

/**
 * The MassConverter class provides methods to convert between different mass units.
 * The supported units are kilograms, grams, pounds, and ounces.
 * This class is efficient and easy to understand, offering a fast way to perform unit conversions.
 */
public class MassConverter {

    // Constants for conversion factors (improves readability and maintainability)
    private static final double KILOGRAMS_TO_GRAMS = 1000.0;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double KILOGRAMS_TO_OUNCES = 35.274;
    private static final double GRAMS_TO_KILOGRAMS = 1.0 / KILOGRAMS_TO_GRAMS;
    private static final double GRAMS_TO_POUNDS = 0.00220462; // Or 1.0 / 453.592
    private static final double GRAMS_TO_OUNCES = 0.035274;   // Or 1.0 / 28.3495
    private static final double POUNDS_TO_KILOGRAMS = 1.0 / KILOGRAMS_TO_POUNDS;
    private static final double POUNDS_TO_GRAMS = 453.592;
    private static final double POUNDS_TO_OUNCES = 16.0;
    private static final double OUNCES_TO_KILOGRAMS = 1.0 / KILOGRAMS_TO_OUNCES;
    private static final double OUNCES_TO_GRAMS = 28.3495;
    private static final double OUNCES_TO_POUNDS = 1.0 / POUNDS_TO_OUNCES;


    // Conversion methods (using constants)

    public static double kilogramsToGrams(double kilograms) {
        return kilograms * KILOGRAMS_TO_GRAMS;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    public static double kilogramsToOunces(double kilograms) {
        return kilograms * KILOGRAMS_TO_OUNCES;
    }

    public static double gramsToKilograms(double grams) {
        return grams * GRAMS_TO_KILOGRAMS;
    }

    public static double gramsToPounds(double grams) {
        return grams * GRAMS_TO_POUNDS;
    }

    public static double gramsToOunces(double grams) {
        return grams * GRAMS_TO_OUNCES;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    public static double poundsToGrams(double pounds) {
        return pounds * POUNDS_TO_GRAMS;
    }

    public static double poundsToOunces(double pounds) {
        return pounds * POUNDS_TO_OUNCES;
    }

    public static double ouncesToKilograms(double ounces) {
        return ounces * OUNCES_TO_KILOGRAMS;
    }

    public static double ouncesToGrams(double ounces) {
        return ounces * OUNCES_TO_GRAMS;
    }

    public static double ouncesToPounds(double ounces) {
        return ounces * OUNCES_TO_POUNDS;
    }

}