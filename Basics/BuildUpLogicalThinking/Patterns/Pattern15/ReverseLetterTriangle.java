public class ReverseLetterTriangle {
    static void printPattern15(int N){
        //outer loop for the number of roes
        for(int i=0;i<N;i++){
            //inner loop will loop for i times and print alphabets from A
            //to A+(N-i-1)
            for(char ch='A';ch<='A'+(N-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        printPattern15(N);
    }
}