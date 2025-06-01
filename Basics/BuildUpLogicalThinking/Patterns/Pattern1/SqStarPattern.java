public class SqStarPattern {

    // Method to print a square star pattern
    // N is the number of rows/columns for the square
    public static void printSqStarPattern(int N) { // Added 'static' and 'int N' parameter
        // Outer Loop for rows
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println(); // Corrected placement
        }
    }

    // Main method
    public static void main(String[] args) {
        int N = 5;
        // Calling the pattern method to print the pattern
        printSqStarPattern(N); // Called the static method with 'N' as argument
    }
}