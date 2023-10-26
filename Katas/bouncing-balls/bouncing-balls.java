public class BouncingBall {
 
  public static int bouncingBall(double h, double bounce, double window) {
    if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
      int output = 1;

      while (h > window) {
        h *= bounce;
        output += 2;
      }

      output -= 2;
      return output;

    } else {
      return -1;
    }
  }
}

// Time O(log(bounce)) -> O(log(n))
//Space O(1)