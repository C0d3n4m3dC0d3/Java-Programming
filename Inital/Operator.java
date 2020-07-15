//Bitwise and Special Operators
import java.util.Scanner;
class Operator
{
  public static void main(String args[])
  {
    int a, b;
    System.out.print("Enter two numbers::");
    Scanner ip = new Scanner(System.in);
    a = ip.nextInt();
    b = ip.nextInt();
    System.out.println("You entered:\n"+ a + " = " +((byte)a));
    System.out.println(b + " = " + (byte)b);
    // BITWISE AND - OR - NOT
    System.out.println(a + " & " + b + " = " + (a&b));
    System.out.println("~"+ a + " = " + ~(a));
    System.out.println(a + " | " + b + " = " + (a|b));
  }
}
