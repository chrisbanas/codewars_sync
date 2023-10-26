import java.util.*;

public class Kata {
  public static String shortcut(String input) {
      StringBuilder output = new StringBuilder();
    
    for (char c : input.toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        continue;
      } else {
        output.append(c);
      }
    }
    
    return output.toString();
    
  }
}