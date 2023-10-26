// Use a HashMap to keep count and then re iterate over the string checking the hash map for if its count is greater than 1

import java.util.HashMap;
import java.util.Map;


public class DuplicateEncoder {
 static String encode(String word){
    
    System.out.println(word);
    
    Map<Character, Integer> bank = new HashMap<>();
    
    for (int i = 0; i < word.length(); i++) {
      char letter = Character.toLowerCase(word.charAt(i));
      if (bank.containsKey(letter)) {
        bank.put(letter, bank.get(letter) + 1);
      } else {
        bank.put(letter, 1);
      }
    }
    
    StringBuilder output = new StringBuilder();
    
    for (int i = 0; i < word.length(); i++) {
      char letter = Character.toLowerCase(word.charAt(i));
      if (bank.get(letter) == 1) {
        output.append('(');
      } else {
        output.append(')');
      }
    }
    
    return new String(output);
    
  }
}