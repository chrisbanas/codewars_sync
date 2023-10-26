import java.util.*;

public class Kata {
    public static String reverseLetter(final String str) {
      StringBuilder output = new StringBuilder();
      
      for (int i = str.length() - 1; i >= 0; i--) {
        if (Character.isLetter(str.charAt(i))) {
          output.append(str.charAt(i));
        }
      }
      
      return output.toString();
    }
}