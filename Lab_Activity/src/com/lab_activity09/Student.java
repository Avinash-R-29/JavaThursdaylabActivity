package com.lab_activity09;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.*; 
/*
class Studen
{    
	int id;    
	String name,course;    
	    
		public Studen(int id, String name,String course) 
		{    
		    this.id = id;    
		    this.name = name;
			this.course=course;    
		}    
}
 
public class Student{
public static void main(String args[])
{
	Map<Integer,Studen> std=new TreeMap<Integer,Studen>();
	Studen s1=new Studen(101,"avinash","BCA");
	Studen s2=new Studen(102,"Jagadeesha","BCA");
	Studen s3=new Studen(103,"Manju","BSc");
	Studen s4=new Studen(104,"balu","B.tech");
	
	std.put(1,s1);
	std.put(2,s2);
	std.put(3,s3);
	std.put(4,s4);
	
	for(Entry<Integer, Studen> entry:std.entrySet())
{
	int key=entry.getKey();
	Studen s=entry.getValue();
	System.out.println(key+"Details");
	System.out.println(s.id+" "+s.name+" "+s.course);
}

//Check the Given Key is contains or not

if (std.containsKey(2))
    {
    	System.out.println("the given key is contains");
    }
    else
    {
    	System.out.println("the given key doesn't contains");
    }

//Check the Given value is contains or not

if(std.containsValue("Avinash"))
    {
    	System.out.println("the given key value is contains");
    }
    else
    {
    	System.out.println("the given key value doesn't contains");
    }

//Display First value
System.out.println(((TreeMap<Integer, Studen>) std).firstEntry());
System.out.println(((TreeMap<Integer, Studen>) std).lastEntry());
}
}
*/
///*

public class Student{
 public static void main(String args[]){
	Map<Integer,String> std01 = new TreeMap<Integer,String>();
	std01.put(1001,"BCA");
	std01.put(1002,"BSc");
	for(Map.Entry m:std01.entrySet())
	{
	System.out.println(m.getKey()+" "+m.getValue());
	}
	
	Map<Integer,String> std02 = new TreeMap<Integer,String>();
	std02.put(1003,"M.tech");
	std02.put(1004,"B.tech");
	for(Map.Entry m1:std02.entrySet())
	{
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
	//Add the one set to another
	std01.putAll(std02);
		System.out.println("After the copied elements: "+std01);

	//Check the value and key elements contains Or not
		if(std01.containsKey(1003))
	{
		System.out.println("The given key is contains");
	}
	else
	{
		System.out.println("The given key is not contains");
	}

	if (std01.containsValue("B.tech"))
	{
		System.out.println("The given key is contains");
	}
	else
	{
		System.out.println("The given key is not contains");
	}
		//using replace() and removed specific given key
		System.out.println("the value is removed: "+std01.remove(1002));
		System.out.println("the value is replaced: "+std01.replace(1001,"Bcom"));

		//Find the Highest value and Lowest value
		System.out.println(std01);
		System.out.println("the First value is: "+((TreeMap<Integer, String>) std01).pollFirstEntry());
		System.out.println("the Last value is: "+((TreeMap<Integer, String>) std01).pollLastEntry());
		
 }
}
//*/
