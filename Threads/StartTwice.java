class StartTwice extends Thread
{
  public void run()
  {
    System.out.println("I'm runnin'");
  }
  public static void main(String args[])
  {
    StartTwice t = new StartTwice();
    t.start();
    System.out.println("Starting thread again . . . ");
    t.start();
  }
}

/*
OUTPUT:
Starting thread again . . .
I'm runnin'
Exception in thread "main" java.lang.IllegalThreadStateException
at java.lang.Thread.start(Thread.java:708)
at StartTwice.main(StartTwice.java:12)
*/
