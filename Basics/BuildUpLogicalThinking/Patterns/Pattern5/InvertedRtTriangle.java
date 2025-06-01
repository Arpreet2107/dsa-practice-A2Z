public class InvertedRtTriangle {
    static void printPattern5(int N){
        //this is the outerloop which will loop for the rows
        for(int i=0;i<N;i++){
            //this is the inner loop which loops for the columns
            //number of columns = (n-row index) for each line here.
            for(int j=N;j>i;j--){
                System.out.print("*");
            }
            //as soon as stars for each iteration are printed, we move to the
            //next row and give a line break otherwise all stars would get printed in
            //1 line
            System.out.println();
        }
    }
    public static void main(String[] args){
        //here we have taken the value of N =5
        int N=6;
        printPattern5(N);
    }
}