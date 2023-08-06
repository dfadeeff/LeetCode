package CrashCourse;

import java.util.*;

public class IntersectionArrays {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int[] arr : nums) {
            for (int i : arr) {
                counts.put(i, counts.getOrDefault(i, 0) + 1);
            }
        }

        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for (int key : counts.keySet()) {
            int value = counts.get(key);
            if (value == n) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }


    public static void main(String[] args) {
        IntersectionArrays i = new IntersectionArrays();
        int[][] nums1 = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        System.out.println(i.intersection(nums1));
    }
}
