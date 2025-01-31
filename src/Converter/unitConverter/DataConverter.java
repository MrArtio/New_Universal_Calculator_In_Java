package Converter.unitConverter;

/**
 * A utility class for converting data storage units.
 * Supports conversion between bytes, kilobytes, megabytes, gigabytes, and terabytes.
 */
public class DataConverter {

    private static final double BYTES_TO_KILOBYTES = 1.0 / 1024.0;
    private static final double KILOBYTES_TO_MEGABYTES = 1.0 / 1024.0;
    private static final double MEGABYTES_TO_GIGABYTES = 1.0 / 1024.0;
    private static final double GIGABYTES_TO_TERABYTES = 1.0 / 1024.0;


    /**
     * Converts bytes to kilobytes.
     * @param bytes The value in bytes.
     * @return Equivalent value in kilobytes.
     */
    public static double bytesToKilobytes(double bytes) {
        return bytes * BYTES_TO_KILOBYTES;
    }

    /**
     * Converts kilobytes to megabytes.
     * @param kilobytes The value in kilobytes.
     * @return Equivalent value in megabytes.
     */
    public static double kilobytesToMegabytes(double kilobytes) {
        return kilobytes * KILOBYTES_TO_MEGABYTES;
    }

    /**
     * Converts megabytes to gigabytes.
     * @param megabytes The value in megabytes.
     * @return Equivalent value in gigabytes.
     */
    public static double megabytesToGigabytes(double megabytes) {
        return megabytes * MEGABYTES_TO_GIGABYTES;
    }

    /**
     * Converts gigabytes to terabytes.
     * @param gigabytes The value in gigabytes.
     * @return Equivalent value in terabytes.
     */
    public static double gigabytesToTerabytes(double gigabytes) {
        return gigabytes * GIGABYTES_TO_TERABYTES;
    }

    /**
     * Converts a given value from one unit to another based on the factor.
     * This method is more generic and can be used for other conversions if needed.
     * @param value The input value to be converted.
     * @param factor The conversion factor (e.g., 1/1024 for KB to MB, 1024 for MB to KB).
     * @return The converted value.
     */
    public static double convert(double value, double factor) {
        return value * factor;
    }
}