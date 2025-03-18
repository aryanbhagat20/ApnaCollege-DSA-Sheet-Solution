import java.util.* ;
//Valid Parentheses - Google Adobe Flipkart Deloitte
//Leetcode - 20
//Time : O(n) and Space : O(n)

public class Strings_Easy3 {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>() ;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
            return stack.isEmpty() ;
    }

    public static void main(String[] args) {
        String s = "()[]{}" ;
        System.out.print("Are the given strings valid Parentheses? :" + isValid(s)) ;
    }
}
