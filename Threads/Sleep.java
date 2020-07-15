class Multi2 extends Thread {
  public void run () {
    for( int i = 1; i<=5; i++) {
      try {
        Thread.sleep(1500); }
      catch (InterruptedException ie){
        System.out.println(ie); }
      System.out.println("I slept " + i + " time" + (i == 1? "!" : "s!"));
    }
  }
}

class Sleep {
 public static void main(String args[]) {
  Multi2 m1 = new Multi2();
  Multi2 m2 = new Multi2();

  m1.start();
  m2.start();
 }
}
