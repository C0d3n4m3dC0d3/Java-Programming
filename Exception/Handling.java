//Exception occurs, and we have provided try-catch block to handle it
class Handling
{
  public static void main(String args[])
  {
  String name = "Sreenidhi";
  System.out.println("My name is " + name);
  System.out.println("I come from India");
  try
  {
    System.out.print("My name as an integer is: ");
    int iname = Integer.parseInt(name);
    System.out.println(name);
  }
  catch(NumberFormatException n)
  {
    System.out.println("\nCannot convert " + name + " to integer.");
  }
  System.out.println("Cool, isn't it?");
  }
}
