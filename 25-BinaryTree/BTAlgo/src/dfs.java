import java.util.*;
//      https://www.geeksforgeeks.org/dsa/top-50-tree-coding-problems-for-interviews/
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

    class Node {
        public int val;
        public bfs.Node left;
        public bfs.Node right;
        public bfs.Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, bfs.Node _left, bfs.Node _right, bfs.Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

//    DFS using stack
    void dfsStack(Node node) {
        if(node == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            Node removed = stack.pop();
            System.out.print(removed.val + " ");

            if(removed.right != null) {
                stack.push(removed.right);
            }

            if(removed.left != null) {
                stack.push(removed.left);
            }
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

//    Q5: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
//      Flatten binary tree to linked list - Facebook

    public void flatten(TreeNode root) {
        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;

                while (temp.right != null) {
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }

            current = current.right;
        }
    }

//    Q6: https://leetcode.com/problems/validate-binary-search-tree/description/
//      Validate Binary Search Tree

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    public boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }

        if (low != null && node.val <= low) {
            return false;
        }

        if(high != null && node.val >= high) {
            return false;
        }

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;

    }

//    Q7: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
//      Lowest Common Ancestor of a Binary Tree

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;

    }

//    Q8: https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
//      Kth Smallest Element in a BST

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }
    public TreeNode helper(TreeNode root, int k) {
        if (root == null) {
            return null;
        }

        TreeNode left = helper(root.left, k);

        if (left != null) {
            return left;
        }

        count++;

        if(count == k) {
            return root;
        }

        return helper(root.right, k);
    }

//    Q9: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
//      Construct Binary Tree from Preorder and Inorder Traversal

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0) {
            return null;
        }

        int r = preorder[0];
        int index = 0;

        for(int i=0; i<inorder.length; i++) {
            if(inorder[i] == r) {
                index = i;
            }
        }

        TreeNode node = new TreeNode(r);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return node;

    }
//      Better solution - optimised
//int index = 0; // tracks position in preorder
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < inorder.length; i++) {
//            map.put(inorder[i], i); // map inorder value to its index
//        }
//        return helper(preorder, 0, inorder.length - 1, map);
//    }
//
//    private TreeNode helper(int[] preorder, int start, int end, HashMap<Integer, Integer> map) {
//        if (start > end) return null;
//
//        int rootVal = preorder[index++];
//        TreeNode node = new TreeNode(rootVal);
//
//        int inorderIndex = map.get(rootVal);
//
//        node.left = helper(preorder, start, inorderIndex - 1, map);
//        node.right = helper(preorder, inorderIndex + 1, end, map);
//
//        return node;
//    }

//    Q10: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
//      Serialize and Deserialize Binary Tree

//    public List<String> serialize(Node node) {
//        List<String> list = new ArrayList<>();
//        helper(node, list);
//        return list;
//    }
//    void helper(Node node, List<String> list) {
//        if (node == null) {
//            list.add("null");
//            return;
//        }
//
//        list.add(String.valueOf(node.val));
//
//        helper(node.left, list);
//        helper(node.right, list);
//    }
//
//    Node deserialize(List<String> list) {
//        Collections.reverse(list);
//        Node node = helper2(list);
//        return node;
//    }
//    Node helper(List<String> list) {
//        String val = list.remove(list.size() - 1);
//
//        if (val.charAt(0) == 'n') {
//            return null;
//        }
//
//        Node node = new Node(Integer.parseInt(val));
//
//        node.left = helper2(list);
//        node.right = helper2(list);
//
//        return node;
//    }

//    leetcode solution

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                sb.append("null,");
                continue;
            }

            sb.append(curr.val).append(",");
            q.add(curr.left);
            q.add(curr.right);
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("null")) return null;

        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();

            if (!arr[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;

            if (i < arr.length && !arr[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

//          Path Sums
//    Q11: https://leetcode.com/problems/path-sum/description/
//      Path Sum

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

//    Q11: https://leetcode.com/problems/sum-root-to-leaf-numbers/
//      Sum Root to Leaf Numbers

    public int sumNumbers(TreeNode root) {
        return helper1(root, 0);
    }
    int helper1(TreeNode node, int sum) {
        if(node == null) {
            return 0;
        }
        sum = sum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return helper1(node.left, sum) + helper1(node.right, sum);
    }

//    Q12: https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
//      Binary Tree Maximum Path Sum

    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0, left);
        right = Math.max(0, right);

        int pathSum = left + right + node.val;

        ans = Math.max(ans, pathSum);

        return Math.max(left, right) + node.val;
    }

//    Q13: Path exists in binary tree from root to leaf
//      arr: [3, 9 , 8, 5, 6] check if this is a valid path form root to leaf for a binary tree
//    https://www.geeksforgeeks.org/dsa/check-root-leaf-path-given-sequence/

//    boolean findPath(Node node, int[] arr) {
//        if (node == null) {
//            return arr.length == 0;
//        }
//        return helper(node, arr, 0);
//    }
//    boolean helper(Node node, int[] arr, int index) {
//        if(node == null) {
//            return false;
//        }
//        if(index >= arr.length || node.val != arr[index]) {
//            return false;
//        }
//        if(node.left == null && node.right == null && index = arr.length - 1) {
//            return true;
//        }
//        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
//    }


//    Q14: Number of Path exists in binary tree at any nodes

//    int countPaths(Node node, int sum) {
//        List<Integer> path = new ArrayList<>();
//        return helper(node, sum, path);
//    }
//    int helper(Node node, int sum, List<Integer> path) {
//        if(node == null) {
//            return 0;
//        }
//
//        path.add(node.val);
//        int count = 0;
//        int s = 0;
//        // how many paths I can make
//        ListIterator<Integer> itr = path.listIterator(path.size());
//        while (itr.hashPrevious()) {
//            s += itr.previous();
//
//            if (s == sum) {
//                count++;
//            }
//        }
//
//        count += helper(node.left, s, path) + helper(node.right, sum, path);
//
//        // backtrack
//        path.remove(path.size() - 1);
//        return count;
//
//    }

//    Q15: Number of Path exists in binary tree at any nodes and print all paths

//    List<List<Integer>> findPaths(Node node, int sum) {
//        List<List<Integer>> paths = new ArrayList<>();
//        List<Integer> path = new ArrayList<>();
//        helper(node, sum, path);
//        return paths;
//    }
//    void helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths) {
//        if(node == null) {
//            return 0;
//        }
//
//        path.add(node.val);
//
//        if (node.val == sum && node.left == null && node.right == null) {
//            paths.add(new ArrayList<>(path));
//        } else {
//            helper(node.left, sum-node.val, path, paths);
//            helper(node.right, sum-node.val, path, paths);
//        }
//
//        // backtrack
//        path.remove(path.size() - 1);
//    }
}
