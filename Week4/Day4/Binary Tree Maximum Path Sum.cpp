int maxPathSum(TreeNode* root) {
    int maxSum = INT_MIN;
    function<int(TreeNode*)> dfs = [&](TreeNode* node) {
        if (!node) return 0;
        int left = max(0, dfs(node->left));
        int right = max(0, dfs(node->right));
        maxSum = max(maxSum, node->val + left + right);
        return node->val + max(left, right);
    };
    dfs(root);
    return maxSum;
}
