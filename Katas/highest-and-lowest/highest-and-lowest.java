public class Kata {
  public static String highAndLow(String numbers) {
    
    String[] nums = numbers.split(" ");
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < nums.length; i++ ) {
      int current = Integer.parseInt(nums[i]);
      if (current > max) {
        max = current;
      }
      
      if (current < min) {
        min = current;
      }
    }
    
    return max + " " + min;
    
  }
}