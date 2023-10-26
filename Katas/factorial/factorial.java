import java.util.*;

public class Factorial {

  public int factorial(int n) {
    
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException();
    }
    
    int output = 1;
    
    while (n > 0) {
      output *= n;
      n--;
    }
    
    return output;
    
  }
}