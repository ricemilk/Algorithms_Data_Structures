import org.junit.Test;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(strs.length == 0) {
    		return "";
    	}
    	if(strs.length == 1) {
    		return strs[0];
    	}
    	String result = new String();
    	for(int i = 0; i < strs[0].length(); i++) {
    		for(int j = 1; j < strs.length; j++) {
    			if(strs[0].charAt(i) != strs[j].charAt(i) || i >= strs[j].length()) {
    				result = strs[0].substring(0, i);
    				break;
    			}
    		}
    	}
    	return result;
    }
    
    
    @Test
    public void test() {
    	String s = "abcdef";
    	System.out.print(s.substring(0, 4));
    }
}
