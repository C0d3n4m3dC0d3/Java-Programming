//try-finally block without catch
class TryFinally
{
  public static void main(String args[])
  {
    int a = 100;
    System.out.println(a + " / 0 = ");
    try{
          System.out.println(a/0);
    }
    finally
    {
      System.out.println("See? This is why it is always advisable to handle the unchecked exceptions!\nHappy Coding!!");
    }
  }
}
