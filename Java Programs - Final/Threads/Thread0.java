class Base extends Thread{
  public void run(){
    System.out.println("Created thread by extending Thread class!!");
  }
}

class Thread0{
  public static void main(String args[]){
    Base t1 = new Base();
    t1.start();
  }
}
