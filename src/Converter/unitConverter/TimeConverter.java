package Converter.unitConverter;

/**
 * The TimeConverter class provides methods to convert between different time units.
 * The supported units are seconds, minutes, hours, and days.
 * This class is designed to be efficient, easy to read, and accurate.
 */
public class TimeConverter {

    /**
     * Converts seconds to minutes.
     * @param seconds the time in seconds
     * @return the time in minutes
     */
    public static double secondsToMinutes(double seconds) {
        return seconds / 60; // 1 minute = 60 seconds
    }

    /**
     * Converts seconds to hours.
     * @param seconds the time in seconds
     * @return the time in hours
     */
    public static double secondsToHours(double seconds) {
        return seconds / 3600; // 1 hour = 3600 seconds
    }

    /**
     * Converts seconds to days.
     * @param seconds the time in seconds
     * @return the time in days
     */
    public static double secondsToDays(double seconds) {
        return seconds / 86400; // 1 day = 86400 seconds
    }

    /**
     * Converts minutes to seconds.
     * @param minutes the time in minutes
     * @return the time in seconds
     */
    public static double minutesToSeconds(double minutes) {
        return minutes * 60; // 1 minute = 60 seconds
    }

    /**
     * Converts minutes to hours.
     * @param minutes the time in minutes
     * @return the time in hours
     */
    public static double minutesToHours(double minutes) {
        return minutes / 60; // 1 hour = 60 minutes
    }

    /**
     * Converts minutes to days.
     * @param minutes the time in minutes
     * @return the time in days
     */
    public static double minutesToDays(double minutes) {
        return minutes / 1440; // 1 day = 1440 minutes
    }

    /**
     * Converts hours to seconds.
     * @param hours the time in hours
     * @return the time in seconds
     */
    public static double hoursToSeconds(double hours) {
        return hours * 3600; // 1 hour = 3600 seconds
    }

    /**
     * Converts hours to minutes.
     * @param hours the time in hours
     * @return the time in minutes
     */
    public static double hoursToMinutes(double hours) {
        return hours * 60; // 1 hour = 60 minutes
    }

    /**
     * Converts hours to days.
     * @param hours the time in hours
     * @return the time in days
     */
    public static double hoursToDays(double hours) {
        return hours / 24; // 1 day = 24 hours
    }

    /**
     * Converts days to seconds.
     * @param days the time in days
     * @return the time in seconds
     */
    public static double daysToSeconds(double days) {
        return days * 86400; // 1 day = 86400 seconds
    }

    /**
     * Converts days to minutes.
     * @param days the time in days
     * @return the time in minutes
     */
    public static double daysToMinutes(double days) {
        return days * 1440; // 1 day = 1440 minutes
    }

    /**
     * Converts days to hours.
     * @param days the time in days
     * @return the time in hours
     */
    public static double daysToHours(double days) {
        return days * 24; // 1 day = 24 hours
    }

    /**
     * Main method to test the conversion methods.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Example conversions:
        System.out.println("120 seconds to minutes: " + secondsToMinutes(120));
        System.out.println("2 hours to minutes: " + hoursToMinutes(2));
        System.out.println("3 days to hours: " + daysToHours(3));
        System.out.println("3600 seconds to hours: " + secondsToHours(3600));
    }
}
