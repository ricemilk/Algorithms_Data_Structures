package careercup;

//import java.util.Arrays;
//import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class Subset {
    public static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> set, int index) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            if(index < 0) {
                    result.add(new ArrayList<Integer>());
                    return result;
            }
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
            if(index == set.size()) { 
                    result.add(new ArrayList<Integer>());
            }
            res = subset(set, index - 1);
            result.addAll(res);
            for(int i = 0; i < res.size(); ++i) {
                    ArrayList<Integer> newArray = new ArrayList<Integer>();
                    newArray.addAll(res.get(i));
                    newArray.add(set.get(index));
                    result.add(newArray);
            }
            return result;
    }
    
    public static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> set) { 
            return subset(set, set.size() - 1);
    }
    
    @Test
    public void testSublet() {
            ArrayList<Integer> set = new ArrayList<Integer>();
            set.add(0);
            set.add(1);
            set.add(2);
            ArrayList<ArrayList<Integer>> result = subset(set);
            for (ArrayList<Integer> list : result) {
                System.out.println(list);
            }
            String str = "helloworld";
            System.out.println(str.substring(5));
    }
}
