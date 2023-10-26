public class Accumul {
    
    public static String accum(String s) {
     StringBuilder newWord = new StringBuilder();
      
      for (int i = 0; i < s.length(); i++) {
        char letter = s.charAt(i);
        newWord.append(Character.toUpperCase(letter));
       if (i > 0) {
         String repeatedLower = Character.toLowerCase(letter) + new String(new char[i-1]).replace("\0", Character.toLowerCase(letter) + "");
         newWord.append(repeatedLower);
       }

       if (i < s.length() - 1) {
         newWord.append("-");
       }
      }
       return newWord.toString();
    }
}