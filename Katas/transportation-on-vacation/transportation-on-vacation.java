// if the days is greater than 3 minus 20 from the final total
// if the days is greater than or equal to 7 minus 50 from the total

public class Kata {
  public static int rentalCarCost(int d) {
    int total = d * 40;
    return d >= 7 ? total - 50 : d >= 3 && d < 7 ? total - 20 : total;
  }
}