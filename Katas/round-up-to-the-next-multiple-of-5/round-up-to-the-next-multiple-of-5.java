package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    if (number == 0) {
      return 0;
    } else if (number % 5 == 0) {
      return number;
    } else if (number < 0) {
      return number - (number % 5);
    } else if (number > 0) {
      return number + ( 5 - (number % 5));
    }
    
    return number + ( 5 - (number % 5));
  }
}