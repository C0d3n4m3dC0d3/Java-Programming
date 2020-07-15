class Test1 extends Thread
{
    public void run()
    {
	for(int i = 1; i<=5; i++)
	{
	  try
	  {
	   Thread.sleep(500);
	  }
	  catch(Exception e)
	  {
	   System.out.println(e);
	  }
	 System.out.println(i + " " + this);
        }
    }
    
    public static void main(String args[])
    {
	Test1 t1 = new Test1();
	Test1 t2 = new Test1();
	Test1 t3 = new Test1();
	t1.start();
	try
	{
	  t1.join(1500);
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
	t2.start();
	t3.start();
    }
}