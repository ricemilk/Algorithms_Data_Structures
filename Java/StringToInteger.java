import java.util.*;

import org.junit.Test;

public class StringToInteger {
    public int atoi(String str) {
    	str = shrink(str);
//    	System.out.println(str);
    	if(str.isEmpty()) {
    		return 0;
    	}
    	Integer result = new Integer(0);
    	ArrayList<Integer> symbol = new ArrayList<Integer>();
    	for(int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) <= '9' && str.charAt(i) >= '0') {
    			int tmp = (int)str.charAt(i) - 48;
//    			System.out.println(tmp);
    			result = result * 10 + tmp;
//    			System.out.println(result);
    		} else if(str.charAt(i) == '+') {
    			symbol.add(Integer.valueOf(0));
    		} else if(str.charAt(i) == '-') {
    			symbol.add(Integer.valueOf(1));
    		} else {
    			return 0;
    		}
    	}
    	if(symbol.size() > 1) {
    		return 0;
    	} else if(symbol.size() == 1 && symbol.get(0) == '-') {
    		if(result > 2147483647) {
    			return -2147483648;
    		} else {
    			return -result;
    		}
    	} else {
    		if(result > 2147483647) {
    			return 2147483647;
    		} else {
    			return result;
    		}
    	}
    }
    
    private String shrink(String s) {
    	if(s.isEmpty()) {
    		return s;
    	}
    	int i = 0;
    	int j = s.length() - 1;
    	while(s.charAt(i) == ' ' && i < j) {
			i++;
		} 
    	while(s.charAt(j) == ' ' && i < j) {
			j--;
		}
    	return s.substring(i, j + 1);
    }
    
    @Test
    public void test() {
    	String s = "   -2673  ";
    	System.out.println(atoi(s));
    }
}
