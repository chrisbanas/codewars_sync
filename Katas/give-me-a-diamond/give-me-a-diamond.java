import java.util.*;

// The pattern is the first row is one and then increment by two untill we reach the mid point and the start to decrement

class Diamond {
  public static String print(int n) {
    if (n <= 0 || n % 2 == 0) {
      return null;
    }

    int diamonds = 1;

    StringBuilder output = new StringBuilder();

    for (int i = 1; i <= n; i++) {

      output.append(" ".repeat((n - diamonds) / 2));
      output.append("*".repeat(diamonds));
      output.append("\n");

      if (i <= n / 2) {
        diamonds += 2;
      } else {
        diamonds -= 2;
      }
    }

    return output.toString();

  }
}