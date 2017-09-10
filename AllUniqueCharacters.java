import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class AllUniqueCharacters {
	
	/**
	 * input: This is a test string
	 * output: No
	 * input: I am wonderful
	 * output: Yes
     * 
     * Link: https://www.hackerrank.com/contests/fau-coding-competition/challenges/guild-unique-characters
	 * @param args
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
        boolean flag;
        flag = isUnique(input);
        if(flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
    
    
    
    private static boolean isUnique(String input) {
        boolean[] char_set = new boolean[256];
        // ignore space, quotes and numbers
        
        for(int i =0 ; i<input.length(); i++) {
            if(!Character.isLetter(input.charAt(i)))
                i++;
            else if(char_set[input.charAt(i)]==true) {
                return false;
            }
            else {
                char_set[input.charAt(i)] = true;
            }
        }
        return true;
    }
}

