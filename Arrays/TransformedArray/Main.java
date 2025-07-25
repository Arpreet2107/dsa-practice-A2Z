//what is transformed array?
// Transformed array is an array where each element is replaced by the sum of all elements to its right in the original array.

public class Main{
    // This method constructs a transformed array where each element is replaced by the sum of all elements to its right in the original array.
    // For example, given the input array [1, 2, 3, 4], the transformed array will be [9, 7, 4, 0].
    // Time Complexity: O(n^2) where n is the length of the input array
    public int[] constructTransformedArray(int[] nums){
        int n = nums.length;// get the length of the input array
        if(n == 0) return new int[0]; // if the array is empty
        if(n == 1) return new int[]{0}; // if the array has one element, the transformed value is 0
        // Initialize the result array
        int[] result = new int[n];
        for(int i = 0; i < n; i++){// for each element in the input array
            // Calculate the sum of all elements to the right of the current element
            int sum = 0;// initialize sum to 0
            for(int j = i + 1; j < n; j++){// iterate through the elements to the right
                sum += nums[j];// add the value of the right element to sum
            }
            result[i] = sum;// assign the sum to the current index in the result array
        }
        return result;// return the transformed array
    }
}