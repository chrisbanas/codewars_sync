import java.util.*;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    Set<Integer> seen = new HashSet<>();

    for (int x : b) {
      seen.add(x);
    }

    List<Integer> output = new ArrayList<>();

    for (int x : a) {
      if (!seen.contains(x)) {
        output.add(x);
      }
    }

    return output.stream().mapToInt(Integer::intValue).toArray();

  }

}