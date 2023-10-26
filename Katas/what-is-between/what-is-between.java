public class Kata {

  public static int[] between(int a, int b) {
    
    int length = Math.abs(a - b) + 1;
    
    int[] output = new int[length];
    
    for (int i = 0, j = a; i < length; i++) {
      output[i] = j;
      j++;
    }
    
    return output;
  }
}