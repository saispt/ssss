package seleniumips;

public class MultiThread extends Thread{

	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
	public class ThreadDemo
	{
		public void Main(String args[])
		{
			MultiThread t=new MultiThread();
			t.start();
			for(int i=1;i<10;i++)
			{
				System.out.println("Main Thread");
			
	}
}
}
}

