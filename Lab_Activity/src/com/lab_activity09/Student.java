package com.lab_activity09;

import java.util.Map;
import java.util.TreeMap;

/*import java.util.*;    
class Student
{    
	int id;    
	String name,course;    
	    
		public Student(int id, String name,String course) 
		{    
		    this.id = id;    
		    this.name = name;
			this.course=course;    
		}    
}
 
public class Main{
public static void main(String args[])
{
	Map<Integer,Student> std=new TreeMap<Integer,Student>();
	Student s1=new Student(101,"avinash","BCA");
	Student s2=new Student(102,"Jagadeesha","BCA");
	Student s3=new Student(103,"Manju","BSc");
	Student s4=new Student(104,"balu","B.tech");
	
	std.put(1,s1);
	std.put(2,s2);
	std.put(3,s3);
	std.put(4,s4);
	
	for(Map.Entry<Integer,Student>entry:std.entrySet())
{
	int key=entry.getKey();
	Student s=entry.getValue();
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
System.out.println(std.firstEntry());
System.out.println(std.lastEntry());
}
}*/

public class Student{
 public static void main(String args[]){
	Map<Integer,String> std01 = new TreeMap<Integer,String>();
	std01.put(1001,"BCA");
	std01.put(1002,"BSc");
	
	System.out.println(std01);
	
	Map<Integer,String> std02 = new TreeMap<Integer,String>();
	std02.put(1003,"M.tech");
	std02.put(1004,"B.tech");
	
	System.out.println(std02);
	
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
//Find the Highest value and Lowest value
//System.out.printlb("the First value is: "+std01.firstKey());
//System.out.printlb("the First value is: "+std01.lastKey());
}
}

