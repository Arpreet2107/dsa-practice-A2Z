public class InvertedStarPyramid {
    static void printPattern8(int N){
        // This is the outer loop which will loop for the rows
        // The loop runs from i = 0 to N-1 (N rows in total)
        for(int i = 0; i < N; i++){
            // 1. Loop for printing the spaces before the stars in each row
            // The number of spaces increases with each row (i.e., 'i' spaces for row 'i')
            for(int j = 0; j < i; j++){
                System.out.print(" "); // Print a space, not a star
            }

            // 2. Loop for printing the stars in each row
            // The number of stars decreases with each row
            // The formula 2*N - (2*i + 1) calculates the correct number of stars for an inverted pyramid.
            // Example:
            // For i=0 (first row): 2*N - 1 stars
            // For i=1 (second row): 2*N - 3 stars
            // For i=2 (third row): 2*N - 5 stars
            for(int j = 0; j < 2 * N - (2 * i + 1); j++){
                System.out.print("*"); // Print a star
            }

            // 3. Move to the next line after printing all spaces and stars for the current row
            System.out.println();
        }
    }

    // Main method to run the program and call the pattern method
    public static void main(String[] args){
        int N = 5; // Example: Set N to 5 for a 5-row pyramid
        printPattern8(N); // Call the pattern printing method
    }
}