import java.util.Stack;

// https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/
class Q5MinInsertionsToBalanceParenthesis {
//    public int minInsertions(String s) {
//        int res = 0, right = 0;
//
//        for (int i = 0; i < s.length(); ++i) {
//            if (s.charAt(i) == '(') {
//                if (right % 2 > 0) {
//                    right--;
//                    res++;
//                }
//                right += 2;
//            } else {
//                right--;
//                if (right < 0) {
//                    right += 2;
//                    res++;
//                }
//            }
//        }
//        return right + res;
//    }

    class Solution {
        public int minInsertions(String s) {
            Stack<Character> stack = new Stack<>();
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push('('); // Push opening bracket
                } else {
                    if (stack.isEmpty()) {
                        // No matching '(' found
                        if (i != s.length() - 1 && s.charAt(i + 1) == ')') {
                            count++; // One insertion needed
                            i++; // Skip next ')'
                        } else {
                            count += 2; // Need two insertions
                        }
                    } else {
                        // Matching '(' found
                        if (i != s.length() - 1 && s.charAt(i + 1) == ')') {
                            stack.pop();
                            i++; // Skip next ')'
                        } else {
                            count++; // Need one more ')'
                            stack.pop();
                        }
                    }
                }
            }

            return count + stack.size() * 2; // Each unmatched '(' needs two ')'
        }
    }
}