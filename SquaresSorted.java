package CrashCourse;

import java.util.Arrays;

public class SquaresSorted {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        SquaresSorted s = new SquaresSorted();
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(s.sortedSquares(nums1));
        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(s.sortedSquares(nums2));
    }
}
