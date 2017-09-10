import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsPermutation {
	
	/**
	 * Link: https://www.hackerrank.com/contests/crescent-contest/challenges/permutation-check-and-count
	 * Given two strings s1 and s2,check if they are permutations of each other and print number of permutations of string s1.

You can assume that there will be no duplicate characters in both the strings.

Input Format

Two strings will be given as input.

Output Format

If they are permutations of each other,print "Yes" with the count of number of permutations of string s1. Else print "No" with the count of number of permutations of string s2.

Sample Input

andrew wednar

Sample Output

Yes 720

Explanation

You can see that both are permutations of each other. The number of permutations of "andrew" is 720. 
	 * @param args
	 */

    public static void main(String[] args) {
       Scanner abc = new Scanner(System.in);
        String input = abc.nextLine();
        String[] arr = input.split(" ");
        boolean flag = isPermutation(arr[0],arr[1]);
        long factorial = fact(arr[1].length());
        if(flag) {
            System.out.println("Yes "+factorial);
        }
        else {
            System.out.println("No "+factorial);
        }
    }
    
    private static boolean isPermutation(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        int[] char_set = new int[256];
        for(int i=0;i <s1.length();i++) {
            char_set[s1.charAt(i)]++;
            char_set[s2.charAt(i)]--;
        }
        for(int i =0;i<256; i++) {
            if(char_set[i]!=0)
                return false;
        }
        return true;
    }
    
    private static long fact(int x) {
        if (x==1)
            return 1;
        return x* fact(x-1);
    }
}