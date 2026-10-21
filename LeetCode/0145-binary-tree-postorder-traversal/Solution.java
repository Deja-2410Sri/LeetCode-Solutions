class Solution {
    public void postorderHelper(TreeNode root, List<Integer> res) {
        if(root == null) return;

        postorderHelper(root.left, res);
        postorderHelper(root.right, res);
        res.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        postorderHelper(root, res);

        return res;
    }
}