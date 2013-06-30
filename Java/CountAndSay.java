import java.applet.*;

import org.junit.Test;

public class CountAndSay {
    public String countAndSay(int n) {
    	String s = new String();
    	for(int i = 1; i <= n; i++) {
    		if(i == 1) {
    			s = "1";
    		} else {
				StringBuilder tmp = new StringBuilder();
    			for(int j = 0; j < s.length(); j++) {
    				int cnt = 1;
					while(j != s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
    						cnt++;
    						j++;
					}
					tmp.append(cnt);
					tmp.append(s.charAt(j));
    			}
    			s = tmp.toString();
    		}
    	}
        return s;
    }
    
    @Test
    public void test() {
    	System.out.println(countAndSay(4));
    }
}
