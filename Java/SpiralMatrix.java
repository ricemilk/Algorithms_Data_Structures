import java.util.*;

import org.junit.Test;

public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
    	if(matrix == null) {
    		return null;
    	}
    	int m = matrix.length;
    	int n = matrix[0].length;
    	double l = Math.ceil((double)Math.min(m, n) / 2);
    	int r = (int)l;
    	return helper(matrix, m, n, r);
        
    }

    
    private ArrayList<Integer> helper(int[][] matrix, int m, int n, int r) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	for(int k = 0; k < r; k++) {
    		for(int j = k; j < (n - k); j++) {
    			result.add((Integer)matrix[k][j]);
    		}
    		for(int j = (k + 1); j < (m - k); j++) {
    			result.add((Integer)matrix[j][n - 1 - k]);
    		}
    		for(int j = (n - 2- k); k < (m - 1 - k) && j >= k; j--) {
    			result.add((Integer)matrix[m - 1 - k][j]);
    		}
    		for(int j = (m - 2 - k); j >= (k + 1); j--) {
    			result.add((Integer)matrix[j][k]);
    		}
    	}
    	return result;
    }
    
    private void show(ArrayList<Integer> result) {
    	for(int i = 0; i < result.size(); i++) {
    		System.out.print(result.get(i) + " ");
    	}
    	System.out.println();
    }
    
    private void showM(int[][] matrix) {
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0 ; j < matrix[0].length; j++) {
    			System.out.print(matrix[i][j] + " ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
    
    @Test
    public void test() {
    	int[][] matrix = {{7}, {9}, {6}};
//    	for(int i = 0; i < 10; i++) {
//    		for(int j = 0; j < 4; j++) {
//    			matrix[i][j] = 2 * i + j;
//    		}
//    	}
//    	showM(matrix);
    	show(spiralOrder(matrix));
    }
}
