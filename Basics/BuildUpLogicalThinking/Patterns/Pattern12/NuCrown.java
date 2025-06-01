public class NuCrown {

    static void printPattern12(int N) {
        // Outer loop for the number of rows (from 1 to N)
        for (int i = 1; i <= N; i++) { // Corrected: Loop from 1 to N (inclusive)

            // 1. Print numbers on the left side (1 2 3 ... i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 2. Print spaces in the middle
            // The number of spaces decreases with each row
            // Initial spaces in row 1 (i=1) should be 2*(N-1)
            // For row i, spaces = 2*(N-i)
            int spaces = 2 * (N - i); // Calculate spaces for current row 'i'
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Print numbers on the right side (i ... 2 1)
            // If i=1, it prints '1'. If i=2, it prints '21'.
            // The logic needs to be careful: if the last number on the left was 'k',
            // the first number on the right should usually be 'k' or 'k-1' depending on symmetry.
            // For a common number crown, it should go from 'i' down to '1'.
            // However, to avoid duplicating '1' in the middle for rows beyond 1, we start from 'i' if i>1,
            // or 'i' (which is '1') if i=1. The loop usually goes from 'i' down to '1'.
            // A typical crown might print 'i' down to '1' (or 'i-1' down to '1' to avoid center '1' duplication).
            // Let's go from 'i' down to 1.
            for (int j = i; j >= 1; j--) { // Corrected: Loop from 'i' down to 1
                System.out.print(j);
            }

            // Move to the next line after completing a row
            System.out.println();
        }
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        int N = 5; // Example: Set N to 5
        printPattern12(N); // Call the pattern printing method
    }
}