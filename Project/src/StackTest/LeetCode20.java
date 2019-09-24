package StackTest;
import java.util.Stack;
public class LeetCode20 {
    public static void main(String[] args) {
        String s = "]]]";
        System.out.println(new Solution().isValid(s));
    }

}
class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        String[] data = new String[s.length()];
        for (int i = 0;i < s.length();i++) {
            data[i] = s.substring(i,i+1);
        }
        int j = 0;
        while (j < data.length) {
            if (data[j].equals("(") || data[j].equals("{") || data[j].equals("[")) {
                stack.push(data[j]);
                j++;
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((data[j].equals(")") && stack.peek().equals("(")) ||
                        (data[j].equals("}") && stack.peek().equals("{")) ||
                        (data[j].equals("]") && stack.peek().equals("["))) {
                    stack.pop();
                    j++;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else
            return false;
    }
}
