public class HollowRect {

    public static void printHollowRectangle(int rows, int cols) {
        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for the number of columns in each row
            for (int j = 1; j <= cols; j++) {
                // Condition to print a star or a space
                // Print a star if it's the first row, last row, first column, or last column
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    // Otherwise, print a space
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after completing a row
        }
    }

    public static void main(String[] args) {
        int numRows = 5; // Define the number of rows
        int numCols = 6; // Define the number of columns

        System.out.println("Hollow Rectangle Pattern (" + numRows + " rows, " + numCols + " cols):");
        printHollowRectangle(numRows, numCols);

        System.out.println("\nAnother example (3 rows, 10 cols):");
        printHollowRectangle(3, 10);
    }
}