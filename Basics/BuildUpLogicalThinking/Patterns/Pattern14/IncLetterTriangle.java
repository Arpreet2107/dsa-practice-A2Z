public class IncLetterTriangle {
    static void printPattern14(int N){
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            // Inner loop will loop 'i' times and print alphabets from 'A' up to 'A' + current row index 'i'
            // We use 'char' type and single quotes for character literals.
            // When 'A' is used in arithmetic operations with an integer, it's treated as its ASCII value.
            for (char ch = 'A'; ch <= 'A' + i; ch++) { // Corrected: "A" changed to 'A'
                System.out.print(ch + " "); // Print the character followed by a space
            }
            System.out.println(); // Move to the next line after printing characters for the current row
        }
    }

    public static void main(String[] args){
        int N = 5; // Set the number of rows for the triangle
        printPattern14(N); // Call the method to print the pattern
    }
}