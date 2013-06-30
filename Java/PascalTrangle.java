import java.util.*;

public class PascalTrangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	for(int i = 0; i < numRows; i++) {
            ArrayList<Integer> array = new ArrayList<Integer>();
    		for(int j = 0; j <= i; j++) {
    			if(j == 0 || j == i) {
    				array.add(1);
    			} else {
    				array.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
    			}
    		}
    		result.add(array);
    	}
        return result;
    }
}
