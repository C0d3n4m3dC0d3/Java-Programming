class Base extends Thread{
  public void run(){
    System.out.println("Hey! base_thread in the Buildin'");
    setName("base");

    for(int i = 0; i<5; i++)
      System.out.println(getName() + " runnin' " + i + " time(s)");
  }
}

class Esab extends Thread{
  public void run(){
    System.out.println("esab_thread here! Hello!");
    this.setName("esab");
    for(int i = 0; i<5; i++)
     System.out.println(getName() + " following up " + i + "time(s)");
  }
}

class Thread3{
  public static void main(String args[]){
    Base b = new Base();
    Esab e = new Esab();
    b.start();
    try{
      e.start();
      e.join();
    }
    catch(InterruptedException ie){}
  }
}
