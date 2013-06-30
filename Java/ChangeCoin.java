package careercup;

import org.junit.Test;

public class ChangeCoin {
	public int changeCoin(int n, int[] c) {		
		int[][] res = new int[n + 1][c.length + 1];
		
		res[0][0] = 1;
		for(int j = 1; j <= c.length; ++j) {
			for(int i = 0; i <= n; ++i) {
				if(i >= c[j - 1]) {
					res[i][j] += res[i - c[j - 1]][j];					
				}
				res[i][j] += res[i][j - 1];
			}	
		}
		return res[n][c.length];
	}
	
	@Test
	public void test() {
		int[] c = {1, 5, 10, 25};
		for (int i = 3; i <= 30; ++ i) {
			System.out.println(i + " : " + changeCoin(i, c));
		}
	}
}
