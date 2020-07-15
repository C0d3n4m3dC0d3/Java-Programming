class A
{
  protected void msg()
  {
    System.out.println("Hello java");
  }
}

public class Simple extends A
{
  void msg()
  {
    System.out.println("Hello Java");
  }

  public static void main(String[] args)
  {
      Simple obj = new Simple();
      obj.msg();
  }
}
