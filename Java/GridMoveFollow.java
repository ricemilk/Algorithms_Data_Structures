package careercup;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridMoveFollow {
	public int count(boolean[][] off, int x, int y) {
		int[][] ways= new int[x + 1][y + 1];
		if (!off[0][0]) ways[0][0] = 1;
		for(int i = 0; i < x + 1; ++i) {
			for(int j = 0; j < y + 1; ++j) {
				if (!off[i][j]) {
					if(j > 0) {
						ways[i][j] += ways[i][j - 1];
					}
					if(i > 0) {
						ways[i][j] += ways[i - 1][j];
					}
				}
			}
		}
		return ways[x][y];
	}
	
	@Test
	public void testCount() {
		boolean[][] off = {{false, false, false}, {false, false, false}, {false, false, false}};
		int[][] ways = {{1, 1, 1}, {1, 2, 3}, {1, 3, 6}};
		for(int x = 0; x < 3; ++x) {
			for(int y = 0; y < 3; ++y) {
				System.out.println(x + " " + y);
				assertEquals(ways[x][y], count(off, x, y));
			}
		}
	}
}
