class T1 extends Thread
{
  public void run()
  {
    System.out.println("Call Stack of Thread T1");
  }
}

class T2 extends Thread
{
  public void run()
  {
    System.out.println("Call Stack of Thread T2");
  }
}

class TestRun2
{
    public static void main(String[] args) {
      T1 t1 = new T1();
      T2 t2 = new T2();

      t1.run();
      t2.run();
    }
}


/*
  OUTPUT:
    Call Stack of Thread T1
    Call Stack of Thread T2

    There is no change in the order here, as both are teated as a normal obj
    and not a Thread object
*/
