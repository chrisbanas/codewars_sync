import java.util.*;

public class MexicanWave {

  public static String[] wave(String str) {
    String noSpaces = str.replace(" ", "");

    String[] output = new String[noSpaces.length()];

    int insert = 0;

    for (int i = 0; i < str.length(); i++) {

      char[] letters = str.toCharArray();

      while (i != str.length() - 1 && letters[i] == ' ') {
        i++;
      }
      if (i == str.length() - 1 && letters[i] == ' ') {
        break;
      }

      letters[i] = Character.toUpperCase(letters[i]);
      output[insert] = new String(letters);
      insert++;
    }

    return output;

  }
    
}