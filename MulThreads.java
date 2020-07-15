/*29. Write a program to explain multithreading with the use of multiplication table.
  Three threads must be defined. Each one must create one multiplication table.*/

  class Multi1 extends Thread {
    public void run()  {
      int n = 2;
      System.out.println("Multiplication table of 2");
      for(int i = 1; i<=10; i++)  {
        System.out.println(n + " x " + i + " = " + (n*i));
      }System.out.println();
    } }
  class Multi2 extends Thread {
    public void run()  {
      int m = 4;
      System.out.println("Multiplication table of 4");
      for(int i = 1; i<=10; i++)  {
        System.out.println(m + " x " + i + " = " + (m*i));
      }System.out.println();
    } }
  class Multi3 extends Thread {
    public void run()  {
      int o = 9;
      System.out.println("Multiplication table of 9");
      for(int i = 1; i<=10; i++)  {
        System.out.println(o + " x " + i + " = " + (o*i));
      }System.out.println();
     } }
  class MulThreads  {
    public static void main(String args[])  {
      Multi1 l = new Multi1();
      Multi2 m = new Multi2();
      Multi3 n = new Multi3();
      l.start();
      try{
        l.join();
        m.start();
        m.join();
      }
      catch (InterruptedException e) {
        System.out.println(e);
      }
      n.start();
    } }
