import java.util.ArrayList;

public class Nqueen {
    public ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] cur = new int[n];
    	ArrayList<int[]> result = new ArrayList<int[]>();
    	NQueens(0, cur, result);
    	ArrayList<String[]> res = new ArrayList<String[]>();
    	for(int i = 0; i < result.size(); i++) {
    		String[] tmpS = new String[n];
    		for(int j = 0; j < cur.length; j++) {
    			StringBuilder sb = new StringBuilder();
    			int col = result.get(i)[j];
    			for (int x = 0; x < n; ++ x) {
    				if (x == col) {
    					sb.append('Q');
    				} else {
    					sb.append('.');
    				}
    			}
    			tmpS[j] = sb.toString();
    		}   		
    		res.add(tmpS);
    	}
    	return res;
    }
    
    private void NQueens(int row, int[] cur, ArrayList<int[]> result) {
    	if(row == cur.length) {
    		result.add(cur.clone());
    		return;
    	}
    	for(int column = 0; column < cur.length; column++) {
    		if(check(row, column, cur)) {
    			cur[row] = column;
    			NQueens(row + 1, cur, result);
    		}
    	}
    }
    
    private boolean check(int row, int col, int[] cur) {
    	for(int i = 0; i < row; i++) {
    		if(col == cur[i] || (row + col == i + cur[i]) || (row - i == col - cur[i])) {
    			return false;
    		}
    	}
    	return true;
    }
}
