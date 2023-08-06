package CrashCourse;

import java.util.*;

public class CheckAllCharsEqualNumber {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //System.out.println(map);

        List<Integer> ans = new ArrayList<>();
        for (Character key : map.keySet()) {
            int value = map.get(key);
            ans.add(value);
        }

        //System.out.println(Arrays.toString(ans.toArray()));
        for (int i = 1; i < ans.size(); i++) {
            if (!Objects.equals(ans.get(i - 1), ans.get(i))) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        CheckAllCharsEqualNumber c = new CheckAllCharsEqualNumber();
        String s1 = "abacbc";
        System.out.println(c.areOccurrencesEqual(s1));
        String s2 = "aaabb";
        System.out.println(c.areOccurrencesEqual(s2));
        String s3 = "mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm";
        System.out.println(c.areOccurrencesEqual(s3));
    }

}
