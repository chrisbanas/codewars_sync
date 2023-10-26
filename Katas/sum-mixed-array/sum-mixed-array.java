import java.util.List;
import java.util.*;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
 public int sum(List<?> mixed) { 
    int sum = 0;
    
    for (Object object : mixed) {
      if (object instanceof Integer) {
        sum += (Integer) object;
      } else if (object instanceof String) {
        try {
          int num = Integer.parseInt((String) object);
          sum += num;
        } catch (Exception e) {
          // By leaving this blank it ingores non numeric strings
        }
      }
    }
    
    return sum;
  }
  
}