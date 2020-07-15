class Base implements Runnable{
  public void run(){
    System.out.println("Created thread by implementing Runnable interface!");
  }
}

class Thread1{
  public static void main(String args[]){
    Base b = new Base();
    Thread t = new Thread(b);
    t.start();
  }
}
