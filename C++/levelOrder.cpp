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
    vector<vector<int> > levelOrder(TreeNode *root) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        vector<vector<int> > res;
        if(!root) return res;
        vector<vector<int> > lres = levelOrder(root->left);
        vector<vector<int> > rres = levelOrder(root->right);
        vector<int> r;
        r.push_back(root->val);
        res.push_back(r);
        for(int i = 0; i != max(lres.size(), rres.size()); i++){
            vector<int> n;
            if(i < lres.size()){    
                for(int j = 0; j != lres[i].size(); j++)
                    n.push_back(lres[i][j]);
            }
            if(i < rres.size()){
                for(int j = 0; j != rres[i].size(); j++)
                    n.push_back(rres[i][j]);
            }
            res.push_back(n);
        }
        return res;
    }
};
