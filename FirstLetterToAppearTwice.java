package CrashCourse;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {

            if (set.contains(c)) {
                return c;
            }
            set.add(c);
        }
        return 0;
    }


    public static void main(String[] args) {
        FirstLetterToAppearTwice f = new FirstLetterToAppearTwice();
        String s1 = "abccbaacz";
        System.out.println(f.repeatedCharacter(s1));
        String s2 = "abcdd";
        System.out.println(f.repeatedCharacter(s2));
    }
}
