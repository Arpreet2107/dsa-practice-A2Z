//we can use map of value and frequency pair, in which we can easily update that frequency of an element if it is  already present in the map,
//and if it is not present in the map then we can insert it as 1 and then we can return it. After implementing all the iterations,we can print the value frequency pair.

import java.util.*;

public class Main{
    public static void Freq(int[] arr, int n){
        Map<Integer,Integer> mp = new HashMap<>();
        //now we wil use the for loop to  iterate through the array
        for(int i=0; i<n;i++){
            //if the element is already present in the map then we will increase its frequency by 1
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],// what we will do is we will get the value of the key and then we will increase it by 1
                mp.get(arr[i]+1));//if it is not present then we will insert it with frequency 1
            }else{
                mp.put(arr[i],1);//putting the element in the map with frequency 1, because it is the first time we are seeing this element
            }
        }
        //travsersing the map to print the value frequency pair
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.err.println("Element: "+ entry.getKey() + " Frequency: " + entry.getValue());//getKey() will return the key of the entry and getValue() will return the value of the entry
        }
    }
    //main method to test the function
        public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        Freq(arr, n);
    }
}