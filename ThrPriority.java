/*
  30. Write a program to illustrate thread priority.
*/

class ThrPriority extends Thread{

  public void run()
  {
    System.out.println("Runnin with priority " + currentThread().getPriority());
  }
  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();
    Test t3 = new Test();

    t1.setPriority(MIN_PRIORITY);
    t3.setPriority(MAX_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
  }
}
