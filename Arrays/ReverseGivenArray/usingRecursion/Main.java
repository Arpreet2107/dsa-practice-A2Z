//in this program we will reverse an array using recursion

public class Main{
    public static void printArray(int[] arr, int n ){
        System.out.println("Reversed Array is: \n");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    //function to reverse the array using recursion
    public static void reverseArray(int[] arr, int start, int end){
        if(start >= end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start+1, end-1);
        }
    }
    //main fuction
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Original Array is: \n");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
    }
}