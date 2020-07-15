class Test4 extends Thread
{
  public void run()
  { 
    System.out.println(" Running Thread is : " + Thread.currentThread().getName());
    System.out.println(" Running Thread Priority is : " + Thread.currentThread().getPriority());
  }

  public static void main(String args[])
  {
    Test4 t1 = new Test4();
    Test4 t2 = new Test4();
    
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();
  }
}