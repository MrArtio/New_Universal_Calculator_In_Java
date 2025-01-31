package Converter.unitConverter;

/**
 * The PressureConverter class provides methods to convert between different pressure units.
 * The supported units are Pascals, Bars, Atmospheres (atm), and Pounds per Square Inch (PSI).
 * This class is designed to be efficient, easy to read, and accurate.
 */
public class PressureConverter {

    /**
     * Converts Pascals to Bar.
     * @param pascals the pressure in Pascals
     * @return the pressure in Bars
     */
    public static double pascalsToBar(double pascals) {
        return pascals / 100000; // 1 Bar = 100,000 Pascals
    }

    /**
     * Converts Pascals to Atmospheres.
     * @param pascals the pressure in Pascals
     * @return the pressure in Atmospheres (atm)
     */
    public static double pascalsToAtmospheres(double pascals) {
        return pascals / 101325; // 1 atm = 101,325 Pascals
    }

    /**
     * Converts Pascals to PSI (Pounds per Square Inch).
     * @param pascals the pressure in Pascals
     * @return the pressure in PSI
     */
    public static double pascalsToPSI(double pascals) {
        return pascals / 6894.76; // 1 PSI = 6894.76 Pascals
    }

    /**
     * Converts Bar to Pascals.
     * @param bar the pressure in Bars
     * @return the pressure in Pascals
     */
    public static double barToPascals(double bar) {
        return bar * 100000; // 1 Bar = 100,000 Pascals
    }

    /**
     * Converts Bar to Atmospheres.
     * @param bar the pressure in Bars
     * @return the pressure in Atmospheres (atm)
     */
    public static double barToAtmospheres(double bar) {
        return bar * 0.986923; // 1 Bar = 0.986923 atm
    }

    /**
     * Converts Bar to PSI.
     * @param bar the pressure in Bars
     * @return the pressure in PSI
     */
    public static double barToPSI(double bar) {
        return bar * 14.5038; // 1 Bar = 14.5038 PSI
    }

    /**
     * Converts Atmospheres to Pascals.
     * @param atm the pressure in Atmospheres
     * @return the pressure in Pascals
     */
    public static double atmospheresToPascals(double atm) {
        return atm * 101325; // 1 atm = 101,325 Pascals
    }

    /**
     * Converts Atmospheres to Bar.
     * @param atm the pressure in Atmospheres
     * @return the pressure in Bars
     */
    public static double atmospheresToBar(double atm) {
        return atm * 1.01325; // 1 atm = 1.01325 Bar
    }

    /**
     * Converts Atmospheres to PSI.
     * @param atm the pressure in Atmospheres
     * @return the pressure in PSI
     */
    public static double atmospheresToPSI(double atm) {
        return atm * 14.696; // 1 atm = 14.696 PSI
    }

    /**
     * Converts PSI to Pascals.
     * @param psi the pressure in PSI
     * @return the pressure in Pascals
     */
    public static double psiToPascals(double psi) {
        return psi * 6894.76; // 1 PSI = 6894.76 Pascals
    }

    /**
     * Converts PSI to Bar.
     * @param psi the pressure in PSI
     * @return the pressure in Bars
     */
    public static double psiToBar(double psi) {
        return psi / 14.5038; // 1 PSI = 1/14.5038 Bar
    }

    /**
     * Converts PSI to Atmospheres.
     * @param psi the pressure in PSI
     * @return the pressure in Atmospheres (atm)
     */
    public static double psiToAtmospheres(double psi) {
        return psi / 14.696; // 1 PSI = 1/14.696 atm
    }

    /**
     * Main method to test the conversion methods.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Example conversions:
        System.out.println("100000 Pascals to Bar: " + pascalsToBar(100000));
        System.out.println("5 Bar to Pascals: " + barToPascals(5));
        System.out.println("1 Atmosphere to PSI: " + atmospheresToPSI(1));
        System.out.println("50 PSI to Atmospheres: " + psiToAtmospheres(50));
    }
}
