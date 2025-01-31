package Converter.unitConverter;

/**
 * EnergyConverter provides methods to convert energy between different units.
 * Supports Joules (J), Kilojoules (kJ), Calories (cal), Kilocalories (kcal),
 * Electronvolts (eV), and Watt-hours (Wh).
 */
public class EnergyConverter {

    // Constants for conversion factors
    private static final double JOULES_TO_KILOJOULES = 1.0 / 1000.0;
    private static final double KILOJOULES_TO_JOULES = 1000.0;
    private static final double JOULES_TO_CALORIES = 1.0 / 4.184;
    private static final double CALORIES_TO_JOULES = 4.184;
    private static final double JOULES_TO_KILOCALORIES = 1.0 / 4184.0;
    private static final double KILOCALORIES_TO_JOULES = 4184.0;
    private static final double JOULES_TO_ELECTRONVOLTS = 1.0 / 1.60218e-19;
    private static final double ELECTRONVOLTS_TO_JOULES = 1.60218e-19;
    private static final double JOULES_TO_WATTHOURS = 1.0 / 3600.0;
    private static final double WATTHOURS_TO_JOULES = 3600.0;

    // Conversion methods

    public static double joulesToKilojoules(double joules) {
        return joules * JOULES_TO_KILOJOULES;
    }

    public static double kilojoulesToJoules(double kilojoules) {
        return kilojoules * KILOJOULES_TO_JOULES;
    }

    public static double joulesToCalories(double joules) {
        return joules * JOULES_TO_CALORIES;
    }

    public static double caloriesToJoules(double calories) {
        return calories * CALORIES_TO_JOULES;
    }

    public static double joulesToKilocalories(double joules) {
        return joules * JOULES_TO_KILOCALORIES;
    }

    public static double kilocaloriesToJoules(double kilocalories) {
        return kilocalories * KILOCALORIES_TO_JOULES;
    }

    public static double joulesToElectronvolts(double joules) {
        return joules * JOULES_TO_ELECTRONVOLTS;
    }

    public static double electronvoltsToJoules(double electronvolts) {
        return electronvolts * ELECTRONVOLTS_TO_JOULES;
    }

    public static double joulesToWattHours(double joules) {
        return joules * JOULES_TO_WATTHOURS;
    }

    public static double wattHoursToJoules(double wattHours) {
        return wattHours * WATTHOURS_TO_JOULES;
    }
}