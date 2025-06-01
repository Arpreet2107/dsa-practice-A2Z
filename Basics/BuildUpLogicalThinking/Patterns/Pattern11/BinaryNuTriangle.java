public class BinaryNuTriangle {
    static void printPattern11(int N){
        //first row stars by printing a single 1
        int start=1;
        //outerloop for the number of zero
        for(int i=0;i<N;i++){
            //if the row index is even then 1 is printed first in that row
            if(i%2==0) start =1;
            //if odd , themn the first 0 will be printed in that row
            else start=0;
            //we alternatively print 1's and 0's in each row by usign the inner for loop
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            //as soon as the number for each itertation are printed, we move to the next
            //row and give a line break otherwise all even numbers would get printed in line
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        printPattern11(N);
    }
}