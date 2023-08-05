package CrashCourse;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {
    public int countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] + 1)) {
                //count += map.get(arr[i] + 1);
                count += 1;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        CountingElements c = new CountingElements();
        int[] arr1 = {1, 2, 3};
        System.out.println(c.countElements(arr1));
        int[] arr2 = {1, 1, 3, 3, 5, 5, 7, 7};
        System.out.println(c.countElements(arr2));
        int[] arr3 = {1, 3, 2, 3, 5, 0};
        System.out.println(c.countElements(arr3));
    }
}
