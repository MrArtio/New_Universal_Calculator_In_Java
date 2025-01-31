package Basic_Calculator; // Renamed for universal use

import java.util.*;

public class BasicCalculator {
    // Scanner to read user input
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        mainBasic();
    }

    // Method for addition operation
    public static void calcAddition() {
        System.out.print("\nEnter the first number: ");
        int n1 = in.nextInt();
        System.out.print("\nEnter the second number: ");
        int n2 = in.nextInt();

        // Creating an instance of the Addition class and performing the operation
        Addition addition = new Addition(n1, n2);
        addition.calculateAddition();
    }

    // Method for subtraction operation
    public static void calcSubtraction() {
        System.out.print("\nEnter the first number: ");
        int n1 = in.nextInt();
        System.out.print("\nEnter the second number: ");
        int n2 = in.nextInt();

        // Creating an instance of the Subtraction class and performing the operation
        Subtraction subtraction = new Subtraction(n1, n2);
        subtraction.calculateSubtraction();
    }

    // Method for multiplication operation
    public static void calcMultiplication() {
        System.out.print("\nEnter the first number: ");
        int n1 = in.nextInt();
        System.out.print("\nEnter the second number: ");
        int n2 = in.nextInt();

        // Creating an instance of the Multiplication class and performing the operation
        Multiplication multiplication = new Multiplication(n1, n2);
        multiplication.calculateMultiplication();
    }

    // Method for division operation
    public static void calcDivision() {
        System.out.print("\nEnter the first number: ");
        int n1 = in.nextInt();
        System.out.print("\nEnter the second number: ");
        int n2 = in.nextInt();

        // Creating an instance of the Division class and performing the operation
        Division division = new Division(n1, n2);
        division.calculateDivision();
    }

    // Main menu for the basic calculator
    public static void mainBasic() {
        System.out.print("\nSelect the type of calculation: ");
        System.out.print("\n");
        System.out.print("\n1) Addition");
        System.out.print("\n2) Subtraction");
        System.out.print("\n3) Multiplication");
        System.out.print("\n4) Division");
        System.out.print("\nSelect: ");
        int sel = in.nextInt();

        // Switch to execute the selected operation
        switch (sel) {
            case 1:
                calcAddition();
                break;
            case 2:
                calcSubtraction();
                break;
            case 3:
                calcMultiplication();
                break;
            case 4:
                calcDivision();
                break;
            default:
                // Error message for invalid input
                System.out.println("Invalid choice, please restart the program.");
                break;
        }
    }
}
