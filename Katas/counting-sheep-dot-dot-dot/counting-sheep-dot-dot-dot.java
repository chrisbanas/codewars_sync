public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    
    int count = 0;
      for (Boolean sheep : arrayOfSheeps) {
        if (sheep == null){
         
          } else if (sheep) {
          count++;
        }
      }
    
    return count;
  }
}