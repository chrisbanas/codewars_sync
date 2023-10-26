import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    Map<Character, Integer> seen = new HashMap<>();
    
    
    
    for (char c : text.toCharArray()) {
      char lower = Character.toLowerCase(c);
      if (seen.containsKey(lower)) {
        seen.put(lower, seen.get(lower) + 1);
      } else {
        seen.put(lower, 1);
      }
    }
    
    int output = 0;
    
    for (Map.Entry<Character, Integer> entry : seen.entrySet()) {
      if (entry.getValue() > 1) {
        output++;
      }
    }
    
    return output;
    
  }
}