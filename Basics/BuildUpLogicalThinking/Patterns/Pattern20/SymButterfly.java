public class SymButterfly{

    public static void printButterfly(int N) {
        // Upper half of the butterfly
        // Loops for rows from 1 to N
        for (int i = 1; i <= N; i++) {
            // 1. Stars for the left wing (increasing)
            // Prints 'i' number of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2. Spaces in the middle
            // Number of spaces decreases with each row: 2*(N-i)
            // For N=5:
            // i=1: 2*(5-1) = 8 spaces
            // i=2: 2*(5-2) = 6 spaces
            // ...
            // i=5: 2*(5-5) = 0 spaces
            int spaces = 2 * (N - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Stars for the right wing (increasing)
            // Prints 'i' number of stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line for the next row
        }

        // Lower half of the butterfly
        // Loops for rows from N-1 down to 1 (to avoid duplicating the middle row if N is odd)
        for (int i = N - 1; i >= 1; i--) {
            // 1. Stars for the left wing (decreasing)
            // Prints 'i' number of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2. Spaces in the middle
            // Number of spaces increases as 'i' decreases: 2*(N-i)
            // This is the same formula as the upper half, which naturally works in reverse
            int spaces = 2 * (N - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Stars for the right wing (decreasing)
            // Prints 'i' number of stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line for the next row
        }
    }

    public static void main(String[] args) {
        int N = 5; // Define the size parameter for the butterfly
        System.out.println("Symmetric Butterfly Pattern (N=" + N + "):");
        printButterfly(N);
    }
}