package CrashCourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinConsecutiveCardsPickup {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if (!map.containsKey(cards[i])) {
                map.put(cards[i], new ArrayList<Integer>());
            }
            map.get(cards[i]).add(i);
        }


        int ans = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            List<Integer> arr = map.get(key);
            for (int i = 0; i < arr.size() - 1; i++) {
                ans = Math.min(ans, arr.get(i + 1) - arr.get(i) + 1);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        
        return ans;
    }


    public static void main(String[] args) {
        MinConsecutiveCardsPickup m = new MinConsecutiveCardsPickup();
        int[] cards1 = {3, 4, 2, 3, 4, 7};
        System.out.println(m.minimumCardPickup(cards1));
        int[] cards2 = {1, 0, 5, 3};
        System.out.println(m.minimumCardPickup(cards2));
    }
}
