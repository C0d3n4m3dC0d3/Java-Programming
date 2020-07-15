class Multi extends Thread
{
  public void run()
  {
    System.out.println("Thread is running!!");
  }
}

class Thread1
{
  public static void main(String args[]) {
    Multi m1 = new Multi();
    m1.start();
  }
}
