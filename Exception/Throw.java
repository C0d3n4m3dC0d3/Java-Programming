//throw keyword
class Throw
{
  static void checkValidity(int year)
  {
    if(year < 2020)
      throw new RuntimeException("This product is outdated! Please replace ASAP.");
    else
      System.out.println("Your product has not expired yet. Happy using!!");
  }
  public static void main(String args[])
  {
    try
    {
      checkValidity(2019);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
