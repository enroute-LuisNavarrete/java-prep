package com.enroutesystems.modifiers.paquete;

public class PrivateClassDifferentPackage {
	private String privateVariable = "yes";
	
	private String getPrivateMethod() {
		return "Yes ";
	}
	
	public String getSource() {
		return this.getClass().getName();
	}
}
