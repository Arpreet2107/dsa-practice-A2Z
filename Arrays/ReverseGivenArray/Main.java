//here we are going to reverse the given array
import java.util.*;

public class Main{
    //function to print the array
    public static void printArray(int ans[], int n){
        System.out.println("Reversed Array is: \n");
        for(int i = 0; i<n; i++){
            System.out.println(ans[i] + " ");
        }
    }
    //function to reverse the array using an new array
    public static void reverseArray(int arr[], int n){
        int ans[] = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = arr[n-i-1];
        }
        printArray(ans, n);
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            reverseArray(arr, n);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}