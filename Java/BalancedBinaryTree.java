import java.util.*;

public class BalancedBinaryTree {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

    public boolean isBalanced(TreeNode root) {
    	int abs = Math.abs(getHeight(root.left) - getHeight(root.right));
    	if(Math.abs(abs) > 1) {
    		return false;
    	}
    	return isBalanced(root.left) && isBalanced(root.right);
    }
    
    private boolean helper(TreeNode root, int[] height) {
    	if(root == null) {
    		height[0] = 0;
    		return true;
    	}
    	int[] leftHeight = new int[1];
    	int[] rightHeight = new int[1];
    	boolean leftRes = helper(root.left, leftHeight);
    	boolean rightRes = helper(root.right, rightHeight);
    	height[0] = Math.max(leftHeight[0], rightHeight[0]) + 1;
    	if(!leftRes || !rightRes || Math.abs(leftHeight[0] - rightHeight[0]) > 1) {
    		return false;
    	}
    	return true;
    }
    

	    
}

//RUN TIME ERROR
//public boolean isBalanced(TreeNode root) {
//	int abs = Math.abs(getHeight(root.left) - getHeight(root.right));
//	if(Math.abs(abs) > 1) {
//		return false;
//	}
//	return isBalanced(root.left) && isBalanced(root.right);
//}
//
//private int getHeight(TreeNode root) {
//	if(root == null) {
//		return 0;
//	}
//	return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//}
