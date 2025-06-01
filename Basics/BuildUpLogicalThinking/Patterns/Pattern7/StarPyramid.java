public class StarPyramid {
    static void printPatter7(int N){
        //this is the outerloop which will loop for the rows
        for(int i=0;i<N;i++){
            //for printing the spaces before the stars in each row
            for(int j=0;j<N-i-1;j++){// formula to print the spaces just befire the stars in each row(N-i-1)
                System.out.print(" ");
            }
            //for printing the  stars in each row
            for(int j=0;j<2*i+1;j++){
                //the formula for prinnting the stars after the spaces (2*i+1)
                System.out.print("*");
            }
            //for printing the spaces after the stars in each row
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            //As soon as the stars for each iterations are printed, we move to
            //the next row and give a line break otherwise all stars would get printed in 1 line
            System.out.println();
        }
    }
    public static void main(String[] args){
          int N=7;
          printPatter7(N);
         }
}
