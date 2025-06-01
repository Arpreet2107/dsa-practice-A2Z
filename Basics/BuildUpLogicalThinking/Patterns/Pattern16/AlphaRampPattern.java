public class AlphaRampPattern {
    static void printPattern(int N){
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) { // Corrected: Added 'i' after 'int'
            // Inner loop will print the character 'i' times in that row
            for (int j = 0; j <= i; j++) {
                // Cast 'A' to an integer, add 'i' to get the ASCII value of the desired character,
                // then cast back to char to print the letter.
                // For i=0, it's 'A'
                // For i=1, it's 'B'
                // For i=2, it's 'C', and so on.
                System.out.print((char)('A' + i) + " "); // Simplified casting for clarity
            }
            System.out.println(); // Move to the next line after completing a row
        }
    }

    public static void main(String[] args){
        int N = 5; // Set the number of rows for the pattern
        printPattern(N); // Call the method to print the pattern
    }
}