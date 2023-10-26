import java.util.*;

class Persist {
 public static int persistence(long n) {
    
    if (n < 10) {
      return 0;
    }
    
  int output = 0;
       
    while (multiplyDigits(n) > 9) {
      output++;
      n = multiplyDigits(n);
    }
    
    return ++output;
    
 }
  
  public static long multiplyDigits(long n) {
 
    long output = n % 10;
    n /= 10;
    
    while (n > 9) {
      output *= n % 10;
      n /= 10;
    }
    
    output *= n % 10;
    
    return output;
    
  }
}