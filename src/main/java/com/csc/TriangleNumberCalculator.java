package com.csc;

import java.util.ArrayList;
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

    int triangular_difference= subtract(triangle_number_m,triangle_number_n);

    int triangular_product = multiply(triangle_number_n, triangle_number_m);

    double triangular_quotient=divide(triangle_number_n, triangle_number_m);

    String Triangle_List= sequence(n);

    System.out.printf("\nWhen n=%s and m=%s, the sum of the triangle numbers is %s + %s = %s", n, m, triangle_number_n, triangle_number_m, triangular_sum);

    System.out.printf("\nWhen n=%s and m=%s, the difference of the triangle numbers is %s - %s = %s", n, m, triangle_number_n, triangle_number_m, triangular_difference);

    System.out.printf("\nWhen n=%s and m=%s, the product of the triangle numbers is %s * %s = %s", n, m, triangle_number_n, triangle_number_m, triangular_product);

    System.out.printf("\nWhen n=%s and m=%s, the quotient of the triangle numbers is %s / %s = %s", n, m, triangle_number_n, triangle_number_m, triangular_quotient);

    System.out.printf("\nThe sequence of triangle numbers leading to n=%s is: %s%n", n, Triangle_List);

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

  public static int multiply(int triangle_number_n, int triangle_number_m)
  {
    int triangular_product = triangle_number_m * triangle_number_n;
    return triangular_product;
  }

  public static double divide(int triangle_number_n, int triangle_number_m)
  {
    double n_divide = Double.valueOf(triangle_number_n);
    double m_divide = Double.valueOf(triangle_number_m);
    
    double triangular_quotient = n_divide/m_divide;
    return triangular_quotient;
  }

  public static String sequence(int n)
  {
    ArrayList<Integer> Triangle_Array_List = new ArrayList<>();
    for (int i=1; i<=n;i++)
    {
      int Triangle_index = value(n-(n-i));
      Triangle_Array_List.add(Triangle_index);
    }
    String Triangle_List= Triangle_Array_List.toString();
    return Triangle_List;
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