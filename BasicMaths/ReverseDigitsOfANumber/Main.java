import java.util.Scanner;


public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revNum = 0;
        while(n> 0){
            int digit = n % 10;
            revNum= (revNum*10) + digit;
            n =n/10;
        }
        System.out.println(revNum);
        sc.close();
    }
}