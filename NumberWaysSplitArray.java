package CrashCourse;

import java.util.Arrays;

public class NumberWaysSplitArray {
    public int waysToSplitArray(int[] nums) {
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            long leftSum = prefixSum[i];
            long rightSum = prefixSum[prefixSum.length - 1] - leftSum;
            
            if (leftSum >= rightSum) {
                ans += 1;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        NumberWaysSplitArray n = new NumberWaysSplitArray();
        int[] nums1 = {10, 4, -8, 7};
        System.out.println(n.waysToSplitArray(nums1));
        int[] nums2 = {2, 3, 1, 0};
        System.out.println(n.waysToSplitArray(nums2));
        int[] nums3 = {-1, -2};
        System.out.println(n.waysToSplitArray(nums3));
    }
}
