//this approach uses a loop to calculate the sum of N Natural numbers
import java.util.Scanner;

public class Main{
    public static int Solve(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Solve(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}