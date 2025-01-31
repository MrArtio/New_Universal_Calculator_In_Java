package Converter.unitConverter;

/**
 * The PressureConverter class provides methods to convert between different pressure units.
 * The supported units are Pascals, Bars, Atmospheres (atm), and Pounds per Square Inch (PSI).
 * This class is designed to be efficient, easy to read, and accurate.
 */
public class PressureConverter {

    // Constants for conversion factors (improves readability and maintainability)
    private static final double PASCALS_TO_BAR = 1.0 / 100000.0;
    private static final double BAR_TO_PASCALS = 100000.0;
    private static final double PASCALS_TO_ATMOSPHERES = 1.0 / 101325.0;
    private static final double ATMOSPHERES_TO_PASCALS = 101325.0;
    private static final double PASCALS_TO_PSI = 1.0 / 6894.76;
    private static final double PSI_TO_PASCALS = 6894.76;
    private static final double BAR_TO_ATMOSPHERES = 0.986923;
    private static final double ATMOSPHERES_TO_BAR = 1.0 / BAR_TO_ATMOSPHERES; // More accurate
    private static final double BAR_TO_PSI = 14.5038;
    private static final double PSI_TO_BAR = 1.0 / BAR_TO_PSI; // More accurate
    private static final double ATMOSPHERES_TO_PSI = 14.696;
    private static final double PSI_TO_ATMOSPHERES = 1.0 / ATMOSPHERES_TO_PSI; // More accurate


    // Conversion methods (using constants)

    public static double pascalsToBar(double pascals) {
        return pascals * PASCALS_TO_BAR;
    }

    public static double pascalsToAtmospheres(double pascals) {
        return pascals * PASCALS_TO_ATMOSPHERES;
    }

    public static double pascalsToPSI(double pascals) {
        return pascals * PASCALS_TO_PSI;
    }

    public static double barToPascals(double bar) {
        return bar * BAR_TO_PASCALS;
    }

    public static double barToAtmospheres(double bar) {
        return bar * BAR_TO_ATMOSPHERES;
    }

    public static double barToPSI(double bar) {
        return bar * BAR_TO_PSI;
    }

    public static double atmospheresToPascals(double atm) {
        return atm * ATMOSPHERES_TO_PASCALS;
    }

    public static double atmospheresToBar(double atm) {
        return atm * ATMOSPHERES_TO_BAR;
    }

    public static double atmospheresToPSI(double atm) {
        return atm * ATMOSPHERES_TO_PSI;
    }

    public static double psiToPascals(double psi) {
        return psi * PSI_TO_PASCALS;
    }

    public static double psiToBar(double psi) {
        return psi * PSI_TO_BAR;
    }

    public static double psiToAtmospheres(double psi) {
        return psi * PSI_TO_ATMOSPHERES;
    }
}