package CrashCourse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringNorepeating {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int left = 0, right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            ans = Math.max(ans, right - left + 1);
            map.put(s.charAt(right), right + 1);
            System.out.println(map);
        }
        return ans;
    }


    public static void main(String[] args) {
        LongestSubstringNorepeating l = new LongestSubstringNorepeating();
        String s1 = "abcabcbb";
        System.out.println(l.lengthOfLongestSubstring(s1));
        String s2 = "bbbbb";
        System.out.println(l.lengthOfLongestSubstring(s2));
        String s3 = "pwwkew";
        System.out.println(l.lengthOfLongestSubstring(s3));
        String s4 = "";
        System.out.println(l.lengthOfLongestSubstring(s4));
        String s5 = " ";
        System.out.println(l.lengthOfLongestSubstring(s5));
        String s6 = "c";
        System.out.println(l.lengthOfLongestSubstring(s6));
        String s7 = "au";
        System.out.println(l.lengthOfLongestSubstring(s7));
    }
}
