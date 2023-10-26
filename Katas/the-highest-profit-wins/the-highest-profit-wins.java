class MinMax {
    public static int[] minMax(int[] arr) {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      
      int[] output;
      
      for (int num : arr) {
        if (num < min) {
          min = num;
        } 
        if (num > max) {
          max = num;
        }
      }
      
      output = new int[]{min, max};
      
      return output;
      
    }
}