import java.util.Scanner;
public class IO{
    public static void printNumber(int number) {
        System.out.println(number);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();
        printNumber(num);
    }
}