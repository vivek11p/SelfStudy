package com.javabrains;

public class ThreadDemo extends Thread{
	
	public ThreadDemo()
	{
		System.out.println("Child thread ");
		Thread t=new Thread(this,"Mythread");
		t.run();
	}
	
	/*public void run()
	{
		System.out.println("Hello");
		try 
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("In child thread "+i);
				Thread.sleep(500);
			} 
		}catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Exiting child thread");
	}*/
	
	/*public void start()
	{
		System.out.println("Trapped");
		run();
	}*/

}
