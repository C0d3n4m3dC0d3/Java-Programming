abstract class Bike
{
  abstract void run();
}

class Honda extends Bike
{
  void run()
  {
    System.out.println("Honda is running safely!");
  }
  public static void main(String[] args)
  {
    Bike b1 = new Honda();
    b1.run();
  }
}
