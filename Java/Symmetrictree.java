
public class Symmetrictree {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
	public boolean isSymmetric(TreeNode root) {
    	if(root == null) {
    		return true;
    	}
    	return helper(root.left, root.right);
        
    }
    
    private boolean helper(TreeNode lc, TreeNode rc) {
    	if(lc == null && rc == null) {
    		return true;
    	}
    	if(lc == null || rc == null) {
    		return false;
    	}
        if(lc.val == rc.val) {
            return (helper(lc.left, rc.right) && helper(lc.right, rc.left));
        }
        return false;   	
    }
}
