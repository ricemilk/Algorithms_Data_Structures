import java.util.*;

import org.junit.Test;

public class ReverseInteger {
    public int reverse(int x) {
    	int result = 0;
    	while(Math.abs(x) > 0) {
    		result = result * 10 + x % 10;
    		x = x / 10;
    	}
    	return result;
    }
    
    @Test
    public void test() {
    	int x = -3245;
    	System.out.println(reverse(x));
    }
}
