//we are going to print numbers from N to 1 using recursion

public class Main{
    public static void func(int n){
        //base condition
        if(n < 1){
            return;
        }
        // print n and call function with n-1
        System.out.println(n);
        func(n - 1);
    }
    public static void main(String[] args){
        int n = 5; //this value can be changed to print from any number N to 1
        func(n);
    }
}