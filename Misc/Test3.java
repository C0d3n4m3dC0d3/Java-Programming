class Tester extends Thread
{
  public void run()
  {
    System.out.println("\tThread is runnin'!\n");
  }
}

class Test3
{
 public static void main(String args[])
 {
   Tester t1 = new Tester();
   Tester t2 = new Tester();

   t1.start();
   t2.start();

   System.out.println("\t" + t1.getName() + "\n");
   System.out.println("\t" + t2.getName() + "\n");
   
   t1.setName("Kannadi Filo");
   t2.setName("Shahi Daaru");
  
   System.out.println("\tNew Name of Thread-0 :: " + t1.getName() + "\n");
   System.out.println("\tNew Name of Thread-1 :: " + t2.getName() + "\n");
 } 
}