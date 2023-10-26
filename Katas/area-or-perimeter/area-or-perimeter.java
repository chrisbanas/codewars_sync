// if length and width are equal square them
// if lenght and width are not equal multiple each by two and add them

public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        
      
        if (l == w) {
          return l * w;
        } else {
          return (l * 2) + ( w * 2);
        }
    }
}