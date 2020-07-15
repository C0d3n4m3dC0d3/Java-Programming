class Multi1 implements Runnable
{
  public void run()
  {
    System.out.println("Thread is runnin'");
  }
}

class Thread2
{
  public static void main(String args[]){
    Multi1 m1 = new Multi1();
    Thread t = new Thread(m1);
    t.start();
  }
}
