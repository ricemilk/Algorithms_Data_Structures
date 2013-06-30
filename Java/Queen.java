package careercup;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Queen {
	private void search(int row, int[] column, List<int[]> result) {
		// first check terminated condition
		if(row == column.length) {
			result.add(column.clone());
			// don't forget this
			return ;
		}
		for(int col = 0; col < column.length; ++col) {
			// assign before check
			column[row] = col;
			if(check(row, col, column)) {
				search(row + 1, column, result);
			}
		}
	}
	
	private boolean check(int row, int col, int[] column) {
		for(int i = 0; i < row; ++i) {
			if((col == column[i]) || (row - i == col - column[i]) || (col + row == column[i] + i)) {
				return false;
			}
		}
		return true;
	}
	
	public List<int[]> solve(int n) {
		int[] column = new int[n];
		List<int[]> result = new ArrayList<int[]>();
		search(0, column, result);
		return result;
	}
	
	private void show(List<int[]> results) {
		for(int[] res : results) {
			for (int x : res) 
				System.out.print(x + " ");
			System.out.println();
		}
	}
	
	@Test
	public void test() {
		for (int n = 3; n <= 14; ++ n) {
			System.out.println(n + " : " + solve(n).size());
		}
	}
	
}
