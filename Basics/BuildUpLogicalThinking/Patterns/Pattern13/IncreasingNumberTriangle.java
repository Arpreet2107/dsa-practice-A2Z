public class IncreasingNumberTriangle {
    static void printPattern13(int N){
        // The starting number for the sequence
        int num = 1;

        // Outer loop for the number of rows
        for (int i = 1; i <= N; i++) { // Corrected: 'i-1' changed to 'i=1'
            // Inner loop will loop 'i' times (for the current row)
            // and print numbers, incrementing 'num' each time
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print the current number
                num = num + 1;             // Increment for the next number in the sequence
            }
            // After printing all numbers for the current row, move to the next line
            System.out.println();
        }
    }

    public static void main(String [] args){
        int N = 5; // Set the number of rows for the triangle
        printPattern13(N); // Call the method to print the pattern
    }
}