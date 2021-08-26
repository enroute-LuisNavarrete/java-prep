package com.enroutesystems.exercise09.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		EntitySample es1 = new EntitySample(1, "Entity 1", "FADS830510HTSLPR01");
		EntitySample es2 = new EntitySample(2, "Entity 1", "FADS830510HTSLPR01");
		
		System.out.println( "Obj1 Contains : " + es1.toString() );
		System.out.println( "Obj2 Contains : " + es2.toString() );
		
		/**
		 * HashCode & Equals
		 * */
		System.out.println( "Obj1 equalsTo    Obj2          : " +   es1.equals(es2) 				   );
		System.out.println( "Obj1 hashCode == Obj2 hashCode : " + ( es1.hashCode() == es2.hashCode() ) );
		

		/**
		 * Set
		 * For uniques values
		 * */
		System.out.println("HashSet Example");
		Set<String> hashTest 	= new HashSet<String>();
		
		hashTest.add( "bravo"   );
		hashTest.add( "alfa"    );
		hashTest.add( "alfa"    );
		hashTest.add( "charlie" );
		
		System.out.println( hashTest );
		
		System.out.println("TreeSet Example");
		Set<String> treeTest 	= new TreeSet<String>();
		
		treeTest.add( "bravo"   );
		treeTest.add( "alfa"    );
		treeTest.add( "alfa"    );
		treeTest.add( "charlie" );
		
		System.out.println( treeTest );
		
		
		// SortedSet uses comparator
		System.out.println("TreeSet Example");
		SortedSet<String> sortedInterfaceTest 	= new TreeSet<String>();
		sortedInterfaceTest.add( "bravo"   );
		sortedInterfaceTest.add( "alfa"    );
		sortedInterfaceTest.add( "alfa"    );
		sortedInterfaceTest.add( "charlie" );
		
		System.out.println( sortedInterfaceTest );
		
		System.out.println("LinkedHashSet Example");
		Set<String> linkHashTest = new LinkedHashSet<String>();
		linkHashTest.add( "zulu"    );
		linkHashTest.add( "charlie" );
		linkHashTest.add( "alfa"    );
		linkHashTest.add( "alfa"    );
		
		System.out.println( linkHashTest  );
		//Comparator / Comparable
		System.out.println("Comparable examples");
		List<AlphabetDefaulOrderComparable> adoc = new ArrayList<AlphabetDefaulOrderComparable>();
		adoc.add( new AlphabetDefaulOrderComparable("Oscar", 1) );
		adoc.add( new AlphabetDefaulOrderComparable("Golfo", 5) );
		adoc.add( new AlphabetDefaulOrderComparable("Alfa", 3) );
		Collections.sort( adoc );
		adoc.forEach(e -> System.out.println( e.toString() ));
		
		/**
		 * Set
		 * For uniques values
		 * */ 
		System.out.println("Comparator examples");
		List<AlphabetCustomSortComparator> acsc = new ArrayList<AlphabetCustomSortComparator>();
		acsc.add( new AlphabetCustomSortComparator("Oscar", 1) );
		acsc.add( new AlphabetCustomSortComparator("Golfo", 5) );
		acsc.add( new AlphabetCustomSortComparator("Alfa", 3) );
		Comparator<AlphabetCustomSortComparator> employeeNameComparator = Comparator.comparing(AlphabetCustomSortComparator::getId);
		Collections.sort( acsc, employeeNameComparator  );
		acsc.forEach(e -> System.out.println(e.toString() ));
		
		/**
		 * Map
		 * */ 
		System.out.println();
		System.out.println();
		System.out.println();
		/*------------HashSet implementation----------------*/
		System.out.println("HashSet Example");
		Map<Integer, String> hm=new HashMap<Integer, String>();  
		//adding elements to the HashMap  
		hm.put(9, "Romeo");  
		hm.put(12, "Bravo");  
		hm.put(6, "Golfo");  
		hm.put(19, "White");  
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}  
		/*------------TreeMap implementation----------------*/  
		
		System.out.println("TreeMap Example");
		Map<Integer, String> tm=new TreeMap<Integer, String>();  
		//adding elements to the TreeMap  
		tm.put(9, "Romeo");  
		tm.put(12, "Bravo");  
		tm.put(6, "Golfo");  
		tm.put(19, "White");  
		for (Map.Entry<Integer, String> entry : tm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		/*------------HashTable implementation----------------*/
		// SortedSet uses comparator
		System.out.println("HashTable Example");
		// Hashtable<K, V>
		Hashtable<Integer, String> hashTbTest 	= new Hashtable<Integer, String>();
		hashTbTest.put( 1, "bravo"   );
		hashTbTest.put( 4, "alfa"    );
		hashTbTest.put( 4, "alfa"    );
		hashTbTest.put( 5, "charlie" );
		
//		hashTbTest.forEach(System.out::println);
		for (Map.Entry<Integer, String> hashMapReader : hashTbTest.entrySet()) {
			System.out.println(hashMapReader);
		}
		System.out.println( hashTbTest );
		
		
		System.out.println("LinkedHashSet Example");
		
		EnumMap<EnumMapKeys, String> enumMapTest = new EnumMap<>(EnumMapKeys.class);
		enumMapTest.put( EnumMapKeys.KEY_ONE  , "zulu"    );
		enumMapTest.put( EnumMapKeys.KEY_THREE, "charlie" );
		enumMapTest.put( EnumMapKeys.KEY_THREE, "alfa"    );
		enumMapTest.put( EnumMapKeys.KEY_TWO  , "alfa"    );
		
		for (Map.Entry<EnumMapKeys, String> enumMapTestReader : enumMapTest.entrySet()) {
			System.out.println(enumMapTestReader);
		}
		System.out.println( enumMapTest  );
		
		System.out.println("LinkedHashSet Example");
		LinkedHashMap<String, String> linkHashMapTest = new LinkedHashMap<String, String>();
		linkHashMapTest.put("One", "Zulu");
		linkHashMapTest.put("Three", "Tango");
		linkHashMapTest.put("Three", "Tango");
		linkHashMapTest.put("Two", "Charlie");
		
		Set entrySet = linkHashMapTest.entrySet();
		  
        // Obtain an Iterator for the entries Set
        Iterator it = entrySet.iterator();  
        while (it.hasNext()) {
        	System.out.println(it.next());
        }
		
		/**
		 * List
		 * */
        System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Array List Example");
		List<String> l = new ArrayList<String>();
		System.out.println( "Total size " + l.size() );
		l.add("alfa");
		l.add("sierra");
		l.add("delta");
		System.out.println( "adding 4 values more " + l.size() );
		l.add("delta");
		l.add("tango");
		l.add("golfo");
		System.out.println( "adding 4 values more " + l.size() );
		
		System.out.println("Vector Example");
		Vector v = new Vector(5, 5);
		System.out.println( "Total size " + v.size() + " capacity " + v.capacity());
		v.addElement("alfa");
		v.addElement("sierra");
		v.addElement("delta");
		System.out.println( "adding 4 values more " + v.size() + " capacity " + v.capacity());
		v.addElement("delta");
		v.addElement("tango");
		v.addElement("golfo");
		System.out.println( "adding 4 values more " + v.size() + " capacity " + v.capacity());
		
		System.out.println("Linked List Example");
		LinkedList<String> ll = new LinkedList<String>();

	    ll.add("Alfa");
	    ll.add("Bravo");
	    ll.addLast("Charlie");
	    ll.addFirst("Ddelta");
	    ll.add(2, "Echo");
	
	    System.out.println(ll);
	}

}


