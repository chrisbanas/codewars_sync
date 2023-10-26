public class Kata {
  public static String reverseWords(final String original) {
    
    if (original == " " || original == null) {
      return original;
    }
    
    boolean allSpace = true;
    
    for (char letter : original.toCharArray()) {
      if (letter != ' ') {
        allSpace = false;
        break;
      }
    }
    
    if (allSpace) {
      return original;
    }
    
    String[] words = original.split(" ");   
    StringBuilder reversedSentence = new StringBuilder();
    
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      reversedSentence.append(reverse(word));
      if (i != words.length - 1) {
        reversedSentence.append(" ");
      }
    }
    
    return reversedSentence.toString();

  }
  
  public static String reverse(String word) {
    char[] letters = word.toCharArray();
    
    for (int i = 0; i < word.length() / 2; i++) {
      char temp = letters[i];
      letters[i] = letters[word.length() - 1 - i];
      letters[word.length() - 1 - i] = temp;
    }
    
    return new String(letters);
  }
}