package p1;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        frequency(arr);
    }

    public static void frequency(int[] arr) {
        int len = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < len; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1); // Change i to 0
        }

        for (Map.Entry<Integer, Integer> map : mp.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
