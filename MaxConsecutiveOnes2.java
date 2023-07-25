package CrashCourse;

public class MaxConsecutiveOnes2 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int curr = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                curr++;
            }
            while (curr > k) {
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes2 m = new MaxConsecutiveOnes2();
        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        System.out.println(m.longestOnes(nums1, k1));
    }
}
