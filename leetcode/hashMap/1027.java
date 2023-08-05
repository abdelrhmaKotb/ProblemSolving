import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 1, 1, 3 };
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 0);
            }
        }

        Set<Integer> set = new HashSet<>();

        for (int val : map.values()) {
            if (!set.add(val)) {
                return false;
            }
        }

        return true;
    }
}