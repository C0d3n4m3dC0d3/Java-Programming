/*
  17. Write a small program to catch Negative Array Size Exception.
  This exception is caused when the array is initialised to
  negative values.
*/
import java.util.Scanner;
class NegArrSize
{
  public static void main(String[] args) {
    int size, arr[];
    System.out.print("Enter size: ");
    Scanner ip = new Scanner(System.in);
    size = ip.nextInt();
    try{
      arr = new int[size];
    }
    catch(NegativeArraySizeException e){
      System.out.println("Error! Cannot create array!\nNegative Array Size!");
    }
  }
}
