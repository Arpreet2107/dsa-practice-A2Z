import java.io.*;

public class Main{
    public static boolean isPalindrome(String str){
        // Check if the string is empty or null
        if(str == null || str.isEmpty()){
            return true;
        }
        // Two pointers approach to check for palindrome
        int left = 0;// Start from the beginning
        int right = str.length()-1;// Start from the end
        while(left < right){// Continue until the two pointers meet
            // Check if the characters at the pointers are alphanumeric
            char l = str.charAt(left);// Get character at left pointer
            char r = str.charAt(right);// Get character at right pointer
            // If the character is not alphanumeric, move the pointer
            if(!Character.isLetterOrDigit(l)){// If left character is not alphanumeric
                left++;// Move left pointer to the right
            }else if(!Character.isLetterOrDigit(r)){/// If right character is not alphanumeric
                right--;// Move right pointer to the left
            }else if(l == r){// If both characters are equal
                left++;// Move both pointers towards the center
                right--;
            }else if(Character.toLowerCase(l) != Character.toLowerCase(r)){// If characters are not equal ignoring case
                // Return false as it is not a palindrome
                return false;
            }else{// If characters are equal ignoring case
                left++;// Move left pointer to the right
                right--;// Move right pointer to the left
            }
        }// If all characters matched, it is a palindrome
        // Return true as it is a palindrome
        return true;
    }
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// Create a BufferedReader to read input
        System.out.println("Enter a string to check if it is a palindrome:");
        try {// Read the input string
            String str = br.readLine();// Read the string from input
            // Check if the string is a palindrome
            if(isPalindrome(str)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}