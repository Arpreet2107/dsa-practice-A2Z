class Solution {
    public void whichWeekDay(int day) {
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

public class switchCase{
    public static void main(String[] args) {
        Solution s = new Solution();

        // Test cases
        s.whichWeekDay(1);  // Output: Monday
        s.whichWeekDay(4);  // Output: Thursday
        s.whichWeekDay(7);  // Output: Sunday
        s.whichWeekDay(0);  // Output: Invalid
        s.whichWeekDay(10); // Output: Invalid
    }
}
