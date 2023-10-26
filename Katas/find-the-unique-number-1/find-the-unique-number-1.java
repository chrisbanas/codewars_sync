import java.util.*;

 public class Kata {
    public static double findUniq(double arr[]) {
      Map<Double, Integer> seen = new HashMap<>();
      
      for (double num : arr) {
        if (seen.containsKey(num)) {
          seen.put(num, seen.get(num) + 1);
        } else {
          seen.put(num, 1);
        }
      }
      
      for (Map.Entry<Double, Integer> entry : seen.entrySet()) {
        if (entry.getValue() == 1) {
          return entry.getKey();
        }
      }
      
      return 0.0;
      
      
    }
}