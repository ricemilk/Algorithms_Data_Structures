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
    bool isValidBST(TreeNode *root) {
        int ma, mb;
        return is_validBST(root, ma,mb);
    }
    bool is_validBST(TreeNode *root, int& Max, int& Min){
        Max = -(1<<30), Min = 1<<30;
        if(!root) return true;
        int lMax, lMin, rMax, rMin;
        bool lres = is_validBST(root->left, lMax, lMin);
        bool rres = is_validBST(root->right, rMax, rMin);
        Max = max(root->val, max(lMax, rMax));
        Min = min(root->val, min(lMin, rMin));
        if (!lres || !rres) return false;
        return (lMax < root->val && rMin > root->val);
    }
};