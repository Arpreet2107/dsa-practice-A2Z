import java.util.Scanner;


public class Main{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //taking input from the user
        int n = sc.nextInt();
        //initializing the revNum as 0, it will store the reversed number
        int revNum = 0;
        //then we will start the while loop and it will iterate till the value of n is greater than 0
        while(n>0){
            //and then here we will initialize the digit variable which will store the last digit of the number
            int digit = n% 10;
            //and then we will reverse the number by multiplying the revNum by 10 and adding the digit to it
            revNum = (revNum * 10) + digit;
            //and then we will divide the number by 10 to remove the last digit
            n = n/10;
        }
        System.out.println(revNum);
        sc.close();
    }
}