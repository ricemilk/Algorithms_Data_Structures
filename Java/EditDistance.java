
public class EditDistance {
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] f = new int[l1 + 1][l2 + 1];
        
        int ans1 = -1;
        int ans2 = -1;
        int ans3 = -1;
        
        for(int m = 0; m <= l1; m++) {
            f[m][0] = m;
        }
        for(int n = 0; n <= l2; n++) {
        	f[0][n] = n;
        }
        for(int i = 1; i <= l1; i++) {
        	for(int j = 1; j <= l2; j++) {
        		if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
        			f[i][j] = f[i - 1][j - 1];
        		} else {
        			ans1 = f[i][j - 1] + 1;
            		ans2 = f[i - 1][j] + 1;
            		ans3 = f[i - 1][j - 1] + 1;
            		int tmp = Math.min(ans1, ans2);
            		f[i][j] = Math.min(tmp, ans3);
        		}
        		
        	}
        }
        return f[l1][l2];
    }
    
}
