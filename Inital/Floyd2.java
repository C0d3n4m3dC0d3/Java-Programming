//FLOYD TRIANGLE
import java.util.Scanner;
class Floyd2
{
  public static void main(String[] args) {
    int i, j, val, n;
    System.out.print("Enter no. of rows:: ");
    Scanner ip = new Scanner(System.in);
    n = ip.nextInt();
    for(i = 0; i<n; i++)
    {
      val = i%2 == 0? 1 : 0;
      for(j = 0; j<=i; j++)
      {
        System.out.print(val + " ");
        val = val == 1? 0:1;
      }
      System.out.println();
    }
  }
}
