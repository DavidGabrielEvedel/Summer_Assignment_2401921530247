int diameterOfBinaryTree(TreeNode* root) {
    int diameter = 0;
    function<int(TreeNode*)> height = [&](TreeNode* node) {
        if (!node) return 0;
        int left = height(node->left);
        int right = height(node->right);
        diameter = max(diameter, left + right);
        return 1 + max(left, right);
    };
    height(root);
    return diameter;
}
