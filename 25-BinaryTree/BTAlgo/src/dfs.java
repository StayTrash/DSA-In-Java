public class dfs {
//    Uses:
//      In a BST -> when you want the lowest/lower value
//      In-order: leftmost first
//      Post Order: when you have to perform something on root node on last - > "when you want to delete a tree"
//
//
//      Definition for a binary tree node

//     * Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }



//    Q1: https://leetcode.com/problems/diameter-of-binary-tree/description/
//      Diameter of a binary tree

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        height(root);
        return diameter - 1;
    }

    int height(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;

    }

//    Q2: https://leetcode.com/problems/invert-binary-tree/description/
//      Invert binary tree

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

//    Q3: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
//      Maximum depth of binary tree

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int depth = Math.max(left, right) + 1;

        return depth;
    }

//    Q4: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
//      Convert Sorted Array to Binary Search Tree
//      we have done it already -> can use "avl trees" also

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
