import java.util.*;

public class Kata {
  public static int findEvenIndex(int[] arr) {
    
    int sum = 0;
    
    for (int num : arr) {
      sum += num;
    }
    
    int tempSum = 0;
    
    for (int i = 0; i < arr.length; i++) {
      if (tempSum == sum - tempSum - arr[i]) {
        return i;
      }
      tempSum += arr[i];
    }
    return -1;
    
  }
}