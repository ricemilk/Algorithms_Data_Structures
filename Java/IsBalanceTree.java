package careercup;

public class IsBalanceTree {
	private int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
	
	public boolean isBalance(TreeNode root) {
		if(root == null) {
			return true;
		}
		int diff = getHeight(root.left) - getHeight(root.right);
		if(Math.abs(diff) <= 1) {
			return isBalance(root.left) && isBalance(root.right);
		}
		return false;
	}
}

