import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesSortedArrayInt {
	
	/**
	 * Link: https://www.hackerrank.com/contests/doyoulikeit/challenges/remove-duplicates-from-sorted-array
	 * Remove duplicates from a sorted string
	 * @param args
	 * Sample I/O
	 * 3
	 * 1 1 1
	 * 1
	 * 
	 * 6
	 * 0 1 1 2 2 3
	 * 0 1 2 3
	 */

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		int size = abc.nextInt();
		ArrayList<Integer> input = new ArrayList();
		for(int i =0; i<size; i++) {
			input.add(i,abc.nextInt());
		}
		ArrayList<Integer> output = removeDuplicates(input);
		for(int i =0; i<output.size(); i++) {
			System.out.print(output.get(i)+" ");
		}
		
	}

	private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> input) {
		// as length is changing we need to extract is as separate variable
		int length = input.size()-1;
		for(int i =0,j=0; i<length;i++) {
			if(input.get(j)==input.get(j+1)) {
				input.remove(j);
			}
			else {
				j++;
			}
		}
		return input;
	}

}
