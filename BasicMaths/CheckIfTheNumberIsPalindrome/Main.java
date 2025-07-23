import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter a number to check if it is a palindrome:");
        int n = sc.nextInt();
        //initializing variable dup as n, it is the duplicate variable to store the original number
        int dup = n;
        //initializing variable rev as 0, it is used to store the reversed number
        int rev = 0;
        //then we will iterate through the number and reverse it and then store it in rev and then compare it with dup
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        //comparing the original number with the reversed number and if the same then it is a palindrome else not
        if(dup == rev){
            System.out.println("Yes");
        } else {
            System.out.println("No");   
        }
    }
}