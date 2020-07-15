class TestRun3 extends Thread
{
  String n;
  TestRun3(String N) {
    n = N; }

  public void run() {
    for(int i = 1; i<=5; System.out.println(i++)) {
      try {
        System.out.print(n + " ");
        Thread.sleep(500); }
      catch (InterruptedException e) {
        System.out.println(e); }
    } }
  public static void main(String[] args) {
    TestRun3 t1 = new TestRun3("T1");
    TestRun3 t2 = new TestRun3("T2");
    t1.run();
    t2.run();
  }
}

/*
OUTPUT:
  T1 1
  T1 2
  T1 3
  T1 4
  T1 5
  T2 1
  T2 2
  T2 3
  T2 4
  T2 5
*/
