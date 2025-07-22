import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        if(dup == rev){
            System.out.println("Yes");
        } else {
            System.out.println("No");   
        }
    }
}