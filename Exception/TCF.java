//try-catch-finally
class TCF
{
  public static void main(String args[])
  {
    System.out.println("100/0 vs 100/5");
    System.out.println("Let's see who wins!");
    try
    {
      System.out.println("100/0 wins!!\nScore = " + (100/0));
    }
    catch(ArithmeticException e)
    {
      System.out.println("100/0 lost! boo-hoo, cannot divide by zero!");
    }
    finally
    {
      System.out.println("100/5 wins!!\nScore = " + (100/5));
    }
  }
}
