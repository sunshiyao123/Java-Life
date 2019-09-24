package BinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode100 {
    public static void main(String[] args) {
        for (int i = 1;i < 4;i++) {
            TreeNode newNode = new TreeNode(i);

        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    List<Integer> list = new ArrayList<Integer>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        solution(p,sb1);
        String a = sb1.toString();
        solution(q,sb2);
        String b = sb2.toString();
        return a.equals(b);
    }
    private void solution(TreeNode t,StringBuilder sb) {
        if(t == null) {
            sb.append("null");
            return;
        }
        solution(t.left,sb);
        sb.append(t.val);
        solution(t.right,sb);
        return;
    }
}