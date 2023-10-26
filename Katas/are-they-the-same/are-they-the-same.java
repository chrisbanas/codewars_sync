import java.util.*;

public class AreSame {
 
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        Map<Integer, Integer> setA = new HashMap<>();
        Map<Integer, Integer> setB = new HashMap<>();

        for (int num : a) {
            setA.put(Math.abs(num), setA.getOrDefault(Math.abs(num), 0) + 1);
        }

        for (int num : b) {
            setB.put(num, setB.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {

            if (Math.sqrt(num) % 1 != 0 || (setA.containsKey((int) Math.sqrt(num)) && setB.get(num) != setA.get((int) Math.sqrt(num)))) {
                return false;
            }

            if (!setA.containsKey((int) Math.sqrt(num))) {
                return false;
            }
        }

        return true;

    }
}