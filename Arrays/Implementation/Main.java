//implementing the Arrays
public class Main{
    public void PrintArray(int arr[]){
        int n = arr.length;//length of the array
        for(int i = 0;i<n;i++){//iterating through the array
            System.out.println(arr[i]);//printing the elements of the array
        }
    }
    public void arrayDemo(){
        int arr[] = new int[5];//declaring an array of size 5
        arr[0] = 10;//assigning values to the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        PrintArray(arr);//calling the PrintArray method to print the array
        System.out.println("Array Length: " + arr.length);//printing the length of the array
        System.out.println("Array Index 2: " + arr[2]);//printing the element at index 2
        System.out.println("Last element of the array: " + arr[arr.length - 1]);//printing the last element of the array
        int arr2[] = {1, 2, 3, 4, 5};//declaring and initializing an array
        PrintArray(arr2);//printing the second array
    }

    public static void main(String[] args){
        Main obj = new Main();//creating an object of the Main class
        obj.arrayDemo();//calling the arrayDemo method to demonstrate array operations
    }
}