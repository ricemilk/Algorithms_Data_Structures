import java.util.*;

public class BTLevelOrderTraversal {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(root == null) {
    		return res;
    	}
    	ArrayList<ArrayList<TreeNode>> result = helper(root);
    	for(int i = 0; i < result.size(); i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();    		
    		for(int j = 0; j < result.get(i).size(); j++) {
    			tmp.add(result.get(i).get(j).val);
    		}
    		res.add(tmp);
    	}
    	return res;
        
    }
    
    private ArrayList<ArrayList<TreeNode>> helper(TreeNode root) {
    	ArrayList<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();
    	ArrayList<TreeNode> level = new ArrayList<TreeNode>();
    	level.add(root);
    	result.add(level);
    	ArrayList<TreeNode> prev = level;
    	while(true) {
        	ArrayList<TreeNode> cur = getNext(prev);
        	if (cur.isEmpty()) break;
        	result.add(cur);
        	prev = cur;
    	}
    	return result;
    }
    
    private ArrayList<TreeNode> getNext(ArrayList<TreeNode> prev) {
    	ArrayList<TreeNode> cur = new ArrayList<TreeNode>();
    	for(int i = 0; i < prev.size(); i++) {
    		if(prev.get(i).left != null) {
    			cur.add(prev.get(i).left);
    		}
    		if(prev.get(i).right != null) {
    			cur.add(prev.get(i).right);
    		}
    	}
    	return cur;
    }
}
