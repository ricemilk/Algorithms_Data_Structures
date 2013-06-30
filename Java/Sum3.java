import java.util.ArrayList;
import java.util.Arrays;


public class Sum3 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < num.length - 2; i++) {
        	for(int j = i + 1; j < num.length - 1; j++) {
        		for(int k = num.length -  1; k > j; k--) {
        			if(j + 1 < num.length && num[j] == num[j + 1] && k > j + 1) {
        				j++;
        			}
        			if(k > 0 && num[k] == num[k -1] && k > j + 1) {
        				k--;
        			}
        			ArrayList<Integer> tmp = new ArrayList<Integer>();
        			if(num[j] + num[k] + num[i] == 0 && num[j] != num[j - 1]) {
                        if((k < num.length - 1 && num[k] != num[k + 1]) || k == num.length - 1) {
                            tmp.add(num[i]);
            			    tmp.add(num[j]);
        				    tmp.add(num[k]);
        				    result.add(tmp);    
                        }
        				
        			}
        		}
        	}
        }
        return result;
    }
}
