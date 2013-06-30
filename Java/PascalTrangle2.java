import java.util.*;

public class PascalTrangle2 {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(1);
    	for(int i = 1; i <= rowIndex; i++) {
    		result.add(1);
    		for(int j = i - 1; j >= 1; j--) {
    			result.set(j, result.get(j - 1) + result.get(j));
    		}
    	}
        return result;
    }
}
