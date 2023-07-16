package CrashCourse;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        while (low < high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(s));
    }


    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        r.reverseString(s1);
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        r.reverseString(s2);
    }
}
