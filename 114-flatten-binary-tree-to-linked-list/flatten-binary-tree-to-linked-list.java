/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 
class Solution {

    public void flatten(TreeNode root) {
        if (root == null) return;

        ArrayList<TreeNode> arr = new ArrayList<>();
        dfs(root, arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            arr.get(i).left = null;
            arr.get(i).right = arr.get(i + 1);
        }

        arr.get(arr.size() - 1).left = null;
        arr.get(arr.size() - 1).right = null;
    }

    private void dfs(TreeNode root, ArrayList<TreeNode> arr) {
        if (root == null) return;

        arr.add(root);      // Preorder
        dfs(root.left, arr);
        dfs(root.right, arr);
    }
}