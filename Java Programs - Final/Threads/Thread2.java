class Base extends Thread{
  public void run(){
    for(int i = 0; i<10; i++)
    {
      System.out.println(this.getName() + " " + i);
      try{
        sleep(500);
      }
      catch(InterruptedException e){}
    }
  }
}

class Base2 extends Thread{
  public void run(){
    for(int i = 11; i<=15; i++){
      System.out.println(this.getName() + " " + i);
      try{
        sleep(1000);
      }
    catch(InterruptedException e) {}
    }
  }
}

class Thread2{
 public static void main(String args[]){
  Base t1 = new Base();
  Base2 t2 = new Base2();
  t1.start();
  t2.start();
 }
}
