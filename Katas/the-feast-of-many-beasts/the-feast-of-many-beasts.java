public class Kata {

  public static boolean feast(String beast, String dish) {
    
    int beastLastIndex = beast.length() - 1;
    int dishLastIndex = dish.length() - 1;
    
    char beastFirst = beast.charAt(0);
    char beastLast = beast.charAt(beastLastIndex);
      
    char dishFirst = dish.charAt(0);
    char dishLast = dish.charAt(dishLastIndex);
      
    return beastFirst == dishFirst && beastLast == dishLast;
      
    
  }
  
}
  