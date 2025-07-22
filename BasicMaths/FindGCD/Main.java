public class Main {
    public static int findGCD(int n1, int n2){
        for(int i = Math.min(n1,n2);i>0;i--){
            if(n1 % i == 0 && n2 % i == 0){
                return i;
            }
        }
        return 1; //if no common divisor found return 1
    }
    public static void main(String [] args){
        int n1 = 342;
        int n2 = 234;
        int gcd = findGCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}