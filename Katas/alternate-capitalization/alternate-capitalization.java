import java.util.*;

class Solution{
    public static String[] capitalize(String s){
      StringBuilder s1 = new StringBuilder();
      StringBuilder s2 = new StringBuilder();
      
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {
          s1.append(Character.toUpperCase(s.charAt(i)));
          s2.append(Character.toLowerCase(s.charAt(i)));
        } else {
          s1.append(Character.toLowerCase(s.charAt(i)));
          s2.append(Character.toUpperCase(s.charAt(i)));
        }
      }
      
      return new String[]{s1.toString(), s2.toString()};
      
    }
}