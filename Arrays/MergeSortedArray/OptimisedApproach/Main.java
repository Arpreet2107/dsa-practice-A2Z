//here we  are merging two sorted arrays into one sorted array
//Time Complexity: O(n + m) where n and m are the lengths of the two arrays
//Space Complexity: O(n + m) for the merged array
//this is the optimised approach
public class Main{
    // Function to merge two sorted arrays
    // nums1 is the first array with m elements followed by n zeros
    // nums1 has m elements followed by n zeros && nums2 has n elements
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;// pointer for the last element of nums1's original elements
        int p2 = n-1;// pointer for the last element of nums2
        // p is the pointer for the last position in nums1 where we will place the merged elements
        int p = m + n - 1;// pointer for the last position in nums1 where we will place the merged elements
        while(p1>=0 && p2>=0){// compare elements from the end of both arrays
            // place the larger element at the end of nums1
            if(nums1[p1] > nums2[p2]){// if the current element in nums1 is greater
                nums1[p] = nums1[p1];// place it at the end of nums1
                p1--;// move the pointer in nums1
            }else{// if the current element in nums2 is greater or equal
                // place the current element in nums2 at the end of nums1
                nums1[p] = nums2[p2];// place it at the end of nums1
                p2--;// move the pointer in nums2
            }
            p--;// move the pointer in nums1 where we will place the next element
        }
        while(p2 >= 0){// if there are remaining elements in nums2
            // copy the remaining elements from nums2 to nums1
            nums1[p] = nums2[p2];// place it at the end of nums1
            p--;// move the pointer in nums1
            p2--;// move the pointer in nums2
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};// nums1 has m elements followed by n zeros
         // m is the number of original elements in nums1
         // n is the number of elements in nums2
        int m = 3;// number of original elements in nums1
         // nums2 is the second array with n elements
        int[] nums2 = {2, 5, 6};// nums2 has n elements
         // n is the number of elements in nums2
        int n = 3;// number of elements in nums2

        merge(nums1, m, nums2, n);// Call the merge function to merge nums2 into nums1

        // Print the merged array
        for (int num : nums1) {// iterate through the merged array
            System.out.print(num + " ");// print each element
        }
    }
}