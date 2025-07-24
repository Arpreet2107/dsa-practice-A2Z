//we will solve this problem using brute force approach
//Time Complexity: O(n^2)
//Space Complexity: O(1)
public class Main{
    // This method finds two indices in the array such that their values sum up to the target.
    // It returns an array containing the two indices if found, otherwise returns null.
    public int[] twoSum(int[] nums,int target){// Check if the input array is null or has less than two elements
        if(nums == null || nums.length < 2){
            return null;
        }
        for(int i=0;i<nums.length;i++){// Iterate through each element in the array
            for(int j = i+1;j<nums.length;j++){// Check the sum of the current element and the next elements
                // If the sum equals the target, return the indices as an array
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};// Return the indices of the two numbers that add up to the target
                }
            }
        }
        // If no such indices are found, return null
        return null;
    }
}