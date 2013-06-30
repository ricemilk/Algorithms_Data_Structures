package careercup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MakeChange {
	public int makeChange(int n) {
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}

		return makeChange(n - 1) + makeChange(n - 5) + makeChange(n - 10) + makeChange(n - 25);
	}
	
	@Test
	public void testChange() {
		int n = 6;
		assertEquals(2, makeChange(n));
	}
}
