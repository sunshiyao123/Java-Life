//package BinaryTree;
//
//public class LeetCode606 {
//    public static void main(String[] args) {
//
//    }
//}
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
// }
//
//class Solution {
//    StringBuilder sb = new StringBuilder();
//    public String tree2str(TreeNode t) {
//        StringBuilder sb = new StringBuilder();
//        tree2str(t,sb);
//        return sb.toString();
//    }
//    private void tree2str(TreeNode t,StringBuilder res) {
//        if (t == null) {
//            return;
//        }
//        res.append(t.val);
//        if (t.left == null && t.right != null) {
//            res.append("()");
//        }
//        if (t.left != null) {
//            res.append("(");
//            tree2str(t.left,res);
//            res.append(")");
//        }
//        if (t.right != null) {
//            res.append("(");
//            tree2str(t.right,res);
//            res.append(")");
//        }
//        return;
//    }
//}
