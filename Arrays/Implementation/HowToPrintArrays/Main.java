//here we are printing arrays
public class Main{
    public void printArray(int arr[]){
        //this function prints the array
        int n = arr.length;//get the length of the array
        for(int i=0;i<n;i++){//loop through the array
            //print each element of the array
            System.out.print("The array is: " + arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Main obj = new Main();//create an object of the class
        int arr[] = {1,2,3,324,23,42,3,234,3};//create an array of integers
        obj.printArray(arr);//call the function to print the array
        //output: The array is: 1 2 3 324 23 42 3 234 3
    }
}