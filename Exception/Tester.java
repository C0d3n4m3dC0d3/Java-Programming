class Try
{
  public static void main(String args[])
  {
    int num1 = 2, num2 = 0;
    try
    {
      System.out.println("num1 = " + num1);
      System.out.println("num2 = " + num2);
      int c = num1/num2;
    }
    catch (ArithmeticException e )
    {
      System.out.println("Math Rule: Division by zero is not defined");
    }
    catch(Exception e)
    {
      System.out.println("Run time error! Error -- > " + e);
    }
  }
}
