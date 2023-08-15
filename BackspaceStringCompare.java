package CrashCourse;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                stackS.push(c);
            } else {
                if (!stackS.empty()) {
                    stackS.pop();
                }
            }
        }


        for (char c : t.toCharArray()) {
            if (c != '#') {
                stackT.push(c);
            } else {
                if (!stackT.empty()) {
                    stackT.pop();
                }
            }
        }

        return stackS.toString().equals(stackT.toString());
    }


    public static void main(String[] args) {
        BackspaceStringCompare b = new BackspaceStringCompare();
        String s1 = "ab#c";
        String t1 = "ad#c";
        System.out.println(b.backspaceCompare(s1, t1));

        String s2 = "ab##";
        String t2 = "c#d#";
        System.out.println(b.backspaceCompare(s2, t2));

        String s3 = "a#c";
        String t3 = "b";
        System.out.println(b.backspaceCompare(s3, t3));
    }
}
