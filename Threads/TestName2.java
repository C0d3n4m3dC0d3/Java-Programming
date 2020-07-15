class TestName2 extends Thread
{
  public void run()
  {
    System.out.println("I'm " + Thread.currentThread().getName() + "!");
    System.out.println("And, I'm running!");
  }

  public static void main(String args[])
  {
    TestName t1 = new TestName();
    t1.start();
  }
}
