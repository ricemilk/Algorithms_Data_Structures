package careercup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompression {
	public String compress(String str) {
		int length = str.length();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < length; ) {
			int j = i + 1;
			while (j < length) {
				if (str.charAt(j) == str.charAt(i))
					j++;
				else break;
			}
			sb.append(str.charAt(i));
			sb.append(j - i);
			i = j;
		}
		return sb.toString();
	}
	
	public String compressBetter(String str) {
		String compressedString = compress(str);
		if (compressedString.length() >= str.length())
			return str;
		else return compressedString;
	}
	
	@Test
	public void testCompression() {
		String s = "abbcccdddd";
		String expectedResult = "a1b2c3d4";
		String result = compressBetter(s);
		assertEquals(expectedResult, result);
		s = "abcdddddd";
		expectedResult = "a1b1c1d6";
		result = compressBetter(s);
		assertEquals(expectedResult, result);

	}
}
