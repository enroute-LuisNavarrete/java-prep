package com.enroutesystems.modifiers;

import com.enroutesystems.modifiers.paquete.PublicClassDifferentPackage;

public class PublicClass extends ParentPublicClass {

	public String protectedVariable = "yes";
	
	
	public String access2Sameclass() {
		return "Access in the Same Class for Methods: " + this.getPublicVariable() + " Variables: " + protectedVariable
				+ " SOURCE: " + this.getClass().getName();
	}
	
	public String getPublicVariable() {
		return "yes";
	}
	
	public String access2SamePackage() {
		PublicClassNotHeritaged publicClassNotHeritaged = new PublicClassNotHeritaged();
		return "Access in the Same package for Methods: " + publicClassNotHeritaged.getPublicMethod() + " Variables: " + publicClassNotHeritaged.publicVariable
				+ " SOURCE: " + publicClassNotHeritaged.getSource();
	}
	
	public String access2Subclass() {
		ParentPublicClass parentPublicClass = new ParentPublicClass();
		return "Access in SubClass for Methods: " + parentPublicClass.getPublicMethod() + " Variables: " + parentPublicClass.publicVariable
				+ " SOURCE: " + parentPublicClass.getSource();
	}
	
	public String access2Anywhere() {
		PublicClassDifferentPackage publicClassDifferentPackage = new PublicClassDifferentPackage();
		return "Access in SubClass for Methods: " + publicClassDifferentPackage.getPublicVariable() + " Variables: " + publicClassDifferentPackage.publicVariable
				+ " SOURCE: " + publicClassDifferentPackage.getSource();
	}
	
}
class ParentPublicClass {
	
	public String publicVariable = "yes";
	
	public String getPublicMethod() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

class PublicClassNotHeritaged {
	
	public String publicVariable = "yes";
	
	public String getPublicMethod() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