class EntitySample {
	
	private int id;
	private String name;
	private String curp;
	
	public EntitySample(int id, String name, String curp) {
		this.setId(id);
		this.setName(name);
		this.setCurp(curp);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id="+id+",name="+name+",curp="+curp+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof EntitySample) ) return false;
		EntitySample es = (EntitySample) obj;
		return 
				   this.id     ==    es.id     ; 
//				&& this.name.equals( es.name ) 
//				&& this.curp.equals( es.curp );
	}
	
	@Override
	public int hashCode() {
		return this.id + 7 * (this.name.hashCode() + this.curp.hashCode());
	}
	
}

/**
 * Natural Default Order
 * */
class AlphabetDefaulOrderComparable implements Comparable<AlphabetDefaulOrderComparable> {
	private String name;
	private int id;
	
	public AlphabetDefaulOrderComparable(String val, int id) {
		this.name = val;
		this.id = id;
	}
	@Override
	public int compareTo(AlphabetDefaulOrderComparable arg0) {
		return this.name.compareTo(arg0.name);
	}
	
	public String getName() {
		return this.name;
	} 
	public int getId() {
		return this.id;
	} 
	@Override
	public String toString() {
		return "[id="+id+",name="+name+"]";
	}
}

/**
 * Comparator Customized sorting
 * */
class AlphabetCustomSortComparator implements java.util.Comparator<AlphabetCustomSortComparator> {
	private String name;
	private int id;

	public AlphabetCustomSortComparator(String val, int id) {
		this.name = val;
		this.id = id;
	}
	@Override
	public int compare(AlphabetCustomSortComparator arg0, AlphabetCustomSortComparator arg1) {
		int result = arg0.name.compareTo(arg1.name);
		if(result != 0) return result;
		return 0;
	}
	public String getName() {
		return this.name;
	} 
	public int getId() {
		return this.id;
	} 
	@Override
	public String toString() {
		return "[id="+id+",name="+name+"]";
	}
}

enum EnumMapKeys {
	KEY_ONE, KEY_TWO, KEY_THREE
}