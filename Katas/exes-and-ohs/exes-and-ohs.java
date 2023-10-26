public class XO {
  
  public static boolean getXO (String str) {
    
    int countX = 0;
    int countO = 0;
      
      for (int i = 0; i < str.length(); i++) {
        char letter = Character.toLowerCase(str.charAt(i));
        if (letter == 'x') {
          countX++;
        } else if (letter == 'o') {
          countO++;
        } 
      }
    
    return countX == countO;
    
  }
}