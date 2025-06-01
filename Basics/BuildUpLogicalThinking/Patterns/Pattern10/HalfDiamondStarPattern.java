public class HalfDiamondStarPattern {

    static void printPattern10(int N) {
        // Outer loop for the number of rows.
        // A half diamond pattern with 'N' as the maximum width will have (2*N - 1) rows in total.
        for (int i = 1; i <= 2 * N - 1; i++) {
            // Determine the number of stars for the current row.
            int stars;

            // For the first half of the pattern (rows from 1 to N),
            // the number of stars is equal to the current row number 'i'.
            if (i <= N) {
                stars = i;
            }
            // For the second half of the pattern (rows from N+1 to 2*N-1),
            // the number of stars starts decreasing.
            // The formula '2 * N - i' correctly calculates this decrease.
            // Example: If N=5, for i=6, stars = 2*5 - 6 = 4.
            // For i=7, stars = 2*5 - 7 = 3, and so on.
            else {
                stars = 2 * N - i;
            }

            // Loop for printing the stars in the current row.
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // After printing all stars for the current row, move to the next line.
            // This ensures that each row of the pattern is printed on a new line.
            System.out.println();
        }
    }

    // Main method - the entry point of the program.
    public static void main(String[] args) {
        int N = 5; // Define the maximum width/height of the half diamond.
        printPattern10(N); // Call the method to print the pattern.
    }
}