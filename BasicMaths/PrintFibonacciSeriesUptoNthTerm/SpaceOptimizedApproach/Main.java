public class Main{
    public static void main(String[] args) {
        int n = 10;
        if (n == 0) {
            System.out.println("The Fibonacci series upto " + n + "th term is: ");
            System.out.print("0");
        } else {
            int a = 0, b = 1;
            System.out.print("The Fibonacci series upto " + n + "th term is: ");
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}