/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
typedef vector<int> vi;
typedef vector<vi> vvi;

class Solution {
public:
    vvi levelOrder(TreeNode *root) {
        vvi res;
        if (!root) return res;
        vector<TreeNode*> level0;
        level0.push_back(root);
        while (!level0.empty()) {
            vi cur;
            vector<TreeNode*> level1;
            for (int i = 0; i < level0.size(); ++ i) {
                cur.push_back(level0[i]->val);
                if (level0[i]->left) level1.push_back(level0[i]->left);
                if (level0[i]->right) level1.push_back(level0[i]->right);
            }
            res.push_back(cur);
            level0 = level1;
        }
        return res;
    }
};
