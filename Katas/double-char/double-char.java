public class Solution{
  public static String doubleChar(String s){
    StringBuilder output = new StringBuilder();
    
    for (int i = 0; i < s.length(); i++) {
      output.append(s.charAt(i));
      output.append(s.charAt(i));
    }
    
    return new String(output);
    
  }
}