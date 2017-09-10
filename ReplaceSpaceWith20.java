import java.util.Scanner;

public class ReplaceSpaceWith20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc = new Scanner(System.in);
		String input = abc.nextLine();
		String output = repalceStringWith20(input);
		System.out.println(output);
	}

	private static String repalceStringWith20(String input) {
		String output = input.replaceAll(" ", "%20");
		return output;
	}
	
	

}
