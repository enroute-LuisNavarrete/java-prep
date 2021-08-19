package com.enroutesystems.keywords;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

public class KeywordsClass {
	
	public  List<EntityKeywords> 	transientTest;
    private int 					countSynchronizedTests = 0;

    public List<EntityKeywords> getList4TestTrasient() {
    	transientTest = new ArrayList<EntityKeywords>();
    	transientTest.add( new EntityKeywords(1, true,  "Alfa"   ) );
    	transientTest.add( new EntityKeywords(2, false, "Bravo"  ) );
    	transientTest.add( new EntityKeywords(3, false, "Charlie") );
    	
    	return transientTest;
    }
    
    public int countSynchronizedTests() {
    	synchronized(this) {
    		countSynchronizedTests++;
    		System.out.println(countSynchronizedTests);
    		return countSynchronizedTests;
    	}
//    	return 
    }
}


class EntityKeywords implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Transient
	private int id;
	private boolean status;
	private String  name;
	
	public EntityKeywords(int id, boolean status, String name) {
		this.id = id;
		this.status = status;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}