import org.junit.Test;


public class ValidNumber {
    public boolean isNumber(String s) {
    	s = shrink(s);
    	if(s.isEmpty()) {
    		return false;
    	}    	
    	for(int i = 0; i < s.length(); i++) {
    		if(!checkNum(s, i, i) && s.charAt(i) != 'e' && s.charAt(i) != '+' && s.charAt(i) != '-' && s.charAt(i) != '.') {
    			return false;
    		}    		
    	}
		if(s.charAt(0) == '+' || s.charAt(0) == '-') {
			return checkE(s, 1) || checkFloat(s, 1) || checkNum(s, 1, s.length() - 1);
		}
    	return checkE(s, 0) || checkFloat(s, 0) || checkNum(s, 0, s.length() - 1);
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
    
    private boolean checkNp(String s, int i) {
    	if(i >= s.length()) {
    		return false;
    	}
    	if(s.charAt(i) == '+' || s.charAt(i) == '-') {
    		return checkNum(s, i + 1, s.length() - 1);
    	}
    	return false;
    }
    
    private boolean checkE(String s, int i) {
    	for(int m = i; m < s.length(); m++) {
    		if(s.charAt(m) == 'e') {
    			if(i > m - 1) {
    				return false;
    			}
    			if((checkNum(s, i, m - 1) || checkFloat(s.substring(i, m), 0)) && (checkNp(s, m + 1) || checkNum(s, m + 1, s.length() - 1))) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    private boolean checkFloat(String s, int i) {
    	for(int m = i; m < s.length(); m++) {
    		if(s.charAt(m) == '.') {
    			if(m == 0 && checkNum(s, m + 1, s.length() - 1)) {
    				return true;
    			}
    			if((s.charAt(0) == '+' || s.charAt(0) == '-') && m == 1 && checkNum(s, m + 1, s.length() - 1)) {
    				return true;
    			}
    			if(i > m - 1) {
    				return false;
    			}
    			if(m == s.length() - 1 && checkNum(s, i, m - 1)) {
    				return true;
    			}
    			if(checkNum(s, i, m - 1) && checkNum(s, m + 1, s.length() - 1)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    private boolean checkNum(String s, int i, int j) {
    	if(i > j) {
    		return false;
    	}
    	for(int m = i; m <= j; m++) {
    		if(!(s.charAt(m) >= '0' && s.charAt(m) <= '9')) {
    			return false;
    		}
    	}
    	return true;
    }
    
    @Test
    public void test() {
    	String s = "1.3e44";
    	if(isNumber(s)) {
    		System.out.println("true");
    	} else {
    		System.out.println("false");
    	}
    }
}
