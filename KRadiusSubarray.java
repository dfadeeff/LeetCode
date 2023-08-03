package CrashCourse;

import java.util.Arrays;

public class KRadiusSubarray {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        long[] prefixSum = new long[nums.length + 1];

        for (int i = 0; i < prefixSum.length - 1; i++) {
            prefixSum[i + 1] += nums[i] + prefixSum[i];
        }
//        System.out.println(Arrays.toString(prefixSum));


        for (int i = k; i < ans.length - k; i++) {
            long SumComponent = prefixSum[k + i + 1] - prefixSum[i - k];
            ans[i] = (int) (SumComponent / (2 * k + 1));
        }
        return ans;
    }


    public static void main(String[] args) {
        KRadiusSubarray k = new KRadiusSubarray();
        int[] nums1 = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k1 = 3;
        System.out.println(Arrays.toString(k.getAverages(nums1, k1)));
        int[] nums2 = {100000};
        int k2 = 0;
        System.out.println(Arrays.toString(k.getAverages(nums2, k2)));
        int[] nums3 = {8};
        int k3 = 100000;
        System.out.println(Arrays.toString(k.getAverages(nums3, k3)));
    }
}
