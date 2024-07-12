package javaConditions;

public class Leap_year
{

  static int ISLP(int y)
  {
    if((y % 400 == 0) ||
       (y % 100 != 0) && 
       (y % 4 == 0))
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
 
  // Driver code
  public static void main(String[] args)
  {
    int year = 2023;
    System.out.println(ISLP(year));
  }
}
