public class Sum{
  public int GetSum(int a, int b){
    
    int output = 0;
    
    int bigger = Math.max(a, b);
    int smaller = Math.min(a, b);
    
    for (int i = smaller; i <= bigger; i++) {
      output += i;
    }
    
    return output;
    
  }
}