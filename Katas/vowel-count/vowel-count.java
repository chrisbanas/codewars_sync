import java.util.Set;

public class Vowels {

  public static int getCount(String str) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
    
    int countVowels = 0;
    
    for (int i = 0; i < str.length(); i++) {
      if (vowels.contains(str.charAt(i))) {
        countVowels++;
      }
    }
    
    return countVowels;
    
  }

}