import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int output = 0;
    
    for (int i = 0; i < stops.size(); i++) {
     for (int j = 0; j < stops.get(i).length; j++) {
       if (j % 2 == 0) {
         output += stops.get(i)[j];
       } else {
         output -= stops.get(i)[j];
       }
     }
    }
    
    return output;
    
  }
}