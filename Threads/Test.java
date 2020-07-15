class Test extends Thread
{	
	String tno;
	Test(String t)
	{
		tno = t;
	}
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
	  		System.out.println("Exception is :: " + e);
	  	}
	  	System.out.println(i + " " + tno);
	  }
	}
	
	public static void main(String args[])
	{
	  String t1n = new String("Thread 1");
		String t2n = new String("Thread 2");
		String t3n = new String("Thread 3");
		
		Test t1 = new Test(t1n);
		Test t2 = new Test(t2n);
		Test t3 = new Test(t3n);		
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println("Exception is :: " + e);
		}
		t2.start();
		t3.start();
	}
}
