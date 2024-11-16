package Q15.getOddTimesElementHashing;

import java.util.HashMap;

public class usingHashing {
    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Print numbers with odd frequencies
        for (int num : mp.keySet()) {
            if (mp.get(num) % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}