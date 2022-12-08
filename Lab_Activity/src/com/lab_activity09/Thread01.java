package com.lab_activity09;

class EvenThread extends Thread
{
	public void run()	
	{
		System.out.println("the even  number are: ");
		for(int i=1;i<10;i++)
		{
	    	if(i%2 ==0)
	    	{
		     System.out.println(" "+i);
	    	}
	    }
	}
}
class OddThread extends Thread
{
	public void run()
	{
	    System.out.println("the odd number are :");
	    for(int j=0; j<10; j++)
	    {
	        if(j%2!=0)
    	    {
	           System.out.println(j);
	        }
	    }
     }
}
public class Thread01{
	public static void main(String args[]){
	EvenThread  evn=new EvenThread ();
	evn.run();
	OddThread odd= new OddThread(); 
	odd.run();
	}
}
	