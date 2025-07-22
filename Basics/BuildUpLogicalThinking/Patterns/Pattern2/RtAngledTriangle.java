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
        printPattern2(N);
    }
}
//for (int i = 0; i < N; i++) { ... } (Outer Loop for Rows)
//
//This is the outer loop. It controls the number of rows in the triangle.
//int i = 0;: Initializes a loop counter variable i to 0. This variable will represent the current row number.
//i < N;: This is the loop's condition. The loop will continue as long as i is less than N. If N is 9, i will go from 0 to 8 (inclusive), making a total of 9 iterations (0, 1, 2, 3, 4, 5, 6, 7, 8). Each iteration corresponds to printing one row of the triangle.
//i++: After each iteration of the outer loop, i is incremented by 1, moving to the next row.
//
//4. for (int j = 0; j <= i; j++) { ... } (Inner Loop for Columns/Stars)
//
//This is the inner loop. It controls the number of stars printed in the current row.
//int j = 0;: Initializes a loop counter variable j to 0. This variable will represent the current position (column) within the current row.
//j <= i;: This is the crucial part for creating the triangle shape. The loop will continue as long as j is less than or equal to i.
//When i is 0 (first row): j will iterate only once (j = 0), printing 1 star.
//When i is 1 (second row): j will iterate twice (j = 0, 1), printing 2 stars.
//When i is 2 (third row): j will iterate three times (j = 0, 1, 2), printing 3 stars.
//        ...and so on. This dynamic condition makes each subsequent row longer by one star.
//        j++: After each iteration of the inner loop, j is incremented by 1, moving to the next position in the current row.