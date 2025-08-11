//if the string has both uppercase and lowercase letters

import java.util.*;

public class Solution{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s;
        s= sc.next();
        //pre-compute
        int[] hash = new int[256];
        for(int i =0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        int q;
        q=sc.nextInt();
        while(q-- > 0){
            char c;
            c=sc.next().charAt(0);
            //fetch
            System.out.println(hash[c]);
        }
    }
}