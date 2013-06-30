package careercup;

import org.junit.Test;

public class SetZeros {
	public void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i = 0; i < row.length; i++) {
			for(int j = 0; j < column.length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0; i < row.length; i++) {
			for(int j = 0; j < column.length; j++) {
				if(row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		
	}
	
	private void show(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		for (int row = 0; row < n; ++ row) {
			for (int col = 0; col < m; ++ col)
				System.out.print(matrix[row][col] + " ");
			System.out.println();
		}
	}
	
	@Test
	public void testSetZero() {
		int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {1, 1, 1}};
		setZeros(matrix);
		show(matrix);
	}
	
}
