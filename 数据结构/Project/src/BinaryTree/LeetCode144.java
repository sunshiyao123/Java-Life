package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class LeetCode144 {
//    public static void main(String[] args) {
//
//    }
//}
// class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//
///**
// *根据指定的根节点root，返回其前序遍历的结果
// */
//class Solution {
//    private List<Integer> list = new ArrayList<Integer>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root == null)
//            return Collections.emptyList();
//        list.add(root.val);
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//        return list;
//    }
//}