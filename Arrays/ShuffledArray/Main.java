//Given an array nums consisting of (2N) elements in the form [x1, x2, ..., xN, y1, y2, ..., yN].
//Return an array in the form [x1, y1, x2, y2, ..., xN, yN].
//Example 1:
//Input: nums = [2,5,1,3,4,7], N = 3
//Output: [2,3,5,4,1,7]
//Example 2:
//Input: nums = [1,2,3,4,4,3,2]
//,1], N = 4
//Output: [1,4,2,3,3,2,4,1]
public class Main{
    public int[] shuffledArray(int[] nums, int n){
        int[] result = new int[2*n];
        for(int i =0;i<n;i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[i];
            result[2*i+1] = nums[i+n];
        }
        return result;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] result1 = main.shuffledArray(nums1, n1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] result2 = main.shuffledArray(nums2, n2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}