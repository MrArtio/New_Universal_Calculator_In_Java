package Converter.unitConverter;

/**
 * The TemperatureConverter class provides methods to convert between different temperature units.
 * The supported units are Celsius, Fahrenheit, and Kelvin.
 * This class is designed to be efficient, easy to read, and accurate.
 */
public class TemperatureConverter {

    // Constants for conversion factors (not strictly needed here, but good practice)
    private static final double FAHRENHEIT_OFFSET = 32.0;
    private static final double KELVIN_OFFSET = 273.15;
    private static final double FIVE_NINTHS = 5.0 / 9.0; // Use doubles for accurate division
    private static final double NINE_FIFTHS = 9.0 / 5.0;


    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * NINE_FIFTHS) + FAHRENHEIT_OFFSET;
    }

    /**
     * Converts Celsius to Kelvin.
     * @param celsius the temperature in Celsius
     * @return the temperature in Kelvin
     */
    public static double celsiusToKelvin(double celsius) {
        return celsius + KELVIN_OFFSET;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * @param fahrenheit the temperature in Fahrenheit
     * @return the temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET) * FIVE_NINTHS;
    }

    /**
     * Converts Fahrenheit to Kelvin.
     * @param fahrenheit the temperature in Fahrenheit
     * @return the temperature in Kelvin
     */
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * FIVE_NINTHS;  // More accurate conversion
    }

    /**
     * Converts Kelvin to Celsius.
     * @param kelvin the temperature in Kelvin
     * @return the temperature in Celsius
     */
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    /**
     * Converts Kelvin to Fahrenheit.
     * @param kelvin the temperature in Kelvin
     * @return the temperature in Fahrenheit
     */
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * NINE_FIFTHS) - 459.67; // More accurate conversion
    }

    // Removed main() method - testing should be done in a separate class.
}