package com.enroutesystems.modifiers.paquete;

public class ProtectedClassDifferentPackage {
	protected String protectedVariable = "No";
	
	protected String getProtectedVariable() {
		return "no ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
}
