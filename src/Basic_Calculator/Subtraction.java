package Basic_Calculator;

public class Subtraction {
    // Variables to store the numbers
    int N1;
    int N2;

    // Constructor to initialize the numbers
    public Subtraction(int n1, int n2) {
        this.N1 = n1;
        this.N2 = n2;
    }

    // Method to perform the subtraction
    public void calculateSubtraction() {
        int result = this.N1 - this.N2;
        System.out.print("\nThe result of the subtraction is: " + result);
    }
}
