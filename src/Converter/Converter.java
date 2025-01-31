package Converter;

import Converter.unitConverter.DataConverter;
import Converter.unitConverter.EnergyConverter;
import Converter.unitConverter.LengthConverter;
import Converter.unitConverter.MassConverter;
import Converter.unitConverter.PressureConverter;
import Converter.unitConverter.TemperatureConverter;
import Converter.unitConverter.TimeConverter;
import Converter.unitConverter.VolumeConverter;

import java.util.Scanner;

public class Converter {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int sel;
        // Selection menu to choose the type of converter
        System.out.print("\nSelect the type of converter: ");
        System.out.print("\n1) Data Converter");
        System.out.print("\n2) Energy Converter");
        System.out.print("\n3) Length Converter");
        System.out.print("\n4) Mass Converter");
        System.out.print("\n5) Pressure Converter");
        System.out.print("\n6) Temperature Converter");
        System.out.print("\n7) Time Converter");
        System.out.print("\n8) Volume Converter");
        System.out.print("\nSelect: ");

        sel = in.nextInt();

        switch (sel) {
            case 1:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Bytes to Kilobytes");
                System.out.print("\n2) Kilobytes to Megabytes");
                System.out.print("\n3) Megabytes to Gigabytes");
                System.out.print("\n4) Gigabytes to Terabytes");
                System.out.print("\nSelect: ");
                int sel2 = in.nextInt();
                double value;
                switch (sel2) {
                    case 1:
                        System.out.print("\nEnter the value in bytes: ");
                        value = in.nextDouble();
                        System.out.println("Value in kilobytes: " + DataConverter.bytesToKilobytes(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in kilobytes: ");
                        value = in.nextDouble();
                        System.out.println("Value in megabytes: " + DataConverter.kilobytesToMegabytes(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in megabytes: ");
                        value = in.nextDouble();
                        System.out.println("Value in gigabytes: " + DataConverter.megabytesToGigabytes(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in gigabytes: ");
                        value = in.nextDouble();
                        System.out.println("Value in terabytes: " + DataConverter.gigabytesToTerabytes(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
                break;
            case 2:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Joules to Calories");
                System.out.print("\n2) Calories to Joules");
                System.out.print("\n3) Joules to Kilocalories");
                System.out.print("\n4) Kilocalories to Joules");
                System.out.print("\n5) Joules to Electronvolts");
                System.out.print("\n6) Electronvolts to Joules");
                System.out.print("\n7) Joules to Watt-hours");
                System.out.print("\n8) Watt-hours to Joules");
                System.out.print("\nSelect: ");
                int sel3 = in.nextInt();

                switch (sel3) {
                    case 1:
                        System.out.print("\nEnter the value in Joules: ");
                        value = in.nextDouble();
                        System.out.println("Value in Calories: " + EnergyConverter.joulesToCalories(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in Calories: ");
                        value = in.nextDouble();
                        System.out.println("Value in Joules: " + EnergyConverter.caloriesToJoules(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in Joules: ");
                        value = in.nextDouble();
                        System.out.println("Value in Kilocalories: " + EnergyConverter.joulesToKilocalories(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in Kilocalories: ");
                        value = in.nextDouble();
                        System.out.println("Value in Joules: " + EnergyConverter.kilocaloriesToJoules(value));
                        break;
                    case 5:
                        System.out.print("\nEnter the value in Joules: ");
                        value = in.nextDouble();
                        System.out.println("Value in Electronvolts: " + EnergyConverter.joulesToElectronvolts(value));
                        break;
                    case 6:
                        System.out.print("\nEnter the value in Electronvolts: ");
                        value = in.nextDouble();
                        System.out.println("Value in Joules: " + EnergyConverter.electronvoltsToJoules(value));
                        break;
                    case 7:
                        System.out.print("\nEnter the value in Joules: ");
                        value = in.nextDouble();
                        System.out.println("Value in Watt-hours: " + EnergyConverter.joulesToWattHours(value));
                        break;
                    case 8:
                        System.out.print("\nEnter the value in Watt-hours: ");
                        value = in.nextDouble();
                        System.out.println("Value in Joules: " + EnergyConverter.wattHoursToJoules(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
                break;
            case 3:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Inches to Centimeters");
                System.out.print("\n2) Centimeters to Inches");
                System.out.print("\n3) Feet to Meters");
                System.out.print("\n4) Meters to Feet");
                System.out.print("\n5) Yards to Meters");
                System.out.print("\n6) Meters to Yards");
                System.out.print("\n7) Miles to Kilometers");
                System.out.print("\n8) Kilometers to Miles");
                System.out.print("\n9) Feet to Yards");
                System.out.print("\n10) Yards to Feet");
                System.out.print("\n11) Inches to Yards");
                System.out.print("\n12) Yards to Inches");
                System.out.print("\n13) Kilometers to Yards");
                System.out.print("\n14) Yards to Kilometers");
                System.out.print("\n15) Miles to Yards");
                System.out.print("\n16) Yards to Miles");
                System.out.print("\nSelect: ");
                int sel4 = in.nextInt();

                switch (sel4) {
                    case 1:
                        System.out.print("\nEnter the value in inches: ");
                        value = in.nextDouble();
                        System.out.println("Value in centimeters: " + LengthConverter.inchesToCentimeters(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in centimeters: ");
                        value = in.nextDouble();
                        System.out.println("Value in inches: " + LengthConverter.centimetersToInches(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in feet: ");
                        value = in.nextDouble();
                        System.out.println("Value in meters: " + LengthConverter.feetToMeters(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in meters: ");
                        value = in.nextDouble();
                        System.out.println("Value in feet: " + LengthConverter.metersToFeet(value));
                        break;
                    case 5:
                        System.out.print("\nEnter the value in yards: ");
                        value = in.nextDouble();
                        System.out.println("Value in meters: " + LengthConverter.yardsToMeters(value));
                        break;
                    case 6:
                        System.out.print("\nEnter the value in meters: ");
                        value = in.nextDouble();
                        System.out.println("Value in yards: " + LengthConverter.metersToYards(value));
                        break;
                    case 7:
                        System.out.print("\nEnter the value in miles: ");
                        value = in.nextDouble();
                        System.out.println("Value in kilometers: " + LengthConverter.milesToKilometers(value));
                        break;
                    case 8:
                        System.out.print("\nEnter the value in kilometers: ");
                        value = in.nextDouble();
                        System.out.println("Value in miles: " + LengthConverter.kilometersToMiles(value));
                        break;
                    case 9:
                        System.out.print("\nEnter the value in feet: ");
                        value = in.nextDouble();
                        System.out.println("Value in yards: " + LengthConverter.feetToYards(value));
                        break;
                    case 10:
                        System.out.print("\nEnter the value in yards: ");
                        value = in.nextDouble();
                        System.out.println("Value in feet: " + LengthConverter.yardsToFeet(value));
                        break;
                    case 11:
                        System.out.print("\nEnter the value in inches: ");
                        value = in.nextDouble();
                        System.out.println("Value in yards: " + LengthConverter.inchesToYards(value));
                        break;
                    case 12:
                        System.out.print("\nEnter the value in yards: ");
                        value = in.nextDouble();
                        System.out.println("Value in inches: " + LengthConverter.yardsToInches(value));
                        break;
                    case 13:
                        System.out.print("\nEnter the value in kilometers: ");
                        value = in.nextDouble();
                        System.out.println("Value in yards: " + LengthConverter.kilometersToYards(value));
                        break;
                    case 14:
                        System.out.print("\nEnter the value in yards: ");
                        value = in.nextDouble();
                        System.out.println("Value in kilometers: " + LengthConverter.yardsToKilometers(value));
                        break;
                    case 15:
                        System.out.print("\nEnter the value in miles: ");
                        value = in.nextDouble();
                        System.out.println("Value in yards: " + LengthConverter.milesToYards(value));
                        break;
                    case 16:
                        System.out.print("\nEnter the value in yards: ");
                        value = in.nextDouble();
                        System.out.println("Value in miles: " + LengthConverter.yardsToMiles(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
            case 4:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Kilograms to Grams");
                System.out.print("\n2) Kilograms to Pounds");
                System.out.print("\n3) Kilograms to Ounces");
                System.out.print("\n4) Grams to Kilograms");
                System.out.print("\n5) Grams to Pounds");
                System.out.print("\n6) Grams to Ounces");
                System.out.print("\n7) Pounds to Kilograms");
                System.out.print("\n8) Pounds to Grams");
                System.out.print("\n9) Pounds to Ounces");
                System.out.print("\n10) Ounces to Kilograms");
                System.out.print("\n11) Ounces to Grams");
                System.out.print("\n12) Ounces to Pounds");
                System.out.print("\nSelect: ");

                int sel5 = in.nextInt();

                switch (sel5) {
                    case 1:
                        System.out.print("\nEnter the value in kilograms: ");
                        value = in.nextDouble();
                        System.out.println("Value in grams: " + MassConverter.kilogramsToGrams(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in kilograms: ");
                        value = in.nextDouble();
                        System.out.println("Value in pounds: " + MassConverter.kilogramsToPounds(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in kilograms: ");
                        value = in.nextDouble();
                        System.out.println("Value in ounces: " + MassConverter.kilogramsToOunces(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in grams: ");
                        value = in.nextDouble();
                        System.out.println("Value in kilograms: " + MassConverter.gramsToKilograms(value));
                        break;
                    case 5:
                        System.out.print("\nEnter the value in grams: ");
                        value = in.nextDouble();
                        System.out.println("Value in pounds: " + MassConverter.gramsToPounds(value));
                        break;
                    case 6:
                        System.out.print("\nEnter the value in grams: ");
                        value = in.nextDouble();
                        System.out.println("Value in ounces: " + MassConverter.gramsToOunces(value));
                        break;
                    case 7:
                        System.out.print("\nEnter the value in pounds: ");
                        value = in.nextDouble();
                        System.out.println("Value in kilograms: " + MassConverter.poundsToKilograms(value));
                        break;
                    case 8:
                        System.out.print("\nEnter the value in pounds: ");
                        value = in.nextDouble();
                        System.out.println("Value in grams: " + MassConverter.poundsToGrams(value));
                        break;
                    case 9:
                        System.out.print("\nEnter the value in pounds: ");
                        value = in.nextDouble();
                        System.out.println("Value in ounces: " + MassConverter.poundsToOunces(value));
                        break;
                    case 10:
                        System.out.print("\nEnter the value in ounces: ");
                        value = in.nextDouble();
                        System.out.println("Value in kilograms: " + MassConverter.ouncesToKilograms(value));
                        break;
                    case 11:
                        System.out.print("\nEnter the value in ounces: ");
                        value = in.nextDouble();
                        System.out.println("Value in grams: " + MassConverter.ouncesToGrams(value));
                        break;
                    case 12:
                        System.out.print("\nEnter the value in ounces: ");
                        value = in.nextDouble();
                        System.out.println("Value in pounds: " + MassConverter.ouncesToPounds(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
            case 5:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Pascals to Bar");
                System.out.print("\n2) Bar to Pascals");
                System.out.print("\n3) Pascals to Atmospheres");
                System.out.print("\n4) Atmospheres to Pascals");
                System.out.print("\n5) Pascals to PSI");
                System.out.print("\n6) PSI to Pascals");
                System.out.print("\n7) Bar to Atmospheres");
                System.out.print("\n8) Atmospheres to Bar");
                System.out.print("\n9) Bar to PSI");
                System.out.print("\n10) PSI to Bar");
                System.out.print("\n11) Atmospheres to PSI");
                System.out.print("\n12) PSI to Atmospheres");
                int sel6 = in.nextInt();

                switch (sel6) {
                    case 1:
                        System.out.print("\nEnter the value in pascals: ");
                        value = in.nextDouble();
                        System.out.println("Value in bar: " + PressureConverter.pascalsToBar(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in bar: ");
                        value = in.nextDouble();
                        System.out.println("Value in pascals: " + PressureConverter.barToPascals(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in pascals: ");
                        value = in.nextDouble();
                        System.out.println("Value in atmospheres: " + PressureConverter.pascalsToAtmospheres(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in atmospheres: ");
                        value = in.nextDouble();
                        System.out.println("Value in pascals: " + PressureConverter.atmospheresToPascals(value));
                        break;
                    case 5:
                        System.out.print("\nEnter the value in pascals: ");
                        value = in.nextDouble();
                        System.out.println("Value in PSI: " + PressureConverter.pascalsToPSI(value));
                        break;
                    case 6:
                        System.out.print("\nEnter the value in PSI: ");
                        value = in.nextDouble();
                        System.out.println("Value in pascals: " + PressureConverter.psiToPascals(value));
                        break;
                    case 7:
                        System.out.print("\nEnter the value in bar: ");
                        value = in.nextDouble();
                        System.out.println("Value in atmospheres: " + PressureConverter.barToAtmospheres(value));
                        break;
                    case 8:
                        System.out.print("\nEnter the value in atmospheres: ");
                        value = in.nextDouble();
                        System.out.println("Value in bar: " + PressureConverter.atmospheresToBar(value));
                        break;
                    case 9:
                        System.out.print("\nEnter the value in bar: ");
                        value = in.nextDouble();
                        System.out.println("Value in PSI: " + PressureConverter.barToPSI(value));
                        break;
                    case 10:
                        System.out.print("\nEnter the value in PSI: ");
                        value = in.nextDouble();
                        System.out.println("Value in bar: " + PressureConverter.psiToBar(value));
                        break;
                    case 11:
                        System.out.print("\nEnter the value in atmospheres: ");
                        value = in.nextDouble();
                        System.out.println("Value in PSI: " + PressureConverter.atmospheresToPSI(value));
                        break;
                    case 12:
                        System.out.print("\nEnter the value in PSI: ");
                        value = in.nextDouble();
                        System.out.println("Value in atmospheres: " + PressureConverter.psiToAtmospheres(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
            case 6:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Celsius to Fahrenheit");
                System.out.print("\n2) Celsius to Kelvin");
                System.out.print("\n3) Fahrenheit to Celsius");
                System.out.print("\n4) Fahrenheit to Kelvin");
                System.out.print("\n5) Kelvin to Celsius");
                System.out.print("\n6) Kelvin to Fahrenheit");
                int sel7 = in.nextInt();

                switch (sel7) {
                    case 1:
                        System.out.print("\nEnter the value in Celsius: ");
                        value = in.nextDouble();
                        System.out.println("Value in Fahrenheit: " + TemperatureConverter.celsiusToFahrenheit(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in Celsius: ");
                        value = in.nextDouble();
                        System.out.println("Value in Kelvin: " + TemperatureConverter.celsiusToKelvin(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in Fahrenheit: ");
                        value = in.nextDouble();
                        System.out.println("Value in Celsius: " + TemperatureConverter.fahrenheitToCelsius(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in Fahrenheit: ");
                        value = in.nextDouble();
                        System.out.println("Value in Kelvin: " + TemperatureConverter.fahrenheitToKelvin(value));
                        break;
                    case 5:
                        System.out.print("\nEnter the value in Kelvin: ");
                        value = in.nextDouble();
                        System.out.println("Value in Celsius: " + TemperatureConverter.kelvinToCelsius(value));
                        break;
                    case 6:
                        System.out.print("\nEnter the value in Kelvin: ");
                        value = in.nextDouble();
                        System.out.println("Value in Fahrenheit: " + TemperatureConverter.kelvinToFahrenheit(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
            case 7:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Seconds to Minutes");
                System.out.print("\n2) Minutes to Seconds");
                System.out.print("\n3) Seconds to Hours");
                System.out.print("\n4) Hours to Seconds");
                System.out.print("\n5) Seconds to Days");
                System.out.print("\n6) Days to Seconds");
                System.out.print("\n7) Minutes to Hours");
                System.out.print("\n8) Hours to Minutes");
                System.out.print("\n9) Minutes to Days");
                System.out.print("\n10) Days to Minutes");
                System.out.print("\n11) Hours to Days");
                System.out.print("\n12) Days to Hours");
                int sel8 = in.nextInt();

                switch (sel8) {
                    case 1:
                        System.out.print("\nEnter the value in seconds: ");
                        value = in.nextDouble();
                        System.out.println("Value in minutes: " + TimeConverter.secondsToMinutes(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in minutes: ");
                        value = in.nextDouble();
                        System.out.println("Value in seconds: " + TimeConverter.minutesToSeconds(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in seconds: ");
                        value = in.nextDouble();
                        System.out.println("Value in hours: " + TimeConverter.secondsToHours(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in hours: ");
                        value = in.nextDouble();
                        System.out.println("Value in seconds: " + TimeConverter.hoursToSeconds(value));
                        break;
                    case 5:
                        System.out.print("\nEnter the value in seconds: ");
                        value = in.nextDouble();
                        System.out.println("Value in days: " + TimeConverter.secondsToDays(value));
                        break;
                    case 6:
                        System.out.print("\nEnter the value in days: ");
                        value = in.nextDouble();
                        System.out.println("Value in seconds: " + TimeConverter.daysToSeconds(value));
                        break;
                    case 7:
                        System.out.print("\nEnter the value in minutes: ");
                        value = in.nextDouble();
                        System.out.println("Value in hours: " + TimeConverter.minutesToHours(value));
                        break;
                    case 8:
                        System.out.print("\nEnter the value in hours: ");
                        value = in.nextDouble();
                        System.out.println("Value in minutes: " + TimeConverter.hoursToMinutes(value));
                        break;
                    case 9:
                        System.out.print("\nEnter the value in minutes: ");
                        value = in.nextDouble();
                        System.out.println("Value in days: " + TimeConverter.minutesToDays(value));
                        break;
                    case 10:
                        System.out.print("\nEnter the value in days: ");
                        value = in.nextDouble();
                        System.out.println("Value in minutes: " + TimeConverter.daysToMinutes(value));
                        break;
                    case 11:
                        System.out.print("\nEnter the value in hours: ");
                        value = in.nextDouble();
                        System.out.println("Value in days: " + TimeConverter.hoursToDays(value));
                        break;
                    case 12:
                        System.out.print("\nEnter the value in days: ");
                        value = in.nextDouble();
                        System.out.println("Value in hours: " + TimeConverter.daysToHours(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
            case 8:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Cubic Meters to Liters");
                System.out.print("\n2) Liters to Cubic Meters");
                System.out.print("\n3) Milliliters to Liters");
                System.out.print("\n4) Liters to Milliliters");
                System.out.print("\n5) Cubic Centimeters to Liters");
                System.out.print("\n6) Liters to Cubic Centimeters");
                System.out.print("\n7) Cubic Inches to Liters");
                System.out.print("\n8) Liters to Cubic Inches");
                System.out.print("\n9) Gallons to Liters");
                System.out.print("\n10) Liters to Gallons");
                int sel9 = in.nextInt();

                switch (sel9) {
                    case 1:
                        System.out.print("\nEnter the value in cubic meters: ");
                        value = in.nextDouble();
                        System.out.println("Value in liters: " + VolumeConverter.cubicMetersToLiters(value));
                        break;
                    case 2:
                        System.out.print("\nEnter the value in liters: ");
                        value = in.nextDouble();
                        System.out.println("Value in cubic meters: " + VolumeConverter.litersToCubicMeters(value));
                        break;
                    case 3:
                        System.out.print("\nEnter the value in milliliters: ");
                        value = in.nextDouble();
                        System.out.println("Value in liters: " + VolumeConverter.millilitersToLiters(value));
                        break;
                    case 4:
                        System.out.print("\nEnter the value in liters: ");
                        value = in.nextDouble();
                        System.out.println("Value in milliliters: " + VolumeConverter.litersToMilliliters(value));
                        break;
                    case 5:
                        System.out.print("\nEnter the value in cubic centimeters: ");
                        value = in.nextDouble();
                        System.out.println("Value in liters: " + VolumeConverter.cubicCentimetersToLiters(value));
                        break;
                    case 6:
                        System.out.print("\nEnter the value in liters: ");
                        value = in.nextDouble();
                        System.out.println("Value in cubic centimeters: " + VolumeConverter.litersToCubicCentimeters(value));
                        break;
                    case 7:
                        System.out.print("\nEnter the value in cubic inches: ");
                        value = in.nextDouble();
                        System.out.println("Value in liters: " + VolumeConverter.cubicInchesToLiters(value));
                        break;
                    case 8:
                        System.out.print("\nEnter the value in liters: ");
                        value = in.nextDouble();
                        System.out.println("Value in cubic inches: " + VolumeConverter.litersToCubicInches(value));
                        break;
                    case 9:
                        System.out.print("\nEnter the value in gallons: ");
                        value = in.nextDouble();
                        System.out.println("Value in liters: " + VolumeConverter.gallonsToLiters(value));
                        break;
                    case 10:
                        System.out.print("\nEnter the value in liters: ");
                        value = in.nextDouble();
                        System.out.println("Value in gallons: " + VolumeConverter.litersToGallons(value));
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
        }
    }
}
