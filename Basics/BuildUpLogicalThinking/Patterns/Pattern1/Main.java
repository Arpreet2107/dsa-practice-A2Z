//to print the rectangular * pattern
public class Main{
    //method to print the pattern
    static void pattern1(int N){
        for(int i=0;i<N;i++){//this outer loop is for no. of rows
            for(int j=0;j<N;j++){//this inner loop is for printing the * at each row, since we have to print N times therefore no specific conditions are applied.
                System.out.print("*");
            }
        //move to the next line so that it will print the next row
        System.out.println();
        }
    }

    //main method
    public static void main(String[] args) {
        int N = 5;
        pattern1(N);//calling the pattern
    }
}