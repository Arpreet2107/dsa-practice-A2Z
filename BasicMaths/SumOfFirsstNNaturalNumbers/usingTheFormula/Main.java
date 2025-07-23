//this approach uses the formula to calculate the sum of the first N natural numbers
import java.util.Scanner;

public class Main{
    public static void Solve(int n){
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            Solve(n);
        }
    }
}
