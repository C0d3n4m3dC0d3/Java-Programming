import java.util.Scanner;
class Evaluate
{
  public static void main(String[] args) {
      int x, y = 0;
      System.out.print("Enter value for x :: ");
      Scanner ip = new Scanner(System.in);
      x = ip.nextInt();

      if(x != 0)
      {
        if(!(x<0))
          y = 1;
        if(!(x>0))
          y = -1;
      }
      System.out.println("y = "+y);
  }
}
