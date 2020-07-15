class TestRun1 extends Thread
{
  public void run()
  {
    System.out.println("Thread Running...");
  }
  public static void main(String args[])
  {
    TestRun1 t = new TestRun1();
    t.run(); //Gives the same output as t.start()
             //Because, there is only one thread.
  }

}

/*
  OUTPUT:
  Thread Running...
*/
