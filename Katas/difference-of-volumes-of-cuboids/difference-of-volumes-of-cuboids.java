public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int cubeA = firstCuboid[0];
    int cubeB = secondCuboid[0];
    
    for (int i = 1; i < firstCuboid.length; i++) {
      cubeA *= firstCuboid[i];
      cubeB *= secondCuboid[i];
    }
    
    return Math.abs(cubeA - cubeB);
    
  }
}