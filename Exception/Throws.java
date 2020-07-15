import java.io.*;
class M
{
  void method() throws IOException
  {
    System.out.println("Inside method m");
    throw new IOException("Device Error!");
  }
}

public class Throws
{
  public static void main(String args[])
  {
    M m = new M();
    try
    {
      m.method();
    }
    catch(Exception e)
    {
      System.out.println(e);
      //System.out.println("Exception handled!");
    }
    System.out.println("Normal flow continues. . . ");
  }
}
