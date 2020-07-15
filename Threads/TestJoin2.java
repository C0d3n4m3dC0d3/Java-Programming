class JT1 extends Thread{
  String n;
  JT1(String N) {
    n = N; }
  public void run() {
    for(int i = 0; i<5; i++) {
      try  {
        Thread.sleep(500);  }
      catch(InterruptedException e) {
        System.out.println(e); }
      System.out.println(n + " " + i);
    }
  }
}

class TestJoin2  {
  public static void main(String[] args) {
    JT1 j1 = new JT1("T1");
    JT1 j2 = new JT1("T2");
    JT1 j3 = new JT1("T3");

    j1.start();
    try {
      j1.join(1500); }
    catch(Exception e) {
      System.out.println(e); }
    j2.start();
    j3.start();
  }
}
