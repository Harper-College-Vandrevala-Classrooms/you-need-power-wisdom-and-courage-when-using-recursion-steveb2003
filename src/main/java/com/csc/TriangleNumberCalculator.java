package com.csc;

import java.util.Scanner;

public class TriangleNumberCalculator 
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a natural number: ");
    int n = in.nextInt();

    System.out.print("Please enter a second natural number: ");
    int m= in.nextInt();


    int triangle_number_n = value(n);
    System.out.printf("When n=%s, the triangular number is %s", n, triangle_number_n);

    int triangle_number_m =value_m(m);
      
    int triangular_sum = add(triangle_number_n,triangle_number_m);

    int triangular_difference= subtract(n=triangle_number_m,triangle_number_n);

    System.out.printf("\nWhen n=%s and m=%s, the sum of the triangle numbers is %s + %s = %s", n, m, triangle_number_n, triangle_number_m, triangular_sum);

    System.out.printf("\nWhen n=%s and m=%s, the difference of the triangle numbers is %s + %s = %s", n, m, triangle_number_n, triangle_number_m, triangular_difference);

    in.close();
  }
 
  public static int value(int n)
  {
    if (n <= 1)
    {
      return n;
    }
    return value(n-1) + n;
  }

  public static int value_m(int m)
  {
    if (m <= 1)
    {
      return m;
    }
    return value(m-1) + m;
  }

  public static int add( int triangle_number_n, int triangle_number_m)
  {
    int triangular_sum = triangle_number_m + triangle_number_n;
    return triangular_sum;
  }

  public static int subtract( int triangle_number_n, int triangle_number_m)
  {
    int triangular_difference = triangle_number_m - triangle_number_n;
    return triangular_difference;
  }
}





    
  /*public static boolean isInt(double possible_int)
  {
    return possible_int == (int) possible_int;
  }
  public static int value(int n)
  {
    if (n==1)
    {
      int triangle_number_n = 1;
    }
    else if (n<=0 || !isInt(n))
    {
      System.out.println("Please enter natural number");
      int triangle_number_n= -1;
    }
    else
    {
      int triangle_number_n = value(n-1);
    }
    return triangle_number_n;

  }  

}

*/