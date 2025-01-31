// Importing classes from their respective packages
import Basic_Calculator.*;
import ScientificCalculator.ScientificCalculator;

import java.util.Scanner;

public class Calculator {
    // Declaring a Scanner to read user input
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Selection menu to choose the type of calculator
        System.out.print("\nSelect the type of calculator: ");
        System.out.print("\n1) Basic Calculator");
        System.out.print("\n2) Scientific Calculator");
        System.out.print("\nSelect: ");

        // Reading user choice
        int sel = in.nextInt();

        // Switch to execute the selected calculator
        switch (sel) {
            case 1:
                // Launch the basic calculator
                BasicCalculator.mainBasic();
                break;
            case 2:
                // Launch the scientific calculator
                ScientificCalculator.mainScientific();
                break;
            default:
                // Error message in case of an invalid selection
                System.out.println("Invalid choice, please restart the program.");
                break;
        }
    }
}
