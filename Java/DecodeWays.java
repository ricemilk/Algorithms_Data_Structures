import org.junit.Test;


public class DecodeWays {
    public int numDecodings(String s) {
    	if(s.isEmpty()) {
    		return 0;
    	}
    	if(s.charAt(0) == '0') {
    		return 0;
    	}
    	int n = s.length();
    	int[] result = new int[n];
    	result[0] = 1;
    	for(int i = 1; i < n; i++) {
    		if(s.charAt(i) == '0') {
    			if(s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
    				if(i == 1) {
    					result[i] = 1;
    				} else {
    					result[i] = result[i - 2];
    				}
    			} else {
    				result[i] = 0;
    			}
    		} else if((s.charAt(i - 1) == '1') || (s.charAt(i - 1) == '2' && s.charAt(i) > '0' && s.charAt(i) <= '6')) {
    			if(i == 1) {
    				result[i] = result[i - 1] + 1;
    			} else {
    				result[i] = result[i - 1] + result[i - 2];	
    			}
    		} else {
    			result[i] = result[i - 1];
    		}
    	}
    	
    	return result[n - 1];
    }
    
    @Test
    public void test() {
    	String s = "100";
    	System.out.println(numDecodings(s));
    }
}
