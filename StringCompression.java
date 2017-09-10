import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Link: https://www.hackerrank.com/challenges/string-compression
		 */
		
		Scanner abc = new Scanner(System.in);
		String input = abc.nextLine();
		
		String output = Compress(input);
		System.out.println(output);

	}

	private static String Compress(String input) {
		StringBuffer abc = new StringBuffer();
		int count =1;
		int i=0;
		for( i =0; i<input.length()-1;i++) {
			if( input.charAt(i) != input.charAt(i+1)) {
				abc.append(input.charAt(i));
				abc.append(count);
				count = 1;
			}
			else {
				count ++;
			}
		}
		
		abc.append(input.charAt(i));
		abc.append(count);
		if(input.length()>abc.toString().length())
		return abc.toString();
		return input;
	}

}
