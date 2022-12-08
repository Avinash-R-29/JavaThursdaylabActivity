package com.lab_activity09;

import java.util.TreeSet;

public class TreeSet01 {
	public static void main(String args[]){  
		  TreeSet<String> color = new TreeSet<String>();  
		        color .add("White");  
		      	color .add("Pink");  
		        color .add("Red");  
		        color .add("Blue");  
		        color .add("Green");  
		         System.out.println("Initial Color : "+color );  
		           
		         System.out.println("Reverse color : "+color .descendingSet());//Reverse Order    
		         System.out.println("Head color : "+color .headSet("Red",true));  
		         System.out.println("Last color: " + color.pollFirst());
			 System.out.println("First color:" + color.pollLast());
			 
			TreeSet<String> color02 = new TreeSet<String>();
			color02 .add("White01");  
		      	color02 .add("Pink01");  
		        //color02 .add("Red01");  
		        //color02 .add("Blue01");  
		        //color02 .add("Gree01");
			color.addAll(color02);
		System.out.println(color);  
		System.out.println(color02);  
		color02=(TreeSet<String>)color.comparator();
		System.out.println("Tree set comparator:" +color02);
		}  
		}

