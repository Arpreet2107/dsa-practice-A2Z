import java.util.ArrayList;

public class Main{
    public static ArrayList<Integer> isPrime(int n){
        ArrayList<Integer> res = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for(int i = 1; i <= sqrtN; i++){
            if(n % i == 0){
                res.add(i);
                if(i != n / i){
                    res.add(n / i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 28;
        ArrayList<Integer> divisors = isPrime(n);
        System.out.println("Divisors of " + n + ": " + divisors);
    }
}