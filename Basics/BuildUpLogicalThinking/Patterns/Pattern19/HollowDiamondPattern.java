public class HollowDiamondPattern {

    public static void printHollowDiamond(int N) {
        // Upper half of the hollow diamond
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print inner spaces
            // The number of inner spaces increases: 0, 1, 3, 5, ...
            if (i > 1) { // No inner spaces for the first row
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                // Print second star (only if it's not the first row)
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the hollow diamond
        // Start from N-1 to avoid duplicating the middle row
        for (int i = N - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print inner spaces
            if (i > 1) { // No inner spaces for the last row of this half
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                // Print second star
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        int N = 5; // N determines the height/width of the diamond's half
        System.out.println("Hollow Diamond Pattern (N=" + N + "):");
        printHollowDiamond(N);
    }
}