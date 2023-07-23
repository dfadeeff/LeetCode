package CrashCourse;

public class MaxAverageSubarray1 {

    public double findMaxAverage(int[] nums, int k) {
        double curr = 0.0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        double avg = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            avg = Math.max(curr, avg);
        }

        return avg / k;
    }

    public static void main(String[] strings) {
        MaxAverageSubarray1 m = new MaxAverageSubarray1();
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println(m.findMaxAverage(nums1, k1));


        int[] nums2 = {5};
        int k2 = 1;
        System.out.println(m.findMaxAverage(nums2, k2));

        int[] nums3 = {3, 3, 4, 3, 0};
        int k3 = 3;
        System.out.println(m.findMaxAverage(nums3, k3));

    }
}
