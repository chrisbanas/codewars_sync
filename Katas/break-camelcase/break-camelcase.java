import java.util.*;

class Solution {
  public static String camelCase(String input) {
    StringBuilder output = new StringBuilder();
    
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        output.append(" ");
      }
      output.append(input.charAt(i));
    }
    
    return new String(output);
  }
}