package careercup;
class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTree {
	TreeNode root;
	public BinaryTree() {
		root = null;
	}
	
	public void insert(int key) {
		insert(key, root);
	}
	
	private void insert(int key, TreeNode root) {
		if (root == null) {
			root = new TreeNode(key, null, null);
			return;
		}
		if (key < root.val) {
			insert(key, root.left);
		} else if (key > root.val) {
			insert(key, root.right);
		}
	}
	
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
