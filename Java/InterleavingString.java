import java.util.*;

import org.junit.Test;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {

    }
    
    private boolean helper(String s1, String s2, String s3, boolean res) { 
    	boolean result;
    	if(res) {
    		if(s1.isEmpty()) {
    			return s2.equals(s3);
    		}
    		if(s2.isEmpty()) {
    			return s1.equals(s3);
    		}
    		if(s3.isEmpty()) {
    			return false;
    		}
        	String subA = s1.substring(0, s1.length() - 1);
        	String subB = s2.substring(0, s2.length() - 1);
        	
    	}

    }
    
    @Test
    public void test() {
    	String s1 = "a";
    	String s2 = "";
    	String s3 = "aa";
    	if(isInterleave(s1, s2, s3)) {
    		System.out.println("true");
    	} else {
    		System.out.println("false");
    	}
    }
}


//public boolean isInterleave(String s1, String s2, String s3) {
//    if(s3.isEmpty()) {
//		if(s2.isEmpty() && s1.isEmpty()) {
//			return true;
//		}
//		return false;
//	}
//    if(s1.isEmpty()) {
//    	if(s3.equals(s2)) {
//    		return true;
//    	} else {
//    		return false;
//    	}
//    }
//    if(s2.isEmpty()) {
//    	if(s3.equals(s1)) {
//    		return true;
//    	} else {
//    		return false;
//    	}
//    }
//    if(!s1.isEmpty() && !s2.isEmpty() && s3.charAt(0) != s1.charAt(0) && s3.charAt(0) != s2.charAt(0)) {
//		return false;
//	}
////    System.out.println("!!");
//    if(s1.isEmpty() && s2.isEmpty() && !s3.isEmpty()) {
//    	return false;
//    }
////    System.out.println("##");
//    String sA = new String();
//    String sB = new String();
//    String sC = new String();
//	if(s1.length() > 1) {
//		sA = s1.substring(1);	
//	} else {
//		sA = "";
//	}
// 
//	if(s2.length() > 1) {
//		sB = s2.substring(1);	
//	} else {
//		sB = "";
//	}
//	
//	if(s3.length() > 1) {
//		sC = s3.substring(1);	
//	} else {
//		sC = "";
//	}
//	if(!s1.isEmpty() && !s2.isEmpty() && s3.charAt(0) == s1.charAt(0) && s1.charAt(0) == s2.charAt(0) ) {
////		System.out.println("$$");
//		return isInterleave(sA, s2, sC) || isInterleave(s1, sB, sC);
//	} else if(!s1.isEmpty() && !s2.isEmpty() && s3.charAt(0) == s1.charAt(0) && s1.charAt(0) != s2.charAt(0)){
////		System.out.println("%%");
//		return isInterleave(sA, s2, sC);
//	} else {
//		return isInterleave(s1, sB, sC);
//	}
//}