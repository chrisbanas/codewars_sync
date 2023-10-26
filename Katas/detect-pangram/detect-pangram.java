import java.util.*;

public class PangramChecker {
  public boolean check(String sentence){
    Set<Character> seen = new HashSet<>();
    
    for (char c : sentence.toCharArray()) {
      if (Character.isLetter(c)) {
        seen.add(Character.toLowerCase(c));
      }
    }
    
    return seen.size() == 26;
    
  }
}