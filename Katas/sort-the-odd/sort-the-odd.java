import java.util.*;

public class Kata {
  public static int[] sortArray(int[] array) {
    ArrayList<Integer> odds = new ArrayList<>();
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        odds.add(array[i]);
      }
    }
    
    Collections.sort(odds);
    
    int j = 0;
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        array[i] = odds.get(j);
        j++;
      }
    }
    
    return array;
    
  }
  
}

// Time O(nlog(n)) -> sorted data
// Space O(array.length) -> O(n)