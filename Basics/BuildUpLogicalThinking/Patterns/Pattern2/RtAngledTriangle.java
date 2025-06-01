public class RtAngledTriangle {
    //method to print a right angled triangle pattern of stars
    public static void printPattern2(int N) {
        //outer loop for rows
        for (int i = 0; i < N; i++) {
            //inner loop for columns
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // This moves to the next line after each row is printed.
        }
    }
    //Main method
    public static void main (String[] args){
        int N=9;
        //calling the printPattern2 method
        printPattern2(N); // Corrected method name
    }
}