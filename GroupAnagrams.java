package CrashCourse;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<String>());
            }
            groups.get(key).add(s);
        }
        return new ArrayList(groups.values());
    }


    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(g.groupAnagrams(strs1));
        String[] strs2 = {"a"};
        System.out.println(g.groupAnagrams(strs2));
    }
}
