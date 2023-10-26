class Kata {
  public static String countingSheep(int num) {
    StringBuilder sheep = new StringBuilder();
    
    for ( int i = 1; i <= num; i++) {
      sheep.append(i + " sheep...");
    }
    
    return new String(sheep);
  }
}