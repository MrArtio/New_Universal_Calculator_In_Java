package Basic_Calculator;

public class Multiplication {
    // Variables to store the numbers
    int N1;
    int N2;

    // Constructor to initialize the numbers
    public Multiplication(int n1, int n2) {
        N1 = n1;
        N2 = n2;
    }

    // Method to perform the multiplication
    public void calculateMultiplication() {
        int result = this.N1 * this.N2;
        System.out.print("\nThe result of the multiplication is: " + result);
    }
}
