import java.util.*;


public class RecoveryTree {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x;} 
	}
	
    public void recoverTree(TreeNode root) {
    	if(root == null) {
    		return;
    	}
    	ArrayList<TreeNode> change = new ArrayList<TreeNode>();
    	do{
    		check(root, change);
    		check(root.left, change);
    		check(root.right, change);
    	}while(change.size() < 2);
    	int tmp;
    	tmp = change.get(0).val;
    	change.get(0).val = change.get(1).val;
    	change.get(1).val = tmp;
    	return;
    }
    
    private void check(TreeNode r, ArrayList<TreeNode> change) {
    	if(r == null || r.left == null || r.right == null) {
    		return;
    	}
    	if(r.left.val > r.val){
    		change.add(r.left);
    	}
    	if(r.right.val < r.val){
    		change.add(r.right);
    	}
    	return;
    }
}
