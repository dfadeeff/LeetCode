package CrashCourse;

public class MinSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minL = Integer.MAX_VALUE;
        int currSum = 0;
        int currL = 0;

        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while (currSum >= target) {
                currSum -= nums[left];
                currL = right - left + 1;
                left++;
                minL = Math.min(currL, minL);
            }
        }

        return minL == Integer.MAX_VALUE ? 0 : minL;
    }

    public static void main(String[] args) {
        MinSizeSubarraySum m = new MinSizeSubarraySum();
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println(m.minSubArrayLen(target1, nums1));
        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println(m.minSubArrayLen(target2, nums2));
        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(m.minSubArrayLen(target3, nums3));
    }

}
