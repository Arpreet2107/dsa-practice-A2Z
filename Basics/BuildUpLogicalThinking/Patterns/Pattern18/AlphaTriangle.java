public class AlphaTriangle {

    /**
     * Prints an Alpha Triangle pattern.
     * For N=5, the pattern would look like:
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     *
     * @param N The number of rows for the pattern.
     */
    public static void printAlphaTriangle(int N) {
        // Outer loop for the number of rows
        // 'i' represents the current row number (from 0 to N-1)
        for (int i = 0; i < N; i++) {
            // Inner loop for printing characters in the current row
            // 'j' represents the current character position within the row
            // The characters go from 'A' up to 'A' + current row index 'i'
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " "); // Print the character followed by a space
            }
            System.out.println(); // Move to the next line after completing a row
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        int N = 5; // You can change N to any desired number of rows
        System.out.println("Alpha Triangle Pattern for N = " + N + ":");
        printAlphaTriangle(N);

        System.out.println("\nAlpha Triangle Pattern for N = 3:");
        printAlphaTriangle(3);
    }
}