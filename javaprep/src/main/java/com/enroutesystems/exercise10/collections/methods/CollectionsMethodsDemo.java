package com.enroutesystems.exercise10.collections.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsMethodsDemo {
	
	
	public static void main(String[] args) {
		/*------------ Unmodifiable --------------*/
		System.out.println("------------ Unmodifiable Collection --------------");
		try {
			List<String> list = new ArrayList<String>();
			  
            // populate the list
            list.add("X-Ray");
            list.add("Yankee");
  
            // printing the list
            System.out.println("Initial list: " + list);
  
            // getting unmodifiable list
            // using unmodifiableCollection() method
            Collection<String> immutableCollection = Collections.unmodifiableCollection(list);
            
            System.out.println("Unmodifiable Collection cant add new values, if so, you'll give:");
            immutableCollection.add("New Value");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Unmodifiable List --------------");
		try {
			List<String> list = new ArrayList<String>();
			  
            // populate the list
            list.add("X-Ray");
            list.add("Yankee");
  
            // printing the list
            System.out.println("Initial list: " + list);
  
            // getting unmodifiable list
            // using unmodifiableCollection() method
            List<String> immutableList = Collections.unmodifiableList(list);
            
            System.out.println("Unmodifiable Collection cant add new values, if so, you'll give:");
            immutableList.remove( 0 );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*------------ binarySearch --------------*/		
		System.out.println("------------ binarySearch List --------------");
		
		List<Integer> list = new ArrayList<Integer>();
		  
        // populate the list
            list.add(15);
            list.add(16);
            list.add(30);
            list.add(16);
            list.add(15);
            list.add(16);
  
            // printing the list
        System.out.println("Initial list: " + list);
  
            // getting unmodifiable list
        // using unmodifiableCollection() method
        int index = Collections.binarySearch(list, 30);
          
        System.out.println("In list " + list + ", Position of 30 is:" + index);
           
		/*------------ checked --------------*/
        System.out.println("------------ checked --------------");
        // create arraylist       
        ArrayList<String> arlst = new ArrayList<String>();

        // populate the list
        arlst.add("Tango");
        arlst.add("Papa");
        arlst.add("Quebec");

        // create typesafe view of the collection
        Collection<String> tslst;
        tslst = Collections.checkedCollection(arlst, String.class);     

        System.out.println("The compiler will validate types when compiling from: " + tslst);
        
		/*------------ empty --------------*/
        System.out.println("------------ empty --------------");
        
        List<String> emptyListDemo = Collections.emptyList();
        
        try {
        	System.out.println("Empty list is an inmutable list with any value");
        	System.out.println("If we try to add new values to list we will get this: ");
			emptyListDemo.add("new value");
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
        
		/*------------ synchornized --------------*/
        System.out.println("------------ synchornized --------------");
        
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Runnable listOperations = () -> {
            syncCollection.addAll( java.util.Arrays.asList(1, 2, 3, 4, 5, 6) );
        };
        
        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();
        try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        System.out.println( "12 Is the value that list must have =" + (12 == syncCollection.size() ) );
        
		/*------------ sort --------------*/
        System.out.println("------------ sort --------------");
        List<String> items = new ArrayList<>();
 
        items.add("Sierra");
        items.add("Tango");
 
        Collections.addAll(items, "Foxtrot", "Bravo", "Mike");
        Collections.sort(items);
 
        for (String i : items) {
        	System.out.print( i + ", " );
		}
        System.out.println();
 
        // sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());
 
        // print the reverse order
        for (String i : items) {
        	System.out.print( i + ", " );
		}
	}

}
