//we will remove all even integers from the array and return a new array with odd integers only
public class Main{
    //function to print the array
    public void printArray(int[] arr){
        int n = arr.length;//length of the array
        for(int i = 0; i<n;i++){//iterating through the array
            System.out.print(arr[i] + " ");//printing the elements of the array
        }
        System.out.println(" ");//printing a new line after printing the array
    }
//function to remove even integers from the array
    //and return a new array with odd integers only
    public static int[] removeEvenInt(int[] arr){
        int n = arr.length;//length of the array
        int oddCount = 0;//count of odd integers in the array
        //counting the number of odd integers in the array
        for(int i=0;i<n;i++){//iterating through the array
            if(arr[i] % 2 !=0){//checking if the integer is odd
                oddCount++;//if it is odd, incrementing the count
            }
        }
        //creating a new array of size oddCount to store the odd integers
        int[] result = new int[oddCount];//initializing the new array
        int idx=0;//index for the new array
        for(int i=0;i<arr.length;i++){//iterating through the original array
            if(arr[i] % 2 != 0){//checking if the integer is odd
                result[idx] = arr[i];//if it is odd, adding it to the new array
                idx++;//incrementing the index for the new array
            }
        }
        //returning the new array with odd integers only
        return result;
    }
    //main function to test the removeEvenInt function
    public static void main(String[] args){
        Main obj = new Main();//creating an object of the Main class to call the printArray function
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,2,332,424,23,324,4,12,123};//initializing the array with some integers
        System.out.println("Original Array: ");//printing the original array
        obj.printArray(arr);//calling the printArray function to print the original array
        int[] result = removeEvenInt(arr);//calling the removeEvenInt function to get the new array with odd integers only
        System.out.println("Array after removing even integers: ");//printing the new array
        obj.printArray(result);//calling the printArray function to print the new array
    }
}