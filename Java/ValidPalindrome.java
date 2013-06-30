import org.junit.Test;


public class ValidPalindrome {
    public boolean isPalindrome(String s) {
    	s = s.toLowerCase();
    	if(s.isEmpty()) {
    		return true;
    	}

    	int end = 0;
    	for(end = 0; end < s.length() - 1; end++) {
    	}
    	
    	for(int front = 0; front <= end; front++, end--) {
    		while(!check(s.charAt(front)) && front < end) {
    			front++;
    		}
    		while(!check(s.charAt(end)) && front < end) {
    			end--;
    		}
    		if(check(s.charAt(front)) && check(s.charAt(end))) {
    			if(s.charAt(front) == s.charAt(end)) {
    				continue;
    			}
    			else {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    private boolean check(char i) {
    	if((i >= 'a' && i <= 'z') || (i >= '1' && i <= '9')) {
    		return true;
    	}
    	return false;
    }
    
    @Test
    public void test() {
    	String s = " ";
    	System.out.println(isPalindrome(s));
    }
}
