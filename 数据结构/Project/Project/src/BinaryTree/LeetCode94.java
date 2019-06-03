//package BinaryTree;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//public class LeetCode94 {
//    private List<Integer> list = new ArrayList<Integer>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        return solution(root,list);
//    }
//    private List solution(Node node,List list) {
//        if(node == null) {
//            return list;
//        }
//        solution(node.left);
//        list.add(node.val);
//        solution(node.right);
//        return list;
//    }
//}

