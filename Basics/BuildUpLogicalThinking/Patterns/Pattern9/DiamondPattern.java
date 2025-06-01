public class DiamondPattern {

    // Method to print the upper half of the diamond (upright pyramid)
    static void printUpperPyramid(int N) {
        // Outer loop for rows in the upper half
        for (int i = 0; i < N; i++) {
            // 1. For printing leading spaces
            // Spaces decrease as 'i' increases
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // 2. For printing stars
            // Stars increase by 2 in each row (1, 3, 5, ...)
            for (int j = 0; j < 2 * i + 1; j++) { // Corrected inner loop syntax
                System.out.print("*");
            }

            // 3. (Optional) For printing trailing spaces - not strictly necessary for visual but good for symmetry
            // for(int j = 0; j < N - i - 1; j++){
            //     System.out.print(" ");
            // }

            // Move to the next line after printing stars for the current row
            System.out.println();
        }
    }

    // Method to print the lower half of the diamond (inverted pyramid)
    // Note: The loop for 'i' starts from N-2 to avoid duplicating the middle row if N is odd
    static void printLowerPyramid(int N) {
        // Outer loop for rows in the lower half
        // Start from N-2 to avoid repeating the widest row if N is odd, and go down to 0
        for (int i = N - 2; i >= 0; i--) {
            // 1. For printing leading spaces
            // Spaces increase as 'i' decreases (equivalent to 'N-1-i' for an increasing counter)
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // 2. For printing stars
            // Stars decrease (e.g., 7, 5, 3, 1 for N=5)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // 3. (Optional) For printing trailing spaces
            // for(int j = 0; j < N - i - 1; j++){
            //     System.out.print(" ");
            // }

            // Move to the next line
            System.out.println();
        }
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        int N = 5; // Define the size of the diamond (N rows for each half)

        // Call methods to print the upper and lower halves of the diamond
        printUpperPyramid(N);
        printLowerPyramid(N);
    }
}