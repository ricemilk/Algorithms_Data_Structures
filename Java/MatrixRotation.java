package careercup;

import org.junit.Test;

public class MatrixRotation {
	public void rotate(int[][] matrix, int n) {
		for (int row = 0; row < n / 2; ++row) {
			for (int col = 0; col < n / 2; ++col) {
				int D = matrix[n - 1 - col][row];
				matrix[n - 1 - col][row] = matrix[n - 1 - row][n - 1 - col];
				matrix[n - 1 - row][n - 1 - col] = matrix[col][n - 1 - row];
				matrix[col][n - 1 - row] = matrix[row][col];
				matrix[row][col] = D;
			}
		}
	}

	private void show(int[][] matrix, int n) {
		for (int row = 0; row < n; ++ row) {
			for (int col = 0; col < n; ++ col)
				System.out.print(matrix[row][col] + " ");
			System.out.println();
		}
	}
	
	@Test
	public void testRotate() {
		int n = 3;
		int[][] matrix = new int[n][n];
		for (int row = 0; row < n; ++ row)
			for (int col = 0; col < n; ++ col)
				matrix[row][col] = row * n + col + 1;
		show(matrix, n);
		rotate(matrix, n);
		show(matrix, n);
	}
}
