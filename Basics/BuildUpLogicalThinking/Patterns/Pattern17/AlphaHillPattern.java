public class AlphaHillPattern {

    static void printPattern17(int N) {
        // Outer loop for the number of rows (from 0 to N-1)
        for (int i = 0; i < N; i++) {
            // 1. Loop for printing leading spaces
            // The number of spaces decreases as 'i' (row number) increases
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // 2. Loop for printing characters in the ascending part of the hill
            char ch = 'A'; // Start with 'A' for each row's character sequence
            // The breakpoint is the middle character of the row
            // Example: for 5 chars (ABCBA), breakpoint is at C (index 2, j=3)
            int breakPoint = (2 * i + 1) / 2; // Correct calculation for the middle character's index

            // Loop to print characters for the entire row (ascending then descending)
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch); // Print the current character

                // If we are before or at the breakpoint, increment the character
                if (j <= breakPoint) { // Corrected: removed space from 'breakPoint'
                    ch++;
                }
                // If we are past the breakpoint, decrement the character
                else {
                    ch--;
                }
            }

            // 3. (Optional) Loop for printing trailing spaces (for perfect symmetry)
            // This mirrors the leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line after printing all elements for the current row
            System.out.println(); // Added missing System.out.println()
        }
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        int N = 5; // Example: Set N to 5
        printPattern17(N); // Call the pattern printing method
    }
}