package Converter.unitConverter;

/**
 * The MassConverter class provides methods to convert between different mass units.
 * The supported units are kilograms, grams, pounds, and ounces.
 * This class is efficient and easy to understand, offering a fast way to perform unit conversions.
 */
public class MassConverter {

    /**
     * Converts kilograms to grams.
     * @param kilograms the mass in kilograms
     * @return the mass in grams
     */
    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000;
    }

    /**
     * Converts kilograms to pounds.
     * @param kilograms the mass in kilograms
     * @return the mass in pounds
     */
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    /**
     * Converts kilograms to ounces.
     * @param kilograms the mass in kilograms
     * @return the mass in ounces
     */
    public static double kilogramsToOunces(double kilograms) {
        return kilograms * 35.274;
    }

    /**
     * Converts grams to kilograms.
     * @param grams the mass in grams
     * @return the mass in kilograms
     */
    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    /**
     * Converts grams to pounds.
     * @param grams the mass in grams
     * @return the mass in pounds
     */
    public static double gramsToPounds(double grams) {
        return grams * 0.00220462;
    }

    /**
     * Converts grams to ounces.
     * @param grams the mass in grams
     * @return the mass in ounces
     */
    public static double gramsToOunces(double grams) {
        return grams * 0.035274;
    }

    /**
     * Converts pounds to kilograms.
     * @param pounds the mass in pounds
     * @return the mass in kilograms
     */
    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    /**
     * Converts pounds to grams.
     * @param pounds the mass in pounds
     * @return the mass in grams
     */
    public static double poundsToGrams(double pounds) {
        return pounds * 453.592;
    }

    /**
     * Converts pounds to ounces.
     * @param pounds the mass in pounds
     * @return the mass in ounces
     */
    public static double poundsToOunces(double pounds) {
        return pounds * 16;
    }

    /**
     * Converts ounces to kilograms.
     * @param ounces the mass in ounces
     * @return the mass in kilograms
     */
    public static double ouncesToKilograms(double ounces) {
        return ounces / 35.274;
    }

    /**
     * Converts ounces to grams.
     * @param ounces the mass in ounces
     * @return the mass in grams
     */
    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    /**
     * Converts ounces to pounds.
     * @param ounces the mass in ounces
     * @return the mass in pounds
     */
    public static double ouncesToPounds(double ounces) {
        return ounces / 16;
    }

    /**
     * Main method to test the conversion methods.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Example conversions:
        System.out.println("10 kilograms to grams: " + kilogramsToGrams(10));
        System.out.println("500 grams to pounds: " + gramsToPounds(500));
        System.out.println("100 pounds to ounces: " + poundsToOunces(100));
    }
}
