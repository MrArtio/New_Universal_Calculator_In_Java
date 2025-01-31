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

        switch(sel){
            case 1:
                System.out.print("\nSelect the type of conversion: ");
                System.out.print("\n1) Bytes to Kilobytes");
                System.out.print("\n2) Kilobytes to Megabytes");
                System.out.print("\n3) Megabytes to Gigabytes");
                System.out.print("\n4) Gigabytes to Terabytes");
                System.out.print("\nSelect: ");
                int sel2 = in.nextInt();
                double value;
                switch(sel2){
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
                // MassConverter.massConverter();
                break;
            case 5:
                // PressureConverter.pressureConverter();
                break;
            case 6:
                // TemperatureConverter.temperatureConverter();
                break;
            case 7:
                // TimeConverter.timeConverter();
                break;
            case 8:
                // VolumeConverter.volumeConverter();
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
    }
}
