import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        rev(input);
	}

	private static void rev(String input) {
		String output = new StringBuffer(input).reverse().toString();
		   System.out.println(output);
	}
	
	public static boolean isPalindrome(String input) {
        String rev = new StringBuffer(input).reverse().toString();
        if(input.equals(rev))
            return true;
        return false;
    }

}
