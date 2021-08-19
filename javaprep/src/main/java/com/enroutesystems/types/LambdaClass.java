package com.enroutesystems.types;

import java.util.ArrayList;

public class LambdaClass <K, V>  extends ArrayList implements LambdaInterface<K, V> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private K lambdaKey;
    private V lambdaValue;
    
    public LambdaClass() {
    }

    public LambdaClass(K key, V value) {
		this.lambdaKey = key;
		this.lambdaValue = value;
    }

    public K getKey()	{ 
    	return lambdaKey;   
    }
    
    public V getValue() {
    	return lambdaValue; 
    }
 
    public String toString() {
    	return "[lambdaKey=" + this.lambdaKey +  ",lambdaValue=" + this.lambdaValue +  "]";
    }
	
}

interface LambdaInterface<K, V> {
	
	public K getKey();
	public V getValue();
	
}