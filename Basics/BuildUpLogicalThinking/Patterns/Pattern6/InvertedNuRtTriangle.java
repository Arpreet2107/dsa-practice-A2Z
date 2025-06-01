public class InvertedNuRtTriangle {
    static void printPattern6(int N){
        //this is the outerloop which will loop for the rows.
        for(int i=0;i<N;i++) {
            //this is the inner loop which loops for the columns
            //number of columns =(n-row-index) for each line here
            //as we to print an inverted Pyramid.
            //(N-j) will give us the numbers in a row starting from 1 to N-i
            for (int j = N; j > i; j--) {
                System.out.print(N - j + 1 + " ");
            }
            //as soon as numbers for each iteration are printed, we move to the next row
            //and give a line break otherwise all numbers would get printed in 1 line.
            System.out.println();
        }
    }
    public static void main(String [] args){
        int N=6;
        printPattern6(N);
    }

}