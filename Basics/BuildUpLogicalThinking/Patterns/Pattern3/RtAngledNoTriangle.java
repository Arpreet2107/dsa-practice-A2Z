public class RtAngledNoTriangle {
    // Method to print a right-angled triangle pattern of numbers
    // N represents the number of rows
    static void printPattern3(int N){
        // Outer loop for rows
        // We start i from 1 to ensure the first row prints '1' and subsequent rows follow the pattern
        for(int i = 1; i <= N; i++){
            // Inner loop for the columns that will print the numbers in rows
            // j goes from 1 up to the current row number 'i'
            for(int j = 1; j <= i; j++){
                System.out.print(j + " "); // Prints the number 'j' followed by a space
            }
            System.out.println(); // Moves to the next line after printing all numbers for the current row
        }
    }
    // Main method
    public static void main(String[] args){
        int N = 6;
        printPattern3(N); // Calls the pattern method
    }
}