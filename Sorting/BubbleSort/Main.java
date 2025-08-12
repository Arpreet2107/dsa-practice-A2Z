public class Main {

    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for pairwise comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test bubble sort
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(data);

        bubbleSort(data);

        System.out.println("Sorted array in ascending order:");
        printArray(data);
    }
}
