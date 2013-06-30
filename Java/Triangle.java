import java.util.ArrayList;


public class Triangle {
	      public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
	        int height = triangle.size();
	        if(height == 1) {
	        	return triangle.get(0).get(0);
	        }
	        
	        ArrayList<ArrayList<Integer>> sum = new ArrayList<ArrayList<Integer>>();
	        sum.add(triangle.get(0));
			for(int i = 1; i < height; i++){
				int tmp;
				ArrayList<Integer> tmpA  = new ArrayList<Integer>();
				for(int j = 0; j < triangle.get(i).size(); j++) {
					if(j == 0) {
						tmp = triangle.get(i).get(j) + sum.get(i - 1).get(j);
						
					} else if(j == triangle.get(i).size() - 1) {
						tmp = triangle.get(i).get(j) + sum.get(i - 1).get(j - 1);
					} else {
						tmp = triangle.get(i).get(j) + Math.min(sum.get(i - 1).get(j - 1), sum.get(i - 1).get(j));
					}
					tmpA.add(tmp);
				}
				sum.add(tmpA);
			}
	        
	        int minSum = sum.get(height - 1).get(0);
	        for(int i = 0; i< sum.get(height - 1).size(); i++) {
	        	if(sum.get(height - 1).get(i) < minSum) {
	        		minSum = sum.get(height - 1).get(i);
	        	}
	        }
	        return minSum;
	       }
}
