package Converter.unitConverter;

/**
 * The TemperatureConverter class provides methods to convert between different temperature units.
 * The supported units are Celsius, Fahrenheit, and Kelvin.
 * This class is designed to be efficient, easy to read, and accurate.
 */
public class TemperatureConverter {

    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32; // Formula: F = (C * 9/5) + 32
    }

    /**
     * Converts Celsius to Kelvin.
     * @param celsius the temperature in Celsius
     * @return the temperature in Kelvin
     */
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15; // Formula: K = C + 273.15
    }

    /**
     * Converts Fahrenheit to Celsius.
     * @param fahrenheit the temperature in Fahrenheit
     * @return the temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9; // Formula: C = (F - 32) * 5/9
    }

    /**
     * Converts Fahrenheit to Kelvin.
     * @param fahrenheit the temperature in Fahrenheit
     * @return the temperature in Kelvin
     */
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9; // Formula: K = (F + 459.67) * 5/9
    }

    /**
     * Converts Kelvin to Celsius.
     * @param kelvin the temperature in Kelvin
     * @return the temperature in Celsius
     */
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15; // Formula: C = K - 273.15
    }

    /**
     * Converts Kelvin to Fahrenheit.
     * @param kelvin the temperature in Kelvin
     * @return the temperature in Fahrenheit
     */
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9/5) - 459.67; // Formula: F = (K * 9/5) - 459.67
    }

    /**
     * Main method to test the conversion methods.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Example conversions:
        System.out.println("25 Celsius to Fahrenheit: " + celsiusToFahrenheit(25));
        System.out.println("100 Fahrenheit to Celsius: " + fahrenheitToCelsius(100));
        System.out.println("300 Kelvin to Celsius: " + kelvinToCelsius(300));
        System.out.println("0 Celsius to Kelvin: " + celsiusToKelvin(0));
    }
}
