class StaticBlock
{
  static
  {
    System.out.println("So, here's our first static block!");
  }

  static
  {
    System.out.println("This is our second one!");
    System.out.println("Camel Case detected . . .");
  }

  static int a = 10;

  public static void main(String[] args) {
    System.out.println("The main method has begun execution . . . ");
    System.out.println("Cube of " + a + " = " + cube());
  }

  static int cube ()
  {
    return a*a*a;
  }

  static
  {
    System.out.println("This is our final static block!");
    a = 2;
  }
}
