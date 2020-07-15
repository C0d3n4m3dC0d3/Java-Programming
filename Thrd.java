/*
  29. Write a program to explain multithreading with the use of multiplication table.
  Three threads must be defined. Each one must create one multiplication table.
*/

class TrdMul extends Thread
{
  int num;
  TrdMul(int n){
    num = n;
  }
  public void run()
  {
    int i, ans;
    for(i = 1; i<=10; i++)
    {
      ans = num*i;
      System.out.println(num + " x " + i + " = " + ans);
    }
  }
}

class Thrd
{
  public static void main(String[] args) {
    TrdMul m1 = new TrdMul(1);
    TrdMul m2 = new TrdMul(3);
    TrdMul m3 = new TrdMul(5);

    m3.start();
    try {
      m2.start();
      m2.join(); }
    catch(Exception e) {
      m1.start();
      System.out.println(e); }

  }
}
