package com.lab_activity08_ques_1_2_and_3;

public class ThreadDemo extends Thread {
	public void run()
	{
		String str[]={"java","is","hot"};
		for (int i=0;i<str.length;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(str[i]);
		}
		//System.out.println("thread is running");
	}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2= new ThreadDemo();
		t1.start();
		boolean t1IsAlive=true;
		boolean t2IsAlive=true;
		if(t1IsAlive)
		{
			System.out.println("Thread 1 is alive");
		}
		else
			System.out.println("Thread 1 is dead");
		
		t2.start();
		if(t2IsAlive)
		{
			System.out.println("Thread 2 is alive");
		}
		else
			System.out.println("Thread 2 is dead");
		
		//t1.run();
		//t2.run();
	}

}
