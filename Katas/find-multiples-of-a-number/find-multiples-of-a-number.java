import java.util.*;

public class Multiples {
    public static int[] find(int base, int limit) {
      List<Integer> multiples = new ArrayList<>();
      
      int multiple = base;
      
      while (base <= limit) {
        multiples.add(base);
        base += multiple;
      }
      
      return multiples.stream().mapToInt(Integer::intValue).toArray();
      
    }
}