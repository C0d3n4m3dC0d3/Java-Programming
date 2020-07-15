//User-defined Exception
class PayOutOfBoundsException extends Exception{
  PayOutOfBoundsException(String s)
  {
    super(s);
  }
}

class Teeest
{
  static void validate(int pay) throws PayOutOfBoundsException
  {
    if(pay>5000)
      throw new PayOutOfBoundsException("Pay is out of Bounds.");
    else
      System.out.println("Here is your pay: " + pay);
  }

  public static void main(String args[])
  {
    try
    {
      validate(4000);
      validate(6000);
    }
    catch(PayOutOfBoundsException e)
    {
      System.out.println(e);
    }
  }
}
