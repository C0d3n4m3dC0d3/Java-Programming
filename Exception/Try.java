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
      System.out.println("At the end of try block! Whoop! Whoop!");
    }
    catch(Exception e)
    {
      System.out.println("Run time error! Error -- > " + e);
    }
    catch (ArithmeticException e )
    {
      System.out.println("Inside catch block");
      System.out.println("Error!\nMath Rule: Division by zero is not defined");
    }
    System.out.println("At the end of the . . . world?? Haha! Nopee!\nIt's the end of the program!\nByee!");
  }
}
