/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    bool isBalanced(TreeNode *root) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int h;
        return is_balance(root, h);
    }
    bool is_balance(TreeNode *root, int &height){
        if(!root){
            height = 0;
            return true;
        } 
        int lh = 0, rh = 0;
        if(!is_balance(root->left, lh)) return false;
        if(!is_balance(root->right, rh)) return false;
        height = max(lh, rh) + 1;
        if(abs(lh - rh) <= 1) return true;
        return false;
    }
};
