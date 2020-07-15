class TestPriority extends Thread
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName() +
    " Priority - " + getPriority());
  }
  public static void main(String args[])
  {
    TestPriority t1 = new TestPriority();
    TestPriority t2 = new TestPriority();
    TestPriority t3 = new TestPriority();

    t2.setPriority(NORM_PRIORITY);
    t1.setPriority(MIN_PRIORITY);
    t3.setPriority(MAX_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
  }
}
