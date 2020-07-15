/*
  15. Write a program to demonstrate a division by zero exception.
*/

import java.util.Scanner;
class DivZero
{
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    int a, result;
    System.out.print("Enter a number: ");
    a = ip.nextInt();
    try{
      System.out.print(a + "/0 = ");
      result = a/0;
    }
    catch(ArithmeticException e)
    {
      System.out.println("Not defined");
      System.out.println("! ! ! Division by zero error ! ! !");
    }
  }
}
