package com.enroutesystems.modifiers;

import com.enroutesystems.modifiers.paquete.DefaultClassDifferentPackage;

public class DefaultClass extends ParentDefaultClass {
	 String defaultVariable = "yes ";
	
	
	public String access2Sameclass() {
		return "Access in the Same Class for Methods: " + this.getDefaultVariable() + " Variables: " + defaultVariable
				+ " SOURCE: " + this.getClass().getName();
	}
	
	 String getDefaultVariable() {
		return "yes ";
	}
	
	public String access2SamePackage() {
		DefaultClassNotHeritaged defaultClassNotHeritaged = new DefaultClassNotHeritaged();
		return "Access in the Same package for Methods: " + defaultClassNotHeritaged.getDefaultMethod() + " Variables: " + defaultClassNotHeritaged.defaultVariable
				+ " SOURCE: " + defaultClassNotHeritaged.getSource();
	}
	
	public String access2Subclass() {
		ParentDefaultClass parentDefaultClass = new ParentDefaultClass();
		return "Access in SubClass for Methods: " + parentDefaultClass.getDefaultMethod() + " Variables: " + parentDefaultClass.defaultVariable
				+ " SOURCE: " + parentDefaultClass.getSource();
	}
	
	public String access2Anywhere() {
		DefaultClassDifferentPackage defaultClassDifferentPackage = new DefaultClassDifferentPackage();
		return "Access Anywhere for methods & variables are not posible it trows java.lang.Error: Unresolved compilation problem" 
		+ " SOURCE: " + defaultClassDifferentPackage.getSource();
	}
}

class ParentDefaultClass {
	
	String defaultVariable = "yes ";
	
	String getDefaultMethod() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

class DefaultClassNotHeritaged {
	
	String defaultVariable = "yes ";
	
	String getDefaultMethod() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}


