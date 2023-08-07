package CrashCourse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaxNumberBalloons {
    public int maxNumberOfBalloons(String text) {
        String target = "balloon";
        HashMap<Character, Integer> masterMap = new HashMap<>();
        Set<Character> masterSet = new HashSet<>();

        for (Character c : target.toCharArray()) {
            masterSet.add(c);
        }

        for (Character c : target.toCharArray()) {
            masterMap.put(c, masterMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Set<Character> candidateSet = new HashSet<>();
        for (Character c : text.toCharArray()) {
            candidateSet.add(c);
        }


        int minMultiple = Integer.MAX_VALUE;
        for (Character c : masterMap.keySet()) {
            if (map.containsKey(c) && candidateSet.containsAll(masterSet)) {
                int multiple = map.get(c) / masterMap.get(c);
                minMultiple = Math.min(multiple, minMultiple);
            }
        }


        return minMultiple == Integer.MAX_VALUE ? 0 : minMultiple;
    }


    public static void main(String[] args) {
        MaxNumberBalloons m = new MaxNumberBalloons();
        String text1 = "nlaebolko";
        System.out.println(m.maxNumberOfBalloons(text1));
        String text2 = "loonbalxballpoon";
        System.out.println(m.maxNumberOfBalloons(text2));
        String text3 = "leetcode";
        System.out.println(m.maxNumberOfBalloons(text3));
        String text4 = "lloo";
        System.out.println(m.maxNumberOfBalloons(text4));
    }
}
