//here we will use a hashmap to store the elements and their indices
// this will allow us to find the complement in O(1) time
// the overall time complexity will be O(n) and space complexity will also be O(n)
import java.util.HashMap;
import java.util.Map;
public class Main{// Optimised Approach
    Map<Integer, Integer> mp = new HashMap<>();// to store the elements and their indices
    public int[] twoSum(int[] nums, int target) {// this function will return the indices of the two numbers that add up to the target
        for (int i = 0; i < nums.length; i++) {// iterate through the array
            // calculate the complement of the current number
            // the complement is the number that we need to find in the map
            int complement = target - nums[i];// this is the number we need to find in the map
            // check if the complement is already in the map
            if (mp.containsKey(complement)) {// if it is, we have found the two numbers
                return new int[]{mp.get(complement), i};// return the indices of the two numbers that add up to the target
            }
            mp.put(nums[i], i);// if the complement is not found, we add the current number and its index to the map
            // this allows us to find it in the next iterations
        }
        return new int[0]; // return an empty array if no solution is found
    }
}