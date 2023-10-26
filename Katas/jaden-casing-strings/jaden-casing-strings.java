import java.util.*;

public class JadenCase {

 public String toJadenCase(String phrase) {
  if (phrase == null || phrase.length() == 0) {
      return null;
    }
    
    String[] words = phrase.split(" ");
    
    List<StringBuilder> modifiedWords = new ArrayList<>();
    
    for (int i = 0; i < words.length; i++) {
      modifiedWords.add(new StringBuilder(words[i]));
    }
    
    for (StringBuilder modifiedWord : modifiedWords) {
        modifiedWord.setCharAt(0, Character.toUpperCase(modifiedWord.charAt(0)));
    }
    
    return String.join(" ", modifiedWords);
  
  
 }

}