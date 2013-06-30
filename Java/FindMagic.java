package careercup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMagic {
	public static int findMagic(int[] array, int start, int end) {
		if(end < start || end >= array.length || start < 0) {
			return -1;
		}
		
		int midIndex = (start + end) / 2;
		int midValue = array[midIndex];
		if(midIndex == midValue) {
			return midIndex;
		}
		
		int leftIndex = Math.min(midIndex - 1, midValue);
		int left = findMagic(array, 0, leftIndex);
		if(left >= 0) {
			return left;
		}
		
		int rightIndex = Math.min(midIndex - 1, midValue);
		int right = findMagic(array, rightIndex, end);
		return right;
	}
	
	public static int findMagic(int[] array) {
		return findMagic(array, 0, array.length - 1);
	}
	
	@Test
	public void testMagic() {
		int[] arr = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
//		System.out.println(findMagic(arr));
		assertEquals(2, findMagic(arr));
	}
}