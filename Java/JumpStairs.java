package careercup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigInteger;

public class JumpStairs {
	public BigInteger jumpStairs(int n) {
		BigInteger[] array = new BigInteger[4];
		array[0] = BigInteger.ONE;
		array[1] = BigInteger.ONE;
		array[2] = new BigInteger("2");
		if(n < 3) {
			return array[n];
		}
		for(int i = 3; i <= n; ++i) {
			array[3] = array[0].add(array[1]).add(array[2]);
			for(int j = 0; j < 3; ++j) {
				array[j] = array[j + 1];
			}
		}
		return array[3];
	}
	
	@Test
	public void test() {
		int[] expectedResult = {1, 1, 2, 4, 7, 13, 24, 44};
		for(int i = 0; i < expectedResult.length; ++i) {
			assertEquals(jumpStairs(i), new BigInteger("" + expectedResult[i]));
		}
		System.out.println(jumpStairs(100000).toString().length());
	}
}

