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

    /**
     * Converts cubic meters (m³) to liters (L).
     * 1 cubic meter = 1000 liters.
     *
     * @param cubicMeters the volume in cubic meters to be converted.
     * @return the equivalent volume in liters.
     */
    public double cubicMetersToLiters(double cubicMeters) {
        return cubicMeters * 1000;
    }

    /**
     * Converts liters (L) to cubic meters (m³).
     * 1 liter = 0.001 cubic meters.
     *
     * @param liters the volume in liters to be converted.
     * @return the equivalent volume in cubic meters.
     */
    public double litersToCubicMeters(double liters) {
        return liters * 0.001;
    }

    /**
     * Converts milliliters (mL) to liters (L).
     * 1 milliliter = 0.001 liters.
     *
     * @param milliliters the volume in milliliters to be converted.
     * @return the equivalent volume in liters.
     */
    public double millilitersToLiters(double milliliters) {
        return milliliters * 0.001;
    }

    /**
     * Converts liters (L) to milliliters (mL).
     * 1 liter = 1000 milliliters.
     *
     * @param liters the volume in liters to be converted.
     * @return the equivalent volume in milliliters.
     */
    public double litersToMilliliters(double liters) {
        return liters * 1000;
    }

    /**
     * Converts cubic centimeters (cm³) to liters (L).
     * 1 cubic centimeter = 0.001 liters.
     *
     * @param cubicCentimeters the volume in cubic centimeters to be converted.
     * @return the equivalent volume in liters.
     */
    public double cubicCentimetersToLiters(double cubicCentimeters) {
        return cubicCentimeters * 0.001;
    }

    /**
     * Converts liters (L) to cubic centimeters (cm³).
     * 1 liter = 1000 cubic centimeters.
     *
     * @param liters the volume in liters to be converted.
     * @return the equivalent volume in cubic centimeters.
     */
    public double litersToCubicCentimeters(double liters) {
        return liters * 1000;
    }

    /**
     * Converts cubic inches (in³) to liters (L).
     * 1 cubic inch = 0.0163871 liters.
     *
     * @param cubicInches the volume in cubic inches to be converted.
     * @return the equivalent volume in liters.
     */
    public double cubicInchesToLiters(double cubicInches) {
        return cubicInches * 0.0163871;
    }

    /**
     * Converts liters (L) to cubic inches (in³).
     * 1 liter = 61.0237 cubic inches.
     *
     * @param liters the volume in liters to be converted.
     * @return the equivalent volume in cubic inches.
     */
    public double litersToCubicInches(double liters) {
        return liters * 61.0237;
    }

    /**
     * Converts US gallons to liters (L).
     * 1 US gallon = 3.78541 liters.
     *
     * @param gallons the volume in US gallons to be converted.
     * @return the equivalent volume in liters.
     */
    public double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    /**
     * Converts liters (L) to US gallons.
     * 1 liter = 0.264172 US gallons.
     *
     * @param liters the volume in liters to be converted.
     * @return the equivalent volume in US gallons.
     */
    public double litersToGallons(double liters) {
        return liters * 0.264172;
    }
}
