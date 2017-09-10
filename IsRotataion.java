import java.util.Scanner;

public class IsRotataion {
	/**
	 * link: https://www.hackerrank.com/contests/codemania/challenges/string-rotation
	 * @param args
	 * Sample I/O: abhiyanth
					yanthabhi
	 */

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		String s1= abc.nextLine();
		String s2 = abc.nextLine();
		boolean flag = isRotation(s1,s2);
		if(flag) {
			System.out.println("Yes s1 is rotation of s2");
		}
		else {
			System.out.println("Np s1 is not the rotation of s2");
		}

	}
	
	private static boolean isRotation(String s1, String s2) {
		String s3 = s1+s1;
		return isSubstring(s3,s2);
	}

	private static boolean isSubstring(String s1, String s2) {
		return (s1.contains(s2));
	}

}
