package CrashCourse;

import java.util.Arrays;

public class RunningSum1DArray {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int cum = nums[0];
        answer[0] = cum;
        for (int i = 1; i < nums.length; i++) {
            cum += nums[i];
            answer[i] = cum;

        }
        return answer;
    }


    public static void main(String[] args) {
        RunningSum1DArray r = new RunningSum1DArray();
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(r.runningSum(nums1)));
        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(r.runningSum(nums2)));

    }

}
