package com.enroutesystems.modifiers;

import com.enroutesystems.modifiers.paquete.PrivateClassDifferentPackage;

public class PrivateClass extends ParentPrivateClass {

	private String privateVariable = "yes";
	
	
	public String access2Sameclass() {
		return "Access in the Same Class for Methods: " + this.getPrivateVariable() + " Variables: " + privateVariable
				+ " SOURCE: " + this.getClass().getName();
	}
	
	private String getPrivateVariable() {
		return "yes";
	}
	
	public String access2SamePackage() {
		PrivateClassNotHeritaged privateClassNotHeritaged = new PrivateClassNotHeritaged();
		return  "Access Anywhere for methods & variables are not posible it trows java.lang.Error: Unresolved compilation problem" 
		+ " SOURCE: " + privateClassNotHeritaged.getSource();
	}
	
	public String access2Subclass() {
		ParentPrivateClass parentPrivateClass = new ParentPrivateClass();
		return  "Access Anywhere for methods & variables are not posible it trows java.lang.Error: Unresolved compilation problem" 
		+ " SOURCE: " + parentPrivateClass.getSource();
	}
	
	public String access2Anywhere() {
		PrivateClassDifferentPackage privateClassDifferentPackage = new PrivateClassDifferentPackage();
		return  "Access Anywhere for methods & variables are not posible it trows java.lang.Error: Unresolved compilation problem" 
		+ " SOURCE: " + privateClassDifferentPackage.getSource();
	}
	
}
class ParentPrivateClass {
	
	private String privateVariable = "yes";
	
	private String getPrivateMethod() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

class PrivateClassNotHeritaged {
	
	private String privateVariable = "yes";
	
	private String getPrivateMethod() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

