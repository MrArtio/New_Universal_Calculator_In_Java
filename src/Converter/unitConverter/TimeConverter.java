package Converter.unitConverter;

/**
 * The TimeConverter class provides methods to convert between different time units.
 * The supported units are seconds, minutes, hours, and days.
 * This class is designed to be efficient, easy to read, and accurate.
 */
public class TimeConverter {

    // Constants for conversion factors (improves readability and maintainability)
    private static final double SECONDS_TO_MINUTES = 1.0 / 60.0;
    private static final double MINUTES_TO_SECONDS = 60.0;
    private static final double SECONDS_TO_HOURS = 1.0 / 3600.0;
    private static final double HOURS_TO_SECONDS = 3600.0;
    private static final double SECONDS_TO_DAYS = 1.0 / 86400.0;
    private static final double DAYS_TO_SECONDS = 86400.0;
    private static final double MINUTES_TO_HOURS = 1.0 / 60.0;
    private static final double HOURS_TO_MINUTES = 60.0;
    private static final double MINUTES_TO_DAYS = 1.0 / 1440.0;
    private static final double DAYS_TO_MINUTES = 1440.0;
    private static final double HOURS_TO_DAYS = 1.0 / 24.0;
    private static final double DAYS_TO_HOURS = 24.0;


    // Conversion methods (using constants)

    public static double secondsToMinutes(double seconds) {
        return seconds * SECONDS_TO_MINUTES;
    }

    public static double secondsToHours(double seconds) {
        return seconds * SECONDS_TO_HOURS;
    }

    public static double secondsToDays(double seconds) {
        return seconds * SECONDS_TO_DAYS;
    }

    public static double minutesToSeconds(double minutes) {
        return minutes * MINUTES_TO_SECONDS;
    }

    public static double minutesToHours(double minutes) {
        return minutes * MINUTES_TO_HOURS;
    }

    public static double minutesToDays(double minutes) {
        return minutes * MINUTES_TO_DAYS;
    }

    public static double hoursToSeconds(double hours) {
        return hours * HOURS_TO_SECONDS;
    }

    public static double hoursToMinutes(double hours) {
        return hours * HOURS_TO_MINUTES;
    }

    public static double hoursToDays(double hours) {
        return hours * HOURS_TO_DAYS;
    }

    public static double daysToSeconds(double days) {
        return days * DAYS_TO_SECONDS;
    }

    public static double daysToMinutes(double days) {
        return days * DAYS_TO_MINUTES;
    }

    public static double daysToHours(double days) {
        return days * DAYS_TO_HOURS;
    }

    // Removed main() method - testing should be done in a separate class.
}