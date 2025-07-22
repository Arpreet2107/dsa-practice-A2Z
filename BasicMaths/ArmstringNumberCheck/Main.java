public class Main{
    public static boolean isArmstrong(int n){
        int originalNum = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }
        return sum == originalNum;
    }
    public static void main(String[] args){
        int num = 153;
        if(isArmstrong(num)){
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
