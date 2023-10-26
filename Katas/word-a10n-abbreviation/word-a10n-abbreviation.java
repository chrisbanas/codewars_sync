// the number is easy it is just the length of the word minus 2

public class Abbreviator {

  public String abbreviate(String string) {
   
    
    StringBuilder newString = new StringBuilder(string);
    String[] words = string.split("[^a-zA-Z]");

    for (String word : words) {
      int wordLength = word.length();
      if (wordLength > 3) {
        StringBuilder newWord = new StringBuilder();
        char first = word.charAt(0);
        char last = word.charAt(wordLength - 1);
        int charsNum = wordLength - 2;
        String charsNumString = Integer.toString(charsNum);
        newWord.append(first).append(charsNumString).append(last);
        int wordStartIndex = newString.indexOf(word);
        int wordEndIndex = wordStartIndex + wordLength;
        newString.replace(wordStartIndex, wordEndIndex, newWord.toString());  
      }
    }
    return newString.toString();
  }

}