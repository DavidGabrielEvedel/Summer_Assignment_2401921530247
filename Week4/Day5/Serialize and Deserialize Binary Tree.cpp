class Codec {
public:
    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        if (!root) return "";
        string res;
        queue<TreeNode*> q;
        q.push(root);
        while (!q.empty()) {
            TreeNode* node = q.front(); q.pop();
            if (node) {
                res += to_string(node->val) + ",";
                q.push(node->left);
                q.push(node->right);
            } else {
                res += "null,";
            }
        }
        return res;
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        if (data.empty()) return nullptr;
        vector<string> vals;
        stringstream ss(data);
        string val;
        while (getline(ss, val, ',')) vals.push_back(val);

        TreeNode* root = new TreeNode(stoi(vals[0]));
        queue<TreeNode*> q;
        q.push(root);
        int i = 1;
        while (!q.empty() && i < vals.size()) {
            TreeNode* node = q.front(); q.pop();
            if (vals[i] != "null") {
                node->left = new TreeNode(stoi(vals[i]));
                q.push(node->left);
            }
            i++;
            if (i < vals.size() && vals[i] != "null") {
                node->right = new TreeNode(stoi(vals[i]));
                q.push(node->right);
            }
            i++;
        }
        return root;
    }
};
