package com.javabrains;

public class ThreadDemoTest {

	public static void main(String[] args) {

		new ThreadDemo();
		try 
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("In main thread "+i);
				Thread.sleep(500);
			} 
		}catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Exiting main thread");
	}

}
