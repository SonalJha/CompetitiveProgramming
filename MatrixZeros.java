import java.util.Scanner;

public class MatrixZeros {
	
	/**
	 * Sample I/O
	 * 
	 * 4 4
	1 2 3 4
	0 4 5 6
	4 5 0 1
	1 1 1 1


	0 2 0 4 
	0 0 0 0 
	0 0 0 0 
	0 1 0 1 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		int row_size = abc.nextInt();
		int col_size = abc.nextInt();
		int[][] matrix = new int[row_size][col_size];
		for(int i =0; i<row_size ;i++) {
			for (int j=0;j<col_size; j++) {
				matrix[i][j] = abc.nextInt();
			}
		}
		
		makeZero(matrix);
		
		for(int i =0; i<row_size ;i++) {
			for (int j=0;j<col_size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static void makeZero(int[][] matrix) {
		int i, j;
		int row_length = matrix.length;
		int col_length = matrix[0].length;
		
		boolean[] row = new boolean[row_length];
		boolean[] col = new boolean[col_length];
		
		for (i =0 ; i< row_length ; i++) {
			for (j =0 ;j< col_length ; j++) {
				if(matrix[i][j]==0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for (i =0 ; i< row_length ; i++) {
			for (j =0 ;j< col_length ; j++) {
				if(row[i]|| col[j]) {
					matrix[i][j] =0;
				}
			}
		}
	}

}
