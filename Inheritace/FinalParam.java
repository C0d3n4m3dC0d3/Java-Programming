class FinalParam
{
  public static void main(String[] args) {
   System.out.println("10 x 10 x 10 = " + cube(10));
  }

  static int cube(final int n)
  {
    n = n*n*n;
    return n;
  }
}

/*
  Output:
  Compile-time error: final parameter n may not be assigned.
*/
