// Just a simple if check or even use module

public class Kata {
    public static int quarterOf(int month) {
        if (month > 9) {
          return 4;
        } else if ( month > 6) {
          return 3;
        } else if ( month > 3) {
          return 2;
        } else {
          return 1;
        }
    }
}