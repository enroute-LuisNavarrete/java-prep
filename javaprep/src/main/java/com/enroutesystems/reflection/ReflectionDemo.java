package com.enroutesystems.reflection;

import java.util.Arrays;

public class ReflectionDemo {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.enroutesystems.reflection.ReflectionTarget");
			
			System.out.println( "Linsting all the constructors: " + 
					Arrays.toString(c.getConstructors()) );
			
			System.out.println( "Linsting all the Methods (inharited methods include): " + 
					Arrays.toString(c.getMethods()) );
			
			System.out.println( "Linsting all the Methods: " + 
					Arrays.toString(c.getDeclaredMethods()) );
			
			System.out.println( "Linsting all the Methods: " + 
					Arrays.toString(c.getFields()) );
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}


class ReflectionTarget extends ParentReflectionDemo {
	
	Integer 			id;
	protected 	int 	protectedVariable;
	private 	String 	privateVariable;
	final 		String 	finalVariable = "Value";
	static 		int 	staticVariable;
	String 				name;
	
	public ReflectionTarget() {
		
	}
	
	public ReflectionTarget(int temp) {
		
	}
	
	public ReflectionTarget(String temp) {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getProtectedVariable() {
		return protectedVariable;
	}
	public void setProtectedVariable(int protectedVariable) {
		this.protectedVariable = protectedVariable;
	}
	public String getPrivateVariable() {
		return privateVariable;
	}
	public void setPrivateVariable(String privateVariable) {
		this.privateVariable = privateVariable;
	}
	public static int getStaticVariable() {
		return staticVariable;
	}
	public static void setStaticVariable(int staticVariable) {
		ReflectionTarget.staticVariable = staticVariable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFinalVariable() {
		return finalVariable;
	}
	
}

class ParentReflectionDemo {
	
	public void privateMethodFromParentClass() {
		
	}
}