package CrashCourse;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public int subarraySum(int[] nums, int k) {


        Map<Integer, Integer> counts = new HashMap<>();
        // initialize as 0 since empty array has sum 0
        counts.put(0, 1);
        int ans = 0;
        int curr = 0;

        for (int i : nums) {
            curr += i;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);

        }
        return ans;
    }


    public static void main(String[] args) {
        SubarraySumK s = new SubarraySumK();
        int[] nums1 = {1, 2, 1, 2, 1};
        int k1 = 2;
        System.out.println(s.subarraySum(nums1, k1));
    }
}
