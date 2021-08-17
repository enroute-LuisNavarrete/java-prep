package com.enroutesystems.modifiers;

import com.enroutesystems.modifiers.paquete.ProtectedClassDifferentPackage;

public class ProtectedClass extends ParentProtectedClass  {
	
	protected String protectedVariable = "yes";
	
	
	public String access2Sameclass() {
		return "Access in the Same Class for Methods: " + this.getProtectedVariable() + " Variables: " + protectedVariable
				+ " SOURCE: " + this.getClass().getName();
	}
	
	protected String getProtectedVariable() {
		return "yes";
	}
	
	public String access2SamePackage() {
		ProtectedClassNotHeritaged protectedClassNotHeritaged = new ProtectedClassNotHeritaged();
		return "Access in the Same package for Methods: " + protectedClassNotHeritaged.getProtectedVariable() + " Variables: " + protectedClassNotHeritaged.protectedVariable
				+ " SOURCE: " + protectedClassNotHeritaged.getSource();
	}
	
	public String access2Subclass() {
		ParentProtectedClass protectedClass = new ParentProtectedClass();
		return "Access in SubClass for Methods: " + protectedClass.getProtectedVariable() + " Variables: " + protectedClass.protectedVariable
				+ " SOURCE: " + protectedClass.getSource();
	}
	
	public String access2Anywhere() {
		ProtectedClassDifferentPackage protectedClassDifferentPackage = new ProtectedClassDifferentPackage();
		return "Access Anywhere for methods & variables are not posible it trows java.lang.Error: Unresolved compilation problem" 
					+ " SOURCE: " + protectedClassDifferentPackage.getSource();
	}
	
	
	
}

class ParentProtectedClass {
	
	protected String protectedVariable = "yes";
	
	protected String getProtectedVariable() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

class ProtectedClassNotHeritaged {
	
	protected String protectedVariable = "yes";
	
	protected String getProtectedVariable() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

