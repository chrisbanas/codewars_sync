import java.util.*;
 

class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
          
      if (strarr == null || strarr.length == 0 || k <= 0 || k > strarr.length) {
        return "";
      }
      
      String longestStr = "";
      for (int i = 0; i <= strarr.length - k; i++) {
        StringBuilder currentConcat = new StringBuilder();
        for (int j = 0; j < k; j++) {
          currentConcat.append(strarr[i + j]);
        }
        if (currentConcat.length() > longestStr.length()) {
          longestStr = currentConcat.toString();
        }
      }
         
      return longestStr;
         
    }
}

// Time nears O(n2) in the worst case
// Space O(n)