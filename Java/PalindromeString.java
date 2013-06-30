import org.junit.Test;


public class PalindromeString {
	public boolean isPalindrome(String s) {
		if(s == "") {
			return false;
		}
		
		int front = 0;
		int end = s.length() - 1;
		while(front < end) {
			if(s.charAt(front) != s.charAt(end)) {
				return false;
			}
			front++;
			end--;
		}
		return true;
	}
	
	@Test
	public void test() {
		String s = "abcbs";
		System.out.println(isPalindrome(s));
	}
}
