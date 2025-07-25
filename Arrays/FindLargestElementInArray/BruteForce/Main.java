//Given an array we have to find the longest element in the array.

import java.util.*;

public class Main{
    public static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr1[] = {21,321,12,21,12};
        System.out.println("The largest element in the array is: " + sort(arr1));
    }
}