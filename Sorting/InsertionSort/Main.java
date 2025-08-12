public class Main {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted
            int j = i - 1;    // Index of last element in the sorted portion

            // Shift elements of the sorted portion to the right
            // until the correct position for 'key' is found
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place 'key' in its correct position
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test insertion sort
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(data);

        insertionSort(data);

        System.out.println("Sorted array in ascending order:");
        printArray(data);
    }
}
