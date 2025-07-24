//here we will print the reverse of an array
public class Main{
    // Function to print the elements of an array
    public void printArray(int[] arr){
        // Loop through the array and print each element
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");// Print each element followed by a space
        }
    }
    // Function to reverse the elements of an array
    public void reverseArray(int[] numbers, int start, int end){
        while(start < end){// Continue until the start index is less than the end index
            int temp = numbers[start];// Store the value at the start index in a temporary variable
            numbers[start]= numbers[end];// Assign the value at the end index to the start index
            numbers[end] = temp;// Assign the value stored in the temporary variable to the end index
            start++;// Increment the start index
            end--;// Decrement the end index
        }
    }
    // Main method to test the reverseArray function
    // and print the original and reversed arrays
    public static void main(String[] args) {
        Main obj = new Main();// Create an instance of the Main class, we create an object of the Main class to access its methods.
        int[] numbers = {1, 2, 3, 4, 5};// Initialize an array with some values
        System.out.println("Original Array:");// Print the original array
        obj.printArray(numbers);// Call the printArray method to display the original array        
        obj.reverseArray(numbers, 0, numbers.length - 1);// Call the reverseArray method to reverse the array
        System.out.println("\nReversed Array:");// Print the reversed array
        obj.printArray(numbers);// Call the printArray method to display the reversed array
        System.out.println();//printing a new line for better readability
    }
}