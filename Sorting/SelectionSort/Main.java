
public class Main {
    
    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop moves the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum element is at index 'i'
            int minIndex = i;

            // Inner loop to find the index of the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the selection sort
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(data);

        selectionSort(data);

        System.out.println("Sorted array in ascending order:");
        printArray(data);
    }
}
