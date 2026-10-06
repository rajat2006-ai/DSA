class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        if (root.left == null && root.right == null) {
            ans.add("" + root.val);
            return ans;
        }

        for (String path : binaryTreePaths(root.left)) {
            ans.add(root.val + "->" + path);
        }

        for (String path : binaryTreePaths(root.right)) {
            ans.add(root.val + "->" + path);
        }

        return ans;
    }
}