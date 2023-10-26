// green > yellow > red > green
//

public class TrafficLights {

  public static String updateLight(String current) {
  
    return current == "green" ? "yellow" : 
      current == "yellow" ? "red" :
      current == "red" ? "green" : current;
  }
  
}