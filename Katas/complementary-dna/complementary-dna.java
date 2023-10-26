import java.util.*;

public class DnaStrand {
  public static String makeComplement(String dna) {
    StringBuilder output = new StringBuilder();
    
    for (char letter : dna.toCharArray()) {
      if (letter == 'T') {
        output.append('A');
      } else if (letter == 'A') {
        output.append('T');
      } else if (letter == 'C') {
        output.append('G');
      } else if (letter == 'G') {
        output.append('C');
      }
    }
    
    return output.toString();
  }
}