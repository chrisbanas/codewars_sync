public class Square {    
    public static boolean isSquare(int n) {        
      if (n < 0) return false;
      if (n == 0) return true;

      int count = 1;
      while (count * count <= n) {
        if (count * count == n) return true;
        count++;
      }
      
      return false;
    }
}