//this is the optimised approach to find the largest element in the array
public class Main{
    static int findLargestElement(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr1[] = {2,21,32,21,3,32312,1};
        System.out.println("The largest element in the array is: " + findLargestElement(arr1));
    }
}