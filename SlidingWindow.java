package CrashCourse;

public class SlidingWindow {

    public int lenWindow(int[] array, int k) {
        int left = 0;
        int cur = 0;
        int final_answer = 0;

        for (int right = 0; right < array.length; right++) {
            cur += array[right];
            while (cur > k) {
                cur -= array[left];
                left++;
            }
            final_answer = Math.max(final_answer, right - left + 1);
        }
        return final_answer;
    }


    public static void main(String[] args) {
        SlidingWindow s = new SlidingWindow();
        int[] array1 = {3, 2, 1, 3, 1, 1};
        int k1 = 5;
        System.out.println(s.lenWindow(array1, k1));
        int[] array2 = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k2 = 8;
        System.out.println(s.lenWindow(array2, k2));
    }
}
