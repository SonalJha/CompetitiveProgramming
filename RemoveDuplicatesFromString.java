import java.util.Scanner;

public class RemoveDuplicatesFromString {
	
	/**
	 * Remove duplicates from a sorted string
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		String input = abc.nextLine();
		String ouput = removeDuplicates(input);
		System.out.println(ouput);
	}

	private static String removeDuplicates(String input) {
		int pos = 0;
		StringBuffer abc = new StringBuffer();
		abc.append(input.charAt(0));
		for(int i=0;i<input.length(); i++ ) {
			if(input.charAt(i)!=abc.charAt(pos)) {
				abc.append(input.charAt(i));
				pos++;
			}
		}
		return abc.toString();
	}

}
