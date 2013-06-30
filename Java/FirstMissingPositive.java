import java.util.*;

import org.junit.Test;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] A) {
    	if(A.length == 0) {
    		return 1;
    	}
    	int n = A.length;
    	for(int i = 0; i < n; i++) {
    		while(A[A[i]] != A[i] && A[i] != i && A[i] >= 0 && A[i] < n) {
    			System.out.println(A[i]);
    			System.out.println(A[A[i]]);
    			int tmp = A[i];
    			A[i] = A[A[i]];
    			A[A[i]] = tmp;
    		}
    	}
    	for(int i = 0; i < n; i++) {
    		if(i > 0 && A[i] != i) {
    			return i;
    		}
    	}
    	return n;
    }
    
    @Test
    public void test() {
    	int[] A = {1, 10, -1};
    	System.out.println(firstMissingPositive(A));
    }

}
