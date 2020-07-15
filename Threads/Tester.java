class Tester extends Thread
{
  public void run()
  {
    for(int i = 0; i<2; i++)
    {
      try
      {
        Thread.State state = Thread.currentThread().getState();
        System.out.println("Thread State is : " + state);
        Thread.sleep(500);
      }
      catch(InterruptedException e)
      {
        System.out.println(e);
      }n
    }
  }

  public static void main(String args[])
  {
    Tester t = new Tester();
    t.start();
    Thread.State state = Thread.currentThread().getState();
    System.out.println("Thread State is : " + state);
  }
}
