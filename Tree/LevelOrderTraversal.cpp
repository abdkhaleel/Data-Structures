/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        if(root == nullptr) return {};
        vector<vector<int>> res;
        queue<TreeNode*> que;
        que.push(root);
        while(!que.empty()){
            int level = que.size();
            vector<int> vec;
            for(int i = 0; i < level; i++){
                root = que.front();
                que.pop();
                vec.push_back(root->val);
                if(root->left != nullptr) que.push(root->left);
                if(root->right != nullptr) que.push(root->right);
            }
            res.push_back(vec);
        }
        return res;

    }
};