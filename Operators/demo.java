import java.util.*;
class mt extends Thread
{
	 static Thread m;
	public void run()
	{
		try
		{
			m.join();
		}
		catch(InterruptedException e)
		{
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
	
		
		
	
}
class demo
{
	public static void main(String[] args)throws InterruptedException
	{
		mt.m=Thread.currentThread();
		mt t= new mt();
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("parent thread");
			Thread.sleep(2000);
		}
	}
}
		