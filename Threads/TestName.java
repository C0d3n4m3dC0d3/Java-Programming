class TestName extends Thread
{
  public void run()
  {
    System.out.println("I'm " + this.getName() + "!");
    System.out.println("And, I'm running!");
  }

  public static void main(String args[])
  {
    TestName t1 = new TestName();
    TestName t2 = new TestName();
    TestName t3 = new TestName();

    t1.start();
    t2.start();
    t3.start();

    System.out.println("Changing name of Thread1 . . . ");
    t1.setName("thREaD1");
    System.out.println("Name of Thread1 : " + t1.getName());
  }
}
