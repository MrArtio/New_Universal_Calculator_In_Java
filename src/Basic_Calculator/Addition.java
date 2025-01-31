package Basic_Calculator;

public class Addition {
    // Variables to store the numbers
    int N1;
    int N2;

    // Constructor to initialize the numbers
    public Addition(int n1, int n2) {
        this.N1 = n1;
        this.N2 = n2;
    }

    // Method to perform the addition
    public void calculateAddition() {
        int result = this.N1 + this.N2;
        System.out.print("\nThe result of the addition is: " + result);
    }
}
