import java.util.ArrayList;


public class GrayCode {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
    	result.add(0);
 //   	result.add(1);
    	for(int i = 0; i < n; i ++) {
    		for(int j = result.size() - 1; j >= 0; j--) {
    			result.add(result.get(j) | (1 << i));
    		}
    	}
    	return result;
    }
}
