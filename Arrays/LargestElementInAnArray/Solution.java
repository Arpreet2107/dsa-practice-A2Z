import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Take array input from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and display the largest element
        int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);

        sc.close(); // Always close the scanner
    }

    // Function to find the largest element in the array
    public static int findLargest(int[] arr) {
        int max = arr[0]; // Initialize with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current is greater
            }
        }
        return max;
    }
}
