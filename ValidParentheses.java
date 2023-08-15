package CrashCourse;

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> matching = new HashMap();
        matching.put('(', ')');
        matching.put('{', '}');
        matching.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // c opening bracket
            if (matching.containsKey(c)) {
                stack.push(c);
            } else {
                // checking closing bracket, early exit condition
                if (stack.empty()) {
                    return false;
                }
                char previousOpening = stack.pop();
                if (matching.get(previousOpening) != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }


    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s1 = "()";
        System.out.println(v.isValid(s1));
        String s2 = "()[]{}";
        System.out.println(v.isValid(s2));
        String s3 = "(]";
        System.out.println(v.isValid(s3));
    }
}
