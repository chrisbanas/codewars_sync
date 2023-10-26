import java.util.*;


public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
      Map<Integer, Integer> seen = new HashMap<>();
      
      int[] output = new int[2];
      
      for (int i = 0; i < numbers.length; i++) {
        int complement = target - numbers[i];
        
        if (seen.containsKey(complement)) {
          output[0] = seen.get(complement);
          output[1] = i;
          break;
        } else {
          seen.put(numbers[i], i);
        }
      }
      
      return output;
    }
}