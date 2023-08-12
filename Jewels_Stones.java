package CrashCourse;

import java.util.HashMap;

public class Jewels_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashMap<Character, Integer> jewelsMap = new HashMap<>();
        HashMap<Character, Integer> stonesMap = new HashMap<>();

        for (Character c : jewels.toCharArray()) {
            jewelsMap.put(c, jewelsMap.getOrDefault(c, 0) + 1);
        }


        for (Character c : stones.toCharArray()) {
            stonesMap.put(c, stonesMap.getOrDefault(c, 0) + 1);
        }

        for (Character character : stonesMap.keySet()) {
            int value = stonesMap.get(character);
            if (jewelsMap.containsKey(character)) {
                ans += value;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        Jewels_Stones j = new Jewels_Stones();
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println(j.numJewelsInStones(jewels1, stones1));
        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(j.numJewelsInStones(jewels2, stones2));
    }
}
