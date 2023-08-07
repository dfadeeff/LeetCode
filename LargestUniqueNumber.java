package CrashCourse;

import java.util.HashMap;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        int maxNumber = -1;
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                maxNumber = Math.max(i, maxNumber);
            }
        }
        return maxNumber;
    }


    public static void main(String[] args) {
        LargestUniqueNumber l = new LargestUniqueNumber();
        int[] nums1 = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        System.out.println(l.largestUniqueNumber(nums1));
    }
}
