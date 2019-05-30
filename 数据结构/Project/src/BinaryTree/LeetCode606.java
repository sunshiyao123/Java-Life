package BinaryTree;

public class LeetCode606 {
    public static void main(String[] args) {

    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

class Solution {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode t) {
        if (t == null) {
            sb.append("()");
            return sb.toString();
        }
        sb.append(t.val+"("+tree2str(t.left)+")"+"("+t+tree2str(t.right)+")");

        return sb.toString();
    }
    private void tree2str(TreeNode t,)
}
