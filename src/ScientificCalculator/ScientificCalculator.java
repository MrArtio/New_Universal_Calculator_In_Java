package ScientificCalculator;

import java.util.*;

public class ScientificCalculator {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        mainScientific();
    }

    // Calculate the N-th root (generic root calculation)
    public static void calcRootX() {
        System.out.print("\nEnter the root exponent: ");
        double Y = in.nextInt();
        System.out.print("\nEnter the radicand: ");
        double X = in.nextInt();
        CalculateRootX rootCalculation = new CalculateRootX(Y, X);
        rootCalculation.calculateRootXY();
    }

    // Calculate the square root (X^2)
    public static void calcRootX2() {
        System.out.print("\nEnter the radicand: ");
        double X = in.nextInt();
        CalculateRootX2 squareRootCalc = new CalculateRootX2(X);
        squareRootCalc.calculateRootX2();
    }

    // Calculate the cube root (X^3)
    public static void calcRootX3() {
        System.out.print("\nEnter the radicand: ");
        double X = in.nextInt();
        CalculateRootX3 cubeRootCalc = new CalculateRootX3(X);
        cubeRootCalc.calculateRootX3();
    }

    // Calculate the exponential X (X raised to the power of Y)
    public static void calcExponentialX() {
        System.out.print("\nEnter the exponent: ");
        double Y = in.nextInt();
        System.out.print("\nEnter the base: ");
        double X = in.nextInt();
        CalculateExponentialX expCalc = new CalculateExponentialX(X, Y);
        expCalc.calculateExponentialX();
    }

    // Calculate the exponential X^2 (X raised to the power of 2)
    public static void calcExponentialX2() {
        System.out.print("\nEnter the base: ");
        double X = in.nextInt();
        CalculateExponentialX2 expCalcX2 = new CalculateExponentialX2(X);
        expCalcX2.calculateExponentialX2();
    }

    // Calculate the exponential X^3 (X raised to the power of 3)
    public static void calcExponentialX3() {
        System.out.print("\nEnter the base: ");
        double X = in.nextInt();
        CalculateExponentialX3 expCalcX3 = new CalculateExponentialX3(X);
        expCalcX3.calculateExponentialX3();
    }

    // Calculate sine of X
    public static void calcSinX() {
        System.out.print("\nEnter the angle in degrees: ");
        double angleSinX = in.nextInt();
        CalculateSinX sinCalc = new CalculateSinX(angleSinX);
        sinCalc.calculateSinX();
    }

    // Calculate cosine of X
    public static void calcCosX() {
        System.out.print("\nEnter the angle in degrees: ");
        double angleCosX = in.nextInt();
        CalculateCosX cosCalc = new CalculateCosX(angleCosX);
        cosCalc.calculateCosX();
    }

    // Calculate tangent of X
    public static void calcTanX() {
        System.out.print("\nEnter the angle in degrees: ");
        double angleTanX = in.nextInt();
        CalculateTanX tanCalc = new CalculateTanX(angleTanX);
        tanCalc.calculateTanX();
    }

    // Main method to display the operations menu
    public static void mainScientific() {
        System.out.print("\nSelect the operation to perform: ");
        System.out.print("\n");
        System.out.print("\n1) Calculate RootX");
        System.out.print("\n2) Calculate RootX^2");
        System.out.print("\n3) Calculate RootX^3");
        System.out.print("\n4) Calculate ExponentialX");
        System.out.print("\n5) Calculate ExponentialX^2");
        System.out.print("\n6) Calculate ExponentialX^3");
        System.out.print("\n7) Calculate sinX");
        System.out.print("\n8) Calculate cosX");
        System.out.print("\n9) Calculate tanX");
        System.out.print("\n");
        System.out.print("\nSelect: ");

        int sel = in.nextInt();

        switch (sel) {
            case 1:
                calcRootX();
                break;
            case 2:
                calcRootX2();
                break;
            case 3:
                calcRootX3();
                break;
            case 4:
                calcExponentialX();
                break;
            case 5:
                calcExponentialX2();
                break;
            case 6:
                calcExponentialX3();
                break;
            case 7:
                calcSinX();
                break;
            case 8:
                calcCosX();
                break;
            case 9:
                calcTanX();
                break;
        }
    }
}
