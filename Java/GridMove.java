package careercup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridMove {
	public int choose(int n, int m) {
		if (m == 0) {
			return 1;
		}
		if(n - m < m) {
			m = n - m;
		}
		return choose(n - 1, m - 1) * n / m;
	}
	
	@Test
	public void testChoose() {
		int[] nArray = {50, 44, 31, 22, 12, 5};
		int[] mArray = {48, 2, 1, 19, 9, 2};
		int[] resultArray = {1225, 946, 31, 1540, 220, 10};
		for(int i = 0; i < nArray.length; ++i) {
			assertEquals(resultArray[i], choose(nArray[i], mArray[i]));
		}
		
	}
}
