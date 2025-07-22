
public class Main{
    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            n= n/10;
            count++;//cnt = cnt + 1;
        }
        return count;
    }
    public static void main(String args[]){
        int N = 12398;
        System.out.println("Number of digits in " + N + " is: " + countDigits(N));
    }
}