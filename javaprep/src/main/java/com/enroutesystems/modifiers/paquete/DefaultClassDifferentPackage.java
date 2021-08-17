package com.enroutesystems.modifiers.paquete;

public class DefaultClassDifferentPackage {
		
	String protectedVariable = "No";

	String getProtectedVariable() {
		return "no ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
	
}

