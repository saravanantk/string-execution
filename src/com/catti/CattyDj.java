package com.catti;

import java.util.List;
import java.util.Vector;

public class CattyDj {
	
	private void sarwork() {
		System.out.println("sarowork");
	}
	private void print() {
		System.out.println("print");


	}
	
	


		public static void main(String[] args) {
			

			
			List v = new Vector<>();
			
			v.add(20);
			v.add(40);
			v.add(50);
			v.add(60);
			v.add(80);
			v.add(90);
			
			System.out.println(v);
			
			int size = v.size();
			System.out.println(size);
			
			Object get = v.get(5);
			System.out.println(get);
			
			v.clear();
			
		    v.add(2, 10);
		    System.out.println(v);
		    
		    v.set(5, 99);
		    System.out.println(v);
		    
		    v.remove(0);
		    System.out.println(v);
		    
		    boolean contains = v.contains(99);
		    System.out.println(contains);
		    
		    int indexof = v.indexOf(90);
		    System.out.println(indexof);
		    
		    int lastindexof = v.lastIndexOf(99);
		    System.out.println(lastindexof);
		    
		    v.clear();
		    System.out.println(v);
		    
		    boolean empty = v.isEmpty();
		    System.out.println(empty);
			
	
	
		}	
	
}
	

