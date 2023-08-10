package CrashCourse;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> source = new HashMap<>();
        HashMap<Character, Integer> target = new HashMap<>();

        for (Character c : magazine.toCharArray()) {
            source.put(c, source.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        System.out.println("source: " + source);
        System.out.println("target: " + target);

        for (Character c : target.keySet()) {
            int value = target.get(c);
            if (!source.containsKey(c)) {
                return false;
            } else {
                if (value > source.get(c)) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        RansomNote r = new RansomNote();
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println(r.canConstruct(ransomNote1, magazine1));
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(r.canConstruct(ransomNote2, magazine2));
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(r.canConstruct(ransomNote3, magazine3));

    }
}
