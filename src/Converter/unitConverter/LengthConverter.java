package Converter.unitConverter;

/**
 * LengthConverter is a utility class for converting between different units of length.
 */
public class LengthConverter {

    // Constants for conversion factors
    private static final double KILOMETERS_TO_MILES = 0.621371;
    private static final double MILES_TO_KILOMETERS = 1.0 / KILOMETERS_TO_MILES;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 1.0 / METERS_TO_FEET;
    private static final double CENTIMETERS_TO_INCHES = 0.393701;
    private static final double INCHES_TO_CENTIMETERS = 1.0 / CENTIMETERS_TO_INCHES;
    private static final double METERS_TO_YARDS = 1.09361;  // 1 meter ≈ 1.09361 yards
    private static final double YARDS_TO_METERS = 1.0 / METERS_TO_YARDS;
    private static final double KILOMETERS_TO_YARDS = KILOMETERS_TO_MILES * 1760.0 / 1609.34; // 1 km ≈ 1093.61 yards
    private static final double YARDS_TO_KILOMETERS = 1.0 / KILOMETERS_TO_YARDS;
    private static final double MILES_TO_YARDS = 1760.0; // 1 mile = 1760 yards
    private static final double YARDS_TO_MILES = 1.0 / MILES_TO_YARDS;
    private static final double FEET_TO_YARDS = 1.0/3.0;
    private static final double YARDS_TO_FEET = 3.0;
    private static final double INCHES_TO_YARDS = 1.0/36.0;
    private static final double YARDS_TO_INCHES = 36.0;



    // Conversion methods (including yards)

    public static double kilometersToMiles(double kilometers) {
        return kilometers * KILOMETERS_TO_MILES;
    }

    public static double milesToKilometers(double miles) {
        return miles * MILES_TO_KILOMETERS;
    }

    public static double metersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double feetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters * CENTIMETERS_TO_INCHES;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * INCHES_TO_CENTIMETERS;
    }

    public static double metersToYards(double meters) {
        return meters * METERS_TO_YARDS;
    }

    public static double yardsToMeters(double yards) {
        return yards * YARDS_TO_METERS;
    }

    public static double kilometersToYards(double kilometers) {
        return kilometers * KILOMETERS_TO_YARDS;
    }

    public static double yardsToKilometers(double yards) {
        return yards * YARDS_TO_KILOMETERS;
    }

    public static double milesToYards(double miles) {
        return miles * MILES_TO_YARDS;
    }

    public static double yardsToMiles(double yards) {
        return yards * YARDS_TO_MILES;
    }

    public static double feetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double yardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double inchesToYards(double inches) {
        return inches * INCHES_TO_YARDS;
    }

    public static double yardsToInches(double yards) {
        return yards * YARDS_TO_INCHES;
    }

}