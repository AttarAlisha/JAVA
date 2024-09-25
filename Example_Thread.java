import java.io.*;


class OneThread extends Thread{

	public void run()
	{
		for(int i =1; i<=5;i++)
		{
			System.out.println("Thread ONE : "+i);
				try{
					Thread.sleep(1000);
	  				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}	
	}
}

class SecondThread extends Thread{

	public void run()
	{
		for(int i =1; i<=5;i++)
		{
			System.out.println("Thread Two : "+i);
		
				try{
					Thread.sleep(1000);
	  				} 
			catch(Exception e)
			{
				System.out.println(e);
			}
		}	
	}
}


public class Example_Thread{
	public static void main(String args[])
	{
		OneThread A= new OneThread();
		SecondThread B= new SecondThread();

		A.start();
		B.start();
		
	}

}
