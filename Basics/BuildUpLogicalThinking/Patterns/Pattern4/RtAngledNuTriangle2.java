public class RtAngledNuTriangle2 {
    // Method to print a right-angled triangle pattern where each number is the row number
    // N represents the number of rows
    static void printPattern4(int N){
        // Outer loop which will loop for the rows
        // Loop from i = 1 up to N (inclusive) to print N rows
        for(int i = 1; i <= N; i++){
            // This is the inner loop which loops for the column.
            // Number of columns = row number for each line here.
            // Here, we print numbers equal to the row number 'i'.
            for(int j = 1; j <= i; j++){
                System.out.print(i + " "); // Prints the current row number 'i' followed by a space
            }
            // As soon as numbers for each iteration are printed, we move to the
            // next row and give a line break, otherwise
            // all numbers would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String [] args){
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;
        printPattern4(N);
    }
}