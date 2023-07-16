package CrashCourse;

import javax.swing.text.html.StyleSheet;

public class Palindrom {
    public boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrom p = new Palindrom();
        String s1 = "racecar";
        System.out.println(p.checkIfPalindrome(s1));
        String s2 = "abba";
        System.out.println(p.checkIfPalindrome(s2));
        String s3 = "abb";
        System.out.println(p.checkIfPalindrome(s3));
    }
}
