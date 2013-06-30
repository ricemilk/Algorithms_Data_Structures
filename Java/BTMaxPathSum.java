import java.util.*;

public class BTMaxPathSum {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
//    public int maxPathSum(TreeNode root) {
//    	if(root == null) {
//    		return -1;
//    	}
//    }
//    
//    public void helper(TreeNode root, int curSum, int maxSum) {
//    	if(root == null) {
//    		curSum = 0;
//    		return;
//    	}
//    	int lSum = 0;
//    	int rSum = 0;
//    	helper(root.left, lSum, maxSum);
//    	helper(root.right, rSum, maxSum);
//    	curSum = Math.max(root.val, root.val + (Math.max(lSum, rSum)));
//    	maxSum = 
//    }
	
	public static int maxPathSum(TreeNode root) {
	    // pass the curmanx in an array that contains only one value
	    ArrayList<Integer> curMax = new ArrayList<Integer>(1);
	    curMax.add(Integer.MIN_VALUE);
	    maxSubPath(root, curMax);
	    return curMax.get(0);
	}

	private static int maxSubPath(TreeNode root, ArrayList<Integer> curMax) {
	    if (root == null)  return 0;
	    int leftMax = Math.max(0, maxSubPath(root.left, curMax));
	    int rightMax = Math.max(0, maxSubPath(root.right, curMax));
	    curMax.set(0, Math.max(curMax.get(0), root.val+leftMax+rightMax));
	    return Math.max(root.val+leftMax, root.val+rightMax);
	}
}
