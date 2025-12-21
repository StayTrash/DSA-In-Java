//import java.util.HashMap;
//import java.util.List;
import java.util.*;

public class AdvancedQues {
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

//    Q1: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//      Construct Binary Tree from Preorder and Inorder Traversal

        public TreeNode buildTree(int[] preOrder, int[] inOrder) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < inOrder.length; i++) {
                map.put(inOrder[i], i);
            }

            int[] index = {0};

            return helper(preOrder, inOrder, 0, preOrder.length-1, map, index);
        }

        public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
            if (left > right) {
                return null;
            }

            int current = preOrder[index[0]];
            index[0]++;

            TreeNode node = new TreeNode(current);

            if (left == right) {
                return node;
            }

            int inOrderIndex = map.get(current);

            node.left = helper(preOrder, inOrder, left, inOrderIndex - 1, map, index);
            node.right = helper(preOrder, inOrder, inOrderIndex + 1, right, map, index);

            return node;
    }

//    Q2: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/
//      Vertical Order Traversal of a Binary Tree

    public List<List<Integer>> verticalTraversal(TreeNode node) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if (node == null) {
            return ans;
        }

        int col = 0;

        Queue<Map.Entry<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        queue.offer(new AbstractMap.SimpleEntry<>(node, col));

        int min = 0;
        int max = 0;

        while(!queue.isEmpty()) {
            Map.Entry<TreeNode, Integer> removed = queue.poll();
            node = removed.getKey();
            col = removed.getValue();

            if (node != null) {
                if(!map.containsKey(col)) {
                    map.put(col, new ArrayList<Integer>());
                }

                map.get(col).add(node.val);

                min = Math.min(min, col);
                max = Math.max(max, col);

                queue.offer(new AbstractMap.SimpleEntry<>(node.left, col-1));
                queue.offer(new AbstractMap.SimpleEntry<>(node.right, col+1));
            }
        }

        for (int i=min; i <= max; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }

//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        List<int[]> nodes = new ArrayList<>();
//
//        // Step 1: DFS to collect all (col, row, val)
//        dfs(root, 0, 0, nodes);
//
//        // Step 2: Sort by col, then row, then value
//        nodes.sort((a, b) -> {
//            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);     // col
//            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);     // row
//            return Integer.compare(a[2], b[2]);                       // value
//        });
//
//        List<List<Integer>> result = new ArrayList<>();
//        int prevCol = Integer.MIN_VALUE;
//
//        // Step 3: Group by column
//        for (int[] node : nodes) {
//            int col = node[0], val = node[2];
//            if (col != prevCol) {
//                result.add(new ArrayList<>());
//                prevCol = col;
//            }
//            result.get(result.size() - 1).add(val);
//        }
//
//        return result;
//    }
//
//    // DFS helper to collect column, row, and value
//    private void dfs(TreeNode node, int row, int col, List<int[]> nodes) {
//        if (node == null) return;
//        nodes.add(new int[]{col, row, node.val});
//        dfs(node.left, row + 1, col - 1, nodes);   // Left child
//        dfs(node.right, row + 1, col + 1, nodes);  // Right child
//    }

//    Q3: https://leetcode.com/problems/word-ladder/
//      Word ladder

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int length = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            length++;

            for (int i = 0; i < size; i++) {
                String current = q.poll();

                for (int j = 0; j < current.length(); j++) {
                    char[] temp = current.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        temp[j] = c;
                        String newWord = new String(temp);

                        if (newWord.equals(endWord))
                            return length + 1;

                        if (wordList.contains(newWord) && !visited.contains(newWord)) {
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }

        return 0;
    }

//    class Solution {
//        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//            Set<String> set = new HashSet<>(wordList);
//            if(!set.contains(endWord)) return 0;
//
//            Queue<String> queue = new LinkedList<>();
//            queue.add(beginWord);
//
//            Set<String> visited = new HashSet<>();
//            queue.add(beginWord);
//
//            int changes = 1;
//
//            while(!queue.isEmpty()){
//                int size = queue.size();
//                for(int i = 0; i < size; i++){
//                    String word = queue.poll();
//                    if(word.equals(endWord)) return changes;
//
//                    for(int j = 0; j < word.length(); j++){
//                        for(int k = 'a'; k <= 'z'; k++){
//                            char arr[] = word.toCharArray();
//                            arr[j] = (char) k;
//
//                            String str = new String(arr);
//                            if(set.contains(str) && !visited.contains(str)){
//                                queue.add(str);
//                                visited.add(str);
//                            }
//                        }
//                    }
//                }
//                ++changes;
//            }
//            return 0;
//        }
//    }

//    Q4: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
//      Two Sum IV

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }
    private boolean helper(TreeNode node, int k, HashSet<Integer> set) {
        if(node == null) {
            return false;
        }
        if(set.contains(k - node.val)) {
            return true;
        }

        set.add(node.val);
        return helper(node.left, k, set) || helper(node.right, k , set);
    }

//    Q5: https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
//      Kth Smallest Element in a BST

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root, minHeap, k);

        // remove k elements
        int ans = 0;
        for(int i=0; i<k; i++) {
            ans = minHeap.poll();
        }
        return ans;
    }

    private void helper(TreeNode node, PriorityQueue<Integer> minHeap, int k) {
        if (node == null) {
            return;
        }

        helper(node.left, minHeap, k);

        minHeap.offer(node.val);

        helper(node.right, minHeap, k);
    }

//    private int k;
//    private int ans;
//
//    public int kthSmallest(TreeNode root, int k) {
//        this.k = k;
//        helper(root);
//        return ans;
//    }
//
//    private void helper(TreeNode node) {
//        if (node == null) {
//            return;
//        }
//
//        helper(node.left);
//
//        k--;
//        if(k==0) {
//            ans = node.val;
//            return;
//        }
//
//        helper(node.right);
//    }


}
