//here we will use brute force approach to merge 2 sorted arrrays
// Time Complexity: O((m+n)log(m+n)), where m is the length of num1 and n is the length of num2
// Space Complexity: O(1), since we are modifying num1 in place
import java.util.Arrays;
//here we will merge two sorted arrays num1 and num2 into num1
//num1 has a size of m+n, where the first m elements are the actual elements
public class Main{
    public void merge(int[] num1, int m,int[] num2, int n){// we will merge num2 into num1
        //first we will copy the elements of num2 into num1
        for(int i=0;i<n;i++){
            num1[m+i] = num2[i];
        }
        Arrays.sort(num1);// sort the merged array
        //now num1 contains the merged sorted array
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] num2 = {2, 5, 6};
        int n = 3;
        
        main.merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));
    }
}