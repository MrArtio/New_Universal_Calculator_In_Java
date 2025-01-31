package Basic_Calculator;

public class Division {
    // Variables to store the numbers
    int N1;
    int N2;

    // Constructor to initialize the numbers
    public Division(int n1, int n2) {
        N1 = n1;
        N2 = n2;
    }

    // Method to perform the division
    public void calculateDivision() {
        // Check to prevent division by zero
        if (N2 == 0) {
            System.out.print("\nError: Division by zero is not allowed.");
            return;
        }

        // Perform the division
        int result = this.N1 / this.N2;
        System.out.print("\nThe result of the division is: " + result);
    }
}
